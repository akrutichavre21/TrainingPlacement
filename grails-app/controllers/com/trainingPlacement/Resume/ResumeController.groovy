package com.trainingPlacement.Resume
import com.trainingPlacement.SpringSecurity.*

import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.UserDetails.UserDetails
import com.trainingPlacement.Profile.Profile

class ResumeController {

    def springSecurityService

    @Secured(['permitAll'])
    def index(){
        def userinstance = User.get(springSecurityService.currentUser.id)
        println "userInst: "+userinstance

        def uid= User.get(userinstance.id)
        println "uid:"+uid.id

        def profileinstance = Profile.findByUser(uid)
        println "profileInst: "+profileinstance.id

        def pid= Profile.get(profileinstance.id)
        println "pid:" +pid.id

        def userDetail = UserDetails.findByProfile(pid)
        render (view:'index' , model:[abc:userDetail])
    }

    def save(String r_address,String r_fathername,String r_mothername,String r_achievments,String r_hobbies,String r_biodata,Integer r_twelfth,Integer r_tenth, Integer r_alivebacklog) {

        println r_tenth
        println params.r_agg

        def userInstance = User.get(springSecurityService.currentUser.id)
        println userInstance
        println "Ye value btao"+ userInstance.id
        def uid= User.get(userInstance.id)
        println uid
        def profileInstance = Profile.findByUser(uid)
        println "ID bata"+profileInstance
        println "Naam bata"+profileInstance.fullName

        UserDetails newInstance =new UserDetails([
                address:"${r_address}",
                aggregate:params.r_agg,
                fatherName:"${r_fathername}",
                motherName:"${r_mothername}",
                achievements:"${r_achievments}",
                hobbies:"${r_hobbies}",
                twelfthPercentage:r_twelfth,
                tenthPercentage: r_tenth,
                aliveBacklog:r_alivebacklog,
                bioData:"${r_biodata}",
                profile: profileInstance.id
        ])
        println "add:"+newInstance.address
        println "agg:"+newInstance.aggregate
        println "mother:"+newInstance.motherName
        println "father:"+newInstance.fatherName
        println "bio:"+newInstance.bioData
        println "ach:"+newInstance.achievements
        println "hobby:"+newInstance.hobbies
        println "12:"+newInstance.twelfthPercentage
        println "10:"+newInstance.tenthPercentage
        println "backlog:"+newInstance.aliveBacklog
        newInstance.save()

        redirect(controller:'resume',action:'index')
    }
    @Secured(['permitAll'])
    def update(String s_fullname,String r_address,String r_agg,String r_fathername,String r_mothername,String r_achievments,String r_hobbies,String r_biodata,Integer r_twelfth,Integer r_tenth, Integer r_alivebacklog,String id){
      println id
      def updateinstance= UserDetails.get(Integer.parseInt(id))
        println updateinstance
        updateinstance.address= r_address
        updateinstance.aggregate= Integer.parseInt(r_agg)
        updateinstance.fatherName= r_fathername
        updateinstance.motherName= r_mothername
        updateinstance.achievements=r_achievments
        updateinstance.hobbies= r_hobbies
        updateinstance.twelfthPercentage= r_twelfth
        updateinstance.tenthPercentage= r_tenth
        updateinstance.aliveBacklog= r_alivebacklog
        updateinstance.bioData=r_biodata
        updateinstance.save()

        redirect(controller:'resume', action:'index')

    }

    @Secured(['permitAll'])
    def edit(){
        [editinstance:UserDetails.get(params.id)]
    }

    @Secured(['permitAll'])
    def create(){}
    @Secured(['permitAll'])
    def view(){
        def instance = UserDetails.list()
        println "id is :"+instance
    }
}

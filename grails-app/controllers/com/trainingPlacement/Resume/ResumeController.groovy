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
        def userDetail = UserDetails.findByProfile(pid)
        println userDetail.id
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

        redirect(controller:'user',action:'home')
    }
    @Secured(['permitAll'])
    def update(){


    }

    @Secured(['permitAll'])
    def edit(){
        [editinstance:UserDetails.get(params.id)]
    }

    @Secured(['permitAll'])
    def create(){}
}

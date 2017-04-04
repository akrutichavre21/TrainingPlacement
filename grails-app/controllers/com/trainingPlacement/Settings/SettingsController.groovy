package com.trainingPlacement.Settings

import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.SpringSecurity.User
import com.trainingPlacement.Profile.Profile
import sun.java2d.cmm.Profile

class SettingsController {

    def springSecurityService

    @Secured(['permitAll'])
    def index() {
        //def authorinstance = User.get(springSecurityService.currentUser.id)
    }

    @Secured(['permitAll'])

    def save(){

        def genderStatus
        def gender
        println "hello"
        def currentUser = User.get(springSecurityService.currentUser.id)
        println currentUser
        def dateinstance = Date.parse("yyyy-MM-dd","${params.dateOfbirth}")

        if(gender == 'Male') {
            genderStatus = Profile.Gender.MALE
        }
        else {
            genderStatus = Profile.Gender.FEMALE
        }

         Profile a= new Profile([
                 fullName:params.fullName,
                 dateOfBirth:dateinstance,
                 gender:genderStatus,
                 contactNo:params.contactNumber,
                 college:params.college,
                 user:currentUser
         ])
        println a.fullName
        println a.dateOfBirth
        println a.gender
        println a.contactNo
        println a.college
        println a.user
        a.save()
        redirect(controller:'settings', action: 'index')

    }

   @Secured(['permitAll'])
    def profile(){

      }




}

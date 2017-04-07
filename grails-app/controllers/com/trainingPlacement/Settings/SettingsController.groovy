package com.trainingPlacement.Settings

import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.SpringSecurity.User
import com.trainingPlacement.Profile.Profile

class SettingsController {

    def springSecurityService

    @Secured(['ROLE_ADMIN'])
    def index() {
        def user = User.get(springSecurityService.currentUser.id)
        def profileInstance  = Profile.findByUser(user)
        render(view:'index',model:[profile:profileInstance])
    }

    @Secured(['ROLE_USER'])
    def s_index() {
        def user = User.get(springSecurityService.currentUser.id)
        def profileInstance  = Profile.findByUser(user)
        render(view:'s_index',model:[profile:profileInstance])
    }

    @Secured(['permitAll'])
    def save(String id){

        def genderStatus
        def gender
        println "hello"
        def currentUser = User.get(springSecurityService.currentUser.id)
        println currentUser
        def dateinstance = Date.parse("yyyy-MM-dd","${params.dob}").clearTime()

        if(gender == 'Male') {
            genderStatus = Profile.Gender.MALE
        }
        else {
            genderStatus = Profile.Gender.FEMALE
        }

         Profile a= Profile.get(Integer.parseInt(id))
                 a.fullName=params.fullname
                 a.dateOfBirth=dateinstance
                 a.gender=genderStatus
                 a.contactNo=Long.parseLong(params.contact)
                 a.college=params.college

        a.save()
        redirect(controller:'settings', action: 'index')
    }

    @Secured(['ROLE_USER'])
    def s_save(String id){

        def genderStatus
        def gender
        println "hello"
        def currentUser = User.get(springSecurityService.currentUser.id)
        println currentUser
        def dateinstance = Date.parse("yyyy-MM-dd","${params.dob}").clearTime()

        if(gender == 'Male') {
            genderStatus = Profile.Gender.MALE
        }
        else {
            genderStatus = Profile.Gender.FEMALE
        }

        Profile a= Profile.get(Integer.parseInt(id))
        a.fullName=params.fullname
        a.dateOfBirth=dateinstance
        a.gender=genderStatus
        a.contactNo=Long.parseLong(params.contact)
        a.college=params.college

        a.save()
        redirect(controller:'settings', action: 's_index')
    }

   @Secured(['ROLE_ADMIN'])
    def profile(){
            def userInstance = User.get(springSecurityService.currentUser.id)
            println userInstance.id
            def profileInstance = Profile.findByUser(userInstance)
            render(view:'profile', model:[profile: profileInstance])
      }

    @Secured(['ROLE_USER'])
    def studentProfile(){
        def userInstance = User.get(springSecurityService.currentUser.id)
        println userInstance.id
        def profileInstance = Profile.findByUser(userInstance)
        render(view:'studentProfile', model:[profile: profileInstance])
    }

    @Secured(['ROLE_ADMIN'])
    def password() {}

    @Secured(['ROLE_USER'])
    def s_password() {}

    @Secured(['ROLE_ADMIN'])
    def changePassword(String current_password, String new_password, String confirm_password) {

        User activeUser = springSecurityService.currentUser
        def password_old = current_password
        if(!springSecurityService.passwordEncoder.isPasswordValid(activeUser.getPassword(), password_old, null)) {
            render "incorrect"
        }else {
            User changePassword = User.get(springSecurityService.currentUser.id)
            changePassword.password = new_password
            render "password changed successfully"
        }
    }

    @Secured(['ROLE_USER'])
    def s_changePassword(String current_password, String new_password, String confirm_password) {

        User activeUser = springSecurityService.currentUser
        def password_old = current_password
        if(!springSecurityService.passwordEncoder.isPasswordValid(activeUser.getPassword(), password_old, null)) {
            render "incorrect"
        }else {
            User changePassword = User.get(springSecurityService.currentUser.id)
            changePassword.password = new_password
            render "password changed successfully"
        }
    }


}

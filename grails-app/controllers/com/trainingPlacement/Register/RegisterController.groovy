package com.trainingPlacement.Register
import com.trainingPlacement.SpringSecurity.*

import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.Profile.Profile


class RegisterController {

    def springSecurityService

    @Secured(['permitAll'])
    def index(String s_fullname, String s_email, String s_password) {

        def checkEmail = User.findByUsername(s_email)
        if (checkEmail) {
            flash.signupError = "This Email-id is already Registered!"
            redirect(controller: 'login', action: 'auth')
        } else {

            println "Params receieved are: \n fullname: ${s_fullname}, \n email: ${s_email} \n password: ${s_password}"
            def newuserRole = Role.findByAuthority('ROLE_USER')?: new Role(authority : 'ROLE_USER').save()
            def newUser = new User(username: "${s_email}", password: "${s_password}").save(flush:true)
            println "this is the username--> $newUser.username"
            println "this is the password--> $newUser.password"
            UserRole.create(newUser, newuserRole ,true)

            def currentuser = User.findByUsername(s_email)
            def currentuserid = currentuser.id;

            Profile newUserInstance = new Profile([
                    fullName: "${s_fullname}",
                    gender  : Profile.Gender.MALE,
                    user   : currentuserid,
                    contactNo:123,
                    dateOfBirth:new Date(),
                    college :"ssgi"
            ])
            newUserInstance.save()
            springSecurityService.reauthenticate(s_email)
            redirect(controller: 'user', action: 'home')
        }
    }




}

package com.trainingPlacement.User
import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured

class UserController {

    @Secured(['permitAll'])
    def home() {
        if(SpringSecurityUtils.ifAllGranted('ROLE_ADMIN')){
            redirect controller:'query' ,action:'index'
            return
        }
        if(SpringSecurityUtils.ifAllGranted('ROLE_USER')){
            redirect controller:'schedule' ,action:'index'
            return
        }
    }
}

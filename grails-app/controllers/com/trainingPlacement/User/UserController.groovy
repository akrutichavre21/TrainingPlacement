package com.trainingPlacement.User
import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured

class UserController {

    @Secured(['permitAll'])
    def home() {
        if(SpringSecurityUtils.ifAllGranted('ROLE_ADMIN')){
            redirect controller:'query' ,action:'list'
            return
        }
        if(SpringSecurityUtils.ifAllGranted('ROLE_USER')){
            redirect controller:'newsfeed' ,action:'index'
            return
        }
    }
}

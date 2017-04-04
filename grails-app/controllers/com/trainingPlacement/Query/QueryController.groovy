package com.trainingPlacement.Query

import com.trainingPlacement.Discussion.Discussion
import com.trainingPlacement.SpringSecurity.User
import grails.plugin.springsecurity.annotation.Secured

class QueryController {

    def springSecurityService

    @Secured(['permitAll'])
    def index() {

    }

    def save() {
        def authorinstance=User.get(springSecurityService.currentUser.id)
        println authorinstance
        Discussion discussinstance= new Discussion([
                queryTitle:params.querytitle,
                queryBody:params.querybody,
                dateCreated:new Date(),
                lastUpdate:new Date(),
                author:authorinstance
        ])

        println discussinstance.queryTitle
        println discussinstance.queryBody
        println discussinstance.dateCreated
        println discussinstance.lastUpdate
        println discussinstance.author
        discussinstance.save()
        redirect(controller:"query",action:"index")
    }
}

package com.trainingPlacement.Query
import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.Discussion.Discussion

import com.trainingPlacement.Discussion.Discussion
import com.trainingPlacement.SpringSecurity.User
import grails.plugin.springsecurity.annotation.Secured

class QueryController {

def springSecurityService

    @Secured(['ROLE_USER'])
    def index() {

        def listinstance = Discussion.list()
        render(view: 'index', model: [abc: listinstance])
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
        redirect(controller:"query",action:"list")
    }

    def list() {
        [newsfeed: Discussion.list()]
    }
}

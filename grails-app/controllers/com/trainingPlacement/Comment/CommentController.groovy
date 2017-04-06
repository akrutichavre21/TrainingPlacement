package com.trainingPlacement.Comment
import grails.plugin.springsecurity.annotation.Secured

import javax.xml.namespace.QName
import javax.xml.stream.Location
import javax.xml.stream.XMLStreamException
import javax.xml.stream.events.Characters
import com.trainingPlacement.Comment.Comment
import com.trainingPlacement.Discussion.Discussion
import com.trainingPlacement.SpringSecurity.User

import javax.xml.stream.events.EndElement
import javax.xml.stream.events.StartElement

class CommentController {
    def springSecurityService

    @Secured(['permitAll'])
    def save(String id) {
        println params.id
        def authorinstance = User.get(springSecurityService.currentUser.id)
        def instance = Discussion.get(Integer.parseInt(id))
        println instance
        Comment a = new Comment([answer:params.answer,author:authorinstance,dateCreated: new Date(), lastUpdate: new Date(),discussion: instance])
        println a.answer
        println a.author
        println a.dateCreated
        println a.lastUpdate
        a.save()
        redirect(controller: "query",action:"index")

    }

    @Secured(['permitAll'])
    def index() {
        [viewInstance : Discussion.get(params.id)]
    }
}
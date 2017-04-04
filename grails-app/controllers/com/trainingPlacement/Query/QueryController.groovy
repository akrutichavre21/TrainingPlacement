package com.trainingPlacement.Query
import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.Discussion.Discussion

class QueryController {

    @Secured(['ROLE_ADMIN'])
    def index() {

        def listinstance = Discussion.list()
        render(view: 'index', model: [abc: listinstance])

    }
}

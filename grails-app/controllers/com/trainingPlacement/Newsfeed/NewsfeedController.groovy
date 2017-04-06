package com.trainingPlacement.Newsfeed

import com.trainingPlacement.Discussion.Discussion
import com.trainingPlacement.Schedule.Schedule
import grails.plugin.springsecurity.annotation.Secured

class NewsfeedController {


    @Secured(['ROLE_USER'])
    def index() {
        def listInstance = Schedule.list();

        render (view:'index', model:[abc:listInstance])

    }
}

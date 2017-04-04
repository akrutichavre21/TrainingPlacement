package com.trainingPlacement.Schedule

import grails.plugin.springsecurity.annotation.Secured


class ScheduleController {
    @Secured(['permitAll'])
    def index() {

        render "inside schedule"
    }
}

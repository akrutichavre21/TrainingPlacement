package com.trainingPlacement.Query


import grails.plugin.springsecurity.annotation.Secured


class QueryController {
     @Secured(['ROLE_ADMIN'])
    def index() {

        render "inside query"
    }
}

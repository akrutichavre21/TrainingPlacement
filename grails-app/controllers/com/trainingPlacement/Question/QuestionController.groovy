package com.trainingPlacement.Question
import com.trainingPlacement.Questions.Questions
import com.trainingPlacement.CompanyDetails.CompanyDetails
import com.trainingPlacement.SpringSecurity.User
import grails.plugin.springsecurity.annotation.Secured

class QuestionController {

    def springSecurityService

    @Secured(['permitAll'])
    def index() {
        def categoryList = CompanyDetails.findAll([sort:"companyName", order:"asc"])
        println categoryList
        println categoryList.companyName
        render (view :'index' , model : [abc : categoryList])
    }

    def save() {
        def authorinstance=User.get(springSecurityService.currentUser.id)
        println authorinstance
        def abc = CompanyDetails.findByCompanyName(params.cname)
      if(abc) {
          Questions queinstance = new Questions([
                  question   : params.question,
                  answer     : params.answer,
                  dateCreated: new Date(),
                  lastUpdate : new Date(),
                  author     : authorinstance
          ])
          println queinstance.question
          println queinstance.answer
          println queinstance.dateCreated
          println queinstance.lastUpdate
          println queinstance.author

          queinstance.save()
          redirect(controller: "question", action: "index")
      }
    }
}

package com.trainingPlacement.Feedback
import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.CompanyDetails.CompanyDetails
import com.trainingPlacement.SpringSecurity.User
import com.trainingPlacement.Feedback.Feedback

class FeedbackController {

    def springSecurityService

    @Secured (['permitAll'])
    def index() {

        def categoryList = CompanyDetails.findAll([sort:"companyName", order:"asc"])
        println categoryList
        println categoryList.companyName
        render (view :'index' , model : [abc : categoryList])
    }

    @Secured (['permitAll'])
    def save(){

        println params.status
        def status
        if(params.status == "1" ) {
            status = Feedback.Status.SELECTED
            println(status)
        } else{ status = Feedback.Status.REJECTED
                println(status) }

        println status
        def abc = CompanyDetails.findByCompanyName(params.cname)

        if(abc) {
            Feedback s = new Feedback([
                    status : status,
                    review : params.review,
                    dateCreated: new Date(),
                    lastUpdate: new Date(),
                    companydetails: abc,
                    user: User.get(springSecurityService.currentUser.id)])
            println(s.status)
            println(s.review)
            println(s.dateCreated)
            println(s.lastUpdate)
            println(s.companydetails)
            println(s.user)

            s.save();
            redirect(controller:'feedback' , action:'list');
            return
        }
        else
        {
            redirect(controller:'feedback' , action:'index');
            return
        }


    }

    @Secured (['permitAll'])
    def delete(){

        def deleteInstance = Feedback.get(params.id)
        deleteInstance.delete();
        redirect(controller: 'feedback' , action: 'list')
    }


    @Secured (['permitAll'])
    def update(String cname, String review, String id){

        def status

        if(params.status == "1" ) {
            status = Feedback.Status.SELECTED
            println(status)
        } else {
            status = Feedback.Status.REJECTED
            println(status)
        }

        def abc = CompanyDetails.findByCompanyName(cname)

        def updateInstance = Feedback.get(Integer.parseInt(id))
        updateInstance.companydetails= abc
        updateInstance.status = status
        updateInstance.review = review
        updateInstance.lastUpdate = new Date()
        updateInstance.save()
        redirect(controller:'feedback' , action:'list');
    }

    @Secured (['permitAll'])
    def edit(){
        def categoryList = CompanyDetails.findAll([sort:"companyName", order:"asc"])
        render (view :'edit' , model : [abc : categoryList, editInstance: Feedback.get(params.id)])

    }

    @Secured (['permitAll'])
    def list() {

        def listInstance = Feedback.list()
        render (view:'list', model:[abc:listInstance])
    }

}


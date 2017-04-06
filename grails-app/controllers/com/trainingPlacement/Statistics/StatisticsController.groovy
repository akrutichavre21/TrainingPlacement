package com.trainingPlacement.Statistics
import com.trainingPlacement.Feedback.Feedback
import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.CompanyDetails.CompanyDetails
import com.trainingPlacement.SpringSecurity.User

class StatisticsController {

    @Secured (['permitAll'])
    def index() {

        def listInstance = Feedback.list();
        /*render (view:'index', model:[abc:listInstance])
*/         def countId= []
            def count = []
        def count2
        println listInstance.id
        println "comp: "+listInstance.companydetails

        def company = CompanyDetails.list()
        println company

        def companyInstance = CompanyDetails.list()
        println companyInstance.companyName


        listInstance.each {

            count = Feedback.countByCompanydetails(it.companydetails)
            count2 = Feedback.createCriteria().list {
                projections {
                    distinct('companydetails')
                }
            }

            countId << [count2.companyName,count]
        }
        render countId
    }
}

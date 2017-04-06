package com.trainingPlacement.Schedule
import com.trainingPlacement.Schedule.Schedule
import com.trainingPlacement.CompanyDetails.CompanyDetails
import grails.plugin.springsecurity.annotation.Secured


class ScheduleController {

    @Secured (['ROLE_ADMIN'])
    def index(){

        def categoryList = CompanyDetails.findAll([sort:"companyName", order:"asc"])
        println categoryList
        println categoryList.companyName
        render (view :'index' , model : [abc : categoryList])

    }

    @Secured (['ROLE_ADMIN'])
    def save() {

        String cName;
        cName = params.cname;
        def curdate = params.arrival
        def abc = CompanyDetails.findByCompanyName(cName)

        if(abc) {

            def dateinstance = Date.parse("yyyy-MM-dd", "${curdate}")

            Schedule s = new Schedule([arrivalDate: dateinstance, notice: params.notice, venue: params.venue ,
                                       companydetails: abc , dateCreated: new Date() , lastUpdate: new Date() ])
            println(s.arrivalDate)
            println(s.notice)
            println(s.venue)
            println(s.companydetails)
            println(s.dateCreated)
            println(s.lastUpdate)
            s.save();
            redirect(controller:'schedule' , action:'list');
            return
        }
        else
        {
            redirect(controller:'companydetails' , action:'index');
            return
        }
    }

    @Secured (['ROLE_ADMIN'])
    def edit(){

        [editInstance: Schedule.get(params.id)]
    }

    @Secured (['ROLE_ADMIN'])
    def update(String arrival, String cname, String notice, String venue, String id){

        def updateInstance = Schedule.get(Integer.parseInt(id))
        updateInstance.arrivalDate = Date.parse("yyyy-MM-dd", "${arrival}")
        updateInstance.venue = venue
        updateInstance.notice = notice
        updateInstance.lastUpdate = new Date()
        updateInstance.save();
        redirect(controller:'schedule' , action:'list');
    }

    @Secured (['ROLE_ADMIN'])
    def delete(){

            def deleteInstance = Schedule.get(params.id)
            deleteInstance.delete();
            redirect(controller: 'schedule' , action: 'list')
    }

    @Secured (['ROLE_ADMIN'])
    def list(){

        def listInstance = Schedule.list();

        render (view:'list', model:[abc:listInstance])

    }
}


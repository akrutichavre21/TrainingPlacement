package com.trainingPlacement.Company

import grails.plugin.springsecurity.annotation.Secured
import com.trainingPlacement.CompanyDetails.CompanyDetails


class CompanyController {


    @Secured(['permitAll'])
    def index() {


    }

    @Secured(['permitAll'])
    def save() {


        CompanyDetails a= new CompanyDetails([
                companyName:params.companyname,
                salaryMin:params.salarymin,
                salaryMax:params.salarymax,
                criteriaAggregate:params.criteriaaggregate,
                criteriaBacklog:params.criteriabacklog,
                criteriaTenth:params.criteriatenth,
                criteriaTwelfth:params.criteriatwelfth,
                criteriaBranch:params.criteriabranch,
                bioData:params.biodata,
                headQuarters:params.headquarters
        ])

        println a.companyName
        println a.salaryMin
        println a.salaryMax
        println a.criteriaAggregate
        println a.criteriaBacklog
        println a.criteriaTenth
        println a.criteriaTwelfth
        println a.criteriaBranch
        println a.bioData
        println a.headQuarters


        a.save()
        redirect(controller:'company', action: 'list')


    }

    @Secured(['permitAll'])
    def update ( String companyname ,
             String biodata,
             Long salarymin,
             Long salarymax,
             String headquarters,
             Long criteriaaggregate,
             Long criteriabacklog,
             Long criteriatenth,
             Long criteriatwelfth,
             String criteriabranch, String id) {

        println "ID bata: "+id
        def updateinstance = CompanyDetails.get(Integer.parseInt(id))
        println updateinstance
        updateinstance.companyName = companyname
        updateinstance.bioData = biodata
        updateinstance.salaryMin = salarymin
        updateinstance.salaryMax = salarymax
        updateinstance.lastUpdated = new Date()
        updateinstance.headQuarters = headquarters
        updateinstance.criteriaAggregate = criteriaaggregate
        updateinstance.criteriaBacklog = criteriabacklog
        updateinstance.criteriaTenth = criteriatenth
        updateinstance.criteriaTwelfth = criteriatwelfth
        updateinstance.criteriaBranch = criteriabranch

        redirect(controller: 'company' , action: 'list')


    }





    @Secured(['permitAll'])
    def edit() {

     [editinstance : CompanyDetails.get(params.id)]

    }


    @Secured(['permitAll'])
    def delete() {

        def deleteinstance = CompanyDetails.get(params.id)
        deleteinstance.delete()
        redirect(controller: 'company' ,action: 'list')
    }


    @Secured(['permitAll'])
    def list() {

        def listinstance = CompanyDetails.list()
        render(view:'list', model:[abc:listinstance])
    }





}
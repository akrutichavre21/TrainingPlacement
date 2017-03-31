package com.trainingPlacement.Schedule

import com.trainingPlacement.CompanyDetails.CompanyDetails

class Schedule {

    Date arrivalDate
    String notice
    Date dateCreated
    Date lastUpdate
    String venue
    CompanyDetails companydetails

    static constraints = {
        venue blank:false,nullable:false
        notice blank:false,nullable:false
    }

}

package com.trainingPlacement.Questions

import com.trainingPlacement.CompanyDetails.CompanyDetails
import com.trainingPlacement.SpringSecurity.User

class Questions {

    Date dateCreated
    Date lastUpdate
    CompanyDetails companydetails
    String question
    String answer
    User author

    static constraints = {
        question blank:false,nullable:false
        answer blank:false,nullable:false
    }
}

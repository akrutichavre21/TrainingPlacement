package com.trainingPlacement.Feedback

import com.trainingPlacement.CompanyDetails.CompanyDetails
import com.trainingPlacement.SpringSecurity.User
class Feedback {

    Date dateCreated
    Date lastUpdate
    CompanyDetails companydetails
    Status status
    String review
    User user;

    static constraints = {
        review blank:false,nullable:false
        status blank:false,nullable:false
    }

    enum Status{

        SELECTED(1) , REJECTED(2)
        final int id

        Status(int id){
            this.id=id
        }
    }
}

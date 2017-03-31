package com.trainingPlacement.Discussion

import com.trainingPlacement.SpringSecurity.User

class Discussion {

    Date dateCreated
    Date lastUpdate
    String queryTitle
    String queryBody
    User author

    static constraints = {
        queryBody blank:false,nullable:false
        queryTitle blank:false,nullable:false
    }
}

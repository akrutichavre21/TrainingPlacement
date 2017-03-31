package com.trainingPlacement.Comment

import com.trainingPlacement.Discussion.Discussion
import com.trainingPlacement.SpringSecurity.User

class Comment {

    String answer
    Date dateCreated
    Date lastUpdate
    Discussion discussion
    User author

    static constraints = {
        answer blank:false , nullable:false
            }
}

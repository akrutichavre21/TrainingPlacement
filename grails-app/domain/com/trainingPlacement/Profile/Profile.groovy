package com.trainingPlacement.Profile

import com.trainingPlacement.SpringSecurity.User

class Profile {

    String fullName
    Gender gender
    Date dateOfBirth
    Long contactNo
    String college
    User user

    static constraints = {
        fullName blank:false,nullable:false
       college blank:false,nullable:false
        dateOfBirth blank:false,nullable:false
        contactNo blank:false,nullable:false
    }

    enum Gender{

        MALE(1),FEMALE(2)
        final int id

         Gender(int id) {
            this.id = id
         }
    }

}

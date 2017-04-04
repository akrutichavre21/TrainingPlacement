package com.trainingPlacement.UserDetails

import com.trainingPlacement.Profile.Profile

class UserDetails {

    Long aggregate
    String fatherName
    String motherName
    String hobbies
    String achievements
    Long tenthPercentage
    Long twelfthPercentage
    Integer aliveBacklog
    String address
    String bioData
    Profile profile


    static constraints = {
        aggregate blank:false,nullable:false, matches: "[0-9]+"
        fatherName blank:false,nullable:false
        motherName blank:false,nullable:false
        hobbies blank:false,nullable:false
       bioData blank:false,nullable:false
        twelfthPercentage blank:false,nullable:false
        tenthPercentage blank:false,nullable:false
       aliveBacklog blank:false,nullable:false,min:0
        address blank:false,nullable:false
        achievements blank: false, nullable: false
        profile unique: true
    }
}

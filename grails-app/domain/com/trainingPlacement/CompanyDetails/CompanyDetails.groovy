package com.trainingPlacement.CompanyDetails

class CompanyDetails {

    String companyName
    String bioData
    Long salaryMin
    Long salaryMax
    String headQuarters
    Long criteriaAggregate
    Long criteriaBacklog
    Long criteriaTenth
    Long criteriaTwelfth
    String criteriaBranch
    Date dateCreated
    Date lastUpdated

    static constraints = {
        companyName blank:false , nullable:false
        bioData blank:false , nullable:false
        salaryMax blank:false , nullable:false,min:1L, matches:"[0-9]+"
        salaryMin blank:false , nullable:false,min:1L, matches:"[0-9]+"
        headQuarters blank:false , nullable:false
        criteriaAggregate blank:false , nullable:false, matches:"[0-9]+"
        criteriaBacklog blank:false , nullable:false, matches:"[0-9]+"
        criteriaTenth blank:false , nullable:false, matches:"[0-9]+"
        criteriaBranch blank:false , nullable:false
        criteriaTwelfth blank:false , nullable:false, matches:"[0-9]+"

    }
}

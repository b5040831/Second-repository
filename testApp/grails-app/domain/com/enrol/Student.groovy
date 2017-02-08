package com.enrol

class Student {
	String name
	String studentID
	Date dob
	Boolean isFundingAvailable
	String email
	String username
	String password
	Course course

    static hasMany=[modules:Module]

    static constraints = {
	name nullable:false, blank: false
	studentID nullable:false, blank: false
	dob nullable:false, blank:false
	isFundingAvailable nullable:false, blank:false
	email nullable:false, email:true
	username nullable:false, blank:false, unique:true
	password nullable:false, blank:false
	course nullable: false, blank:false
    }
}

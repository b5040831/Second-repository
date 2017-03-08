package com.enrol

class Lecturer {

	String fullName
	String post
	String subject
	String lecturerEmail
	String office
	String bio
	String userName
	String password

	String toString()
	{
		return fullName		
	}

    static hasMany=[courses:Course,modules:Module]
    static belongsTo=Course

    static constraints = {
	fullName nullable:false, blank:false
	post nullable:false, blank:false
	subject nullable:false, blank:false
	lecturerEmail nullable:false, blank:false, email:true
	office nullable:false, blank:false
	bio nullable:false, blank:false, maxSize:5000, widget:'textarea'
	userName blank:false, nullable:false, unique:true
	password blank:false, nullable:false, password:true
    }
}

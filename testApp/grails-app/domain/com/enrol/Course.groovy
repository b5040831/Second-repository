package com.enrol

class Course {
	String department
	String title
	String leader
	String code
	String description
	String studyMode
	Date startDate
	Date endDate
	int numberOfStudents
	double tuitionFees
	Boolean isItRunning

    double calculateFees()
	{
	4*tuitionFees
	}

    static constraints = {
	department blank:false, nullable:false
	title blank:false, nullable:false
	leader blank:false, nullable:false
	code blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	studyMode blank:false, nullable:false, size:20..20
	startDate blank:false, nullable:false
	endDate blank:false, nullable:false
	numberOfStudents blank:false, nullable:false, min:20, max:60
	tuitionFees blank:false, nullable:false, scale:2


    }
}

package com.enrol

class Module {
	String title
	String code
	int credits
	String lecturer
	String course
	String description

    static constraints = {
	title nullable:false, blank:false
	code nullable:false, blank:false
	credits nullable:false, blank:false, min:20, max:120
	lecturer nullable:false, blank:false
	description nullable:false, blank:false, maxSize:5000, widget:'textarea'
    }
}

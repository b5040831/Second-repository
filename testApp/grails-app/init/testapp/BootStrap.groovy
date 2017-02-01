package com.enrol

class BootStrap {

    def init = { servletContext ->
	def lect1=new Lecturer(
		fullName: 'Mr Bean',
		post:'Lecturer',
		subject:'Web Design',
		office:'Office-2211',
		bio:"''"
	).save()
 	def module1=new Module(
		title:'Web Architectures',
		code:'WA234',
		lecturer:'Mr Bean',
		course:'BSc Hon Computing',
		description:"'Lorem ipsum ur mom'"
	).save()
	def student1=new Student(
		name:'Patriyck',
		studentID:'b5040831',
		dob:new Date('08/08/1997'),
		email:'Harambe@zoo.com',
		isFundingAvailable:true,
		username:'rvg96',
		password:'secret',
		course:'Web Systems Design'
	).save()
	def course1=new Course(
		title:'BSc Hon Interactive Media with Animation',
		department:'Computing',
		leader:'Mojo Jojo',
		code:'IMA101',
		startDate: new Date('19/09/2017'),
		endDate: new Date('19/08/2020'),
		numberOfStudents: 55,
		studyMode:'Full-time',
		tuitionFees:9000,
		description:"'Lorem ipsum Aidan Black'"
	).save()
		
    }
    def destroy = {
    }
   
}

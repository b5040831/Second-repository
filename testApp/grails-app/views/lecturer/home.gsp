<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Univeristy of Hogwarts</title>
    <asset:stylesheet src="home.css"/>

    <div class="row">
       <asset:image src="main1fw.png"/>
    </div>
</head>
<body>

    <div id="content" role="main">
	<div class="row">
		<div class="first">
			<h3>Course Management</h3>
			<p>Lorem ipsum me gusta los churros</p>
			<button type="button" class="btn btn-success">
				<g:link controller="course" action="create">Courses</g:link>
			</button>
		</div>
		<div class="second">
			<h3>Student Enrolment</h3>
			<p>Lorem ipsum me gusta la tetas grandes</p>
			<button type="button" class="btn btn-success">
				<g:link controller="student" action="create">Enrol Student</g:link>
			</button>
		</div>
	</div>
    </div>
</body>
</html>

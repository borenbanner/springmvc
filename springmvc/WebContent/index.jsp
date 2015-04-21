<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	this is a test page .
	
	<br>
	<a href="spring/testViewAndViewResolver">test ViewAndViewResolver</a>
	<br>
	<br>
	<a href="spring/testSessionAttributes">test Session</a>
	<br>

	<a href="spring/testMap"> Test Map</a>
	<br>
	<br>

	<a href="spring/testModelAndView"> test modelAndView</a>
	<br>


	<form action="spring/testPojo" method="post">

		name : <input type="text" name="name" /> <br> password: <input
			type="password" name="password" /> <br> otherName: <input
			type="text" name="other.otherName" /> <input type="submit"
			value="testPojo" />


	</form>

	<br>

	<form action="spring/testRequestParam" method="post">
		<input type="text" name="uName" /><br> <input type="text"
			name="age" /><br> <input type="submit" value="submit"/ >

	</form>




	<br>
	<a href="spring/testRest/8">spring pathVariable test</a>
	<br>
	<form action="spring/testRest" method="post">
		<input type="submit" value="submit" />
	</form>
	<br>
	<form action="spring/testRest/8" method="post">
		<input type="hidden" name="_method" value="DELETE" /> <input
			type="submit" value="delete" />
	</form>
	<br>
	<br>
	<form action="spring/testRest/8" method="post">
		<input type="hidden" name="_method" value="PUT" /> <input
			type="submit" value="put" />
	</form>
	<br>
	<a href="spring/testPathVariable/3">spring pathVariable test</a>
	<br>
	<a href="spring/method">spring method test</a>

	<a href="spring/hello">Spring Test</a>
</body>
</html>
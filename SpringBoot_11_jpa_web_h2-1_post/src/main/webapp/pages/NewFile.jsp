<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addstudent">
		id:<input type="number" name="id">
		name:<input type="text" name="name">
		tec:<input type="text" name="tec">
		<input type="submit" value="Submit">
	</form>
	
	<form action="getstudent">
		id:<input type="number" name="id">
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>
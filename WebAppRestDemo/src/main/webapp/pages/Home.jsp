<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="add">
			<input type="number" name="id" ><br>
			<input type="text" name="name"><br>
			<input type="text" name="address"><br><br>
			<input type="submit">
		</form>
		
		<br><br><br><br>
		
		<form action="get">
			<input type="number" name="id"><br>
			<input type="submit">
		</form>
</body>
</html>
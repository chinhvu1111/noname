<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE hello world</title>
</head>
<body>
	<h1>Hello java EE world!</h1>
	<center>
	<form action="helloServlet" method="post">
	Enter a number:<input type="text" name="number" size="5"/>
	Enter your name:<input type="text" name="yourname" size="5"/>
	<input type="submit" value="Call servlet"/>
	
	</form>
	</center>
	
</body>
</html>
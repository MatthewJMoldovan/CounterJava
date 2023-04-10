<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter Display</title>
</head>
<body>
	<h3>You have visited <a href="/your_server">Home</a> ${count } times</h3>
	<a href="/your_server/two">Increment by two</a>
	<br>
	<a href="/your_server/clear">Clear count!</a>
</body>
</html>
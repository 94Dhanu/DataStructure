<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

// JSP code for error page, which displays the exception 
<%@page isErrorPage="true"%>

	<h1> Exception caught</ h1> 

		The exception is : <%= exception %> // displaying the exception 


</body>
</html>
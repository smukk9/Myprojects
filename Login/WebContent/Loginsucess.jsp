<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login suceess</title>
</head>
<body>
<h3>Login sucessfull</h3>
<jsp:useBean id="user" class="org.services.dto.User" scope="request"></jsp:useBean>
Hi <jsp:getProperty property="user_Name" name="user"/>, your login was sucessful
</body>
</html>
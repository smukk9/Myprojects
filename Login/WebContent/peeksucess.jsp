<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%User user = (User)request.getAttribute("Shareduser"); %>
<%@ page import="org.services.dto.User" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resource/css/peek.css" rel="stylesheet" type="text/css" />
<title>Simple WebApp</title>
</head>
<body>

<table align="center">
<tr>
<th>Name:</th>
<th>E-mail:</th>
<th>Country:</th>
<th>Phone Number</th>
</tr>
<tr>
<td><%=user.getUser_Name() %></td>
<td><%=user.getE_mail() %></td>
<td><%=user.getCountry() %></td>
<td><%=user.getPhone_Number()%></td>
</tr>
</table>
</body>
</html>
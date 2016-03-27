<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% User user = (User)request.getSession().getAttribute("saveduser");%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page import="org.services.dto.User" %>
<title>Login suceess</title>
</head>
<body>
<h3>Login sucessfull</h3>
<table>

        <tr>
           <td>you've logged in Sucessfully </td>
           <td><%=user.getUser_Name()%>Login was done</td>
       </tr>
    </table>
</body>
</html>

  
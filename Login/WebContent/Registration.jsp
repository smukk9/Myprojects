<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resource/css/peek.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>

<form action="Registration" method="post">
	<table align="center">
	<tr>
	<td > 
	User Name: 
	</td>
	<td>
	<input name="u_name" type="text"></input>
	</td>
	</tr>
	<tr>
	<td >
	Phone Number: 
	 </td>
	 <td>
	 <input name="p_number" type="text"></input>
	</td>
	</tr>
	<tr>
	<td> 
	E-Mail Id:
	</td>
	<td>
	 <input name="e_mail" type="text"></input>
	</td>
	</tr>
	<tr>
	<td > 
	Country: 
	</td>
	<td>
	<input name="country_name" type="text"></input>
	</td>
	</tr>
	<tr>
	<td >
	Password:
	 </td>
	 <td>
	 <input name="pwd" type="password"></input>
	</td>
	</tr>
	<tr>
	<td>
	<input type="submit" value="Register"></input>
	</td>
	</tr>
	
	</table>
</form>

</body>
</html>
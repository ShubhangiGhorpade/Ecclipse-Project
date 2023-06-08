<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<h5 style="color: pink">${msg}</h5>
	
    <c:forEach items="${error} " var="error">
	<span style="color: red;">{error.defaultMessage}</span>	
	</c:forEach>

	Name:<%=request.getParameter("name")%><br>
	InjuryPart:<%=request.getParameter("injuryPart")%><br>
	State:<%=request.getParameter("state")%><br>
	District:<%=request.getParameter("district")%><br>
	Status:<%=request.getParameter("status")%><br>
	Place:<%=request.getParameter("place")%><br>
	Reason:<%=request.getParameter("reason")%><br>
	DeathId:<%=request.getParameter("deathId")%><br>
	Date:<%=request.getParameter("date")%><br>
	Age:<%=request.getParameter("age")%>
	
	
	
	<form action="view" method="post">
		<input type="submit" value="Details"></form>
	
</body>
</html>
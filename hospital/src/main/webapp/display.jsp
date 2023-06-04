<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<h5 style="color: pink">${msg}</h5>


	Name<%=request.getParameter("name")%>
	InjuryPart<%=request.getParameter("injuryPart")%>
	State<%=request.getParameter("state")%>
	District<%=request.getParameter("district")%>
	Status<%=request.getParameter("status")%>
	Place<%=request.getParameter("place")%>
	Reason<%=request.getParameter("reason")%>
	DeathId<%=request.getParameter("deathId")%>
	Date<%=request.getParameter("date")%>
	Age<%=request.getParameter("age")%>
	
	<form action="view" method="post">
		<input type="submit" value="Details"></form>
	
</body>
</html>
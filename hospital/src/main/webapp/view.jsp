<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>

<style type="text/css">

th,td {
  text-align: center;
  border: 1px solid;
  background-color: aqua;
}

</style>
</head>
<body>
<table class="table table-success table-striped">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Age</th>
      <th scope="col">DeathId</th>
      <th scope="col">Place</th>
      <th scope="col">State</th>
      <th scope="col">District</th>
      <th scope="col">Injury</th>
      <th scope="col">Status</th>
      <th scope="col">Date</th>
      <th scope="col">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    
    <c:forEach items="${view}" var="item">
					
						<td>${item.name}</td>
						<td>${item.age}</td>
						<td>${item.deathId}</td>
						<td>${item.place}</td>
						<td>${item.state}</td>
						<td>${item.district}</td>
						<td>${item.status}</td>
						<td>${item.injuryPart}</td>
						<td>${item.date}</td>
						<td>${item.reason}</td>

				</c:forEach>
    
</tr>
  </tbody>

</table>

</body>
</html>
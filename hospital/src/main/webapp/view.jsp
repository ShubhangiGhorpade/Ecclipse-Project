<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
</head>
<body>

<table>
			<thead>
				<th>Name</th>
				<th>DeathId</th>
				<th>Age</th>
				<th>Place</th>
				<th>District</th>
				<th>State</th>
				<th>Status</th>
				<th>Reason</th>
				<th>Date</th>
				<th>Accident</th>

				<br>

				<c:forEach items="${list}" var="item">
					<tr>
						<td>${item.name}</td>
						<td>${item.deathId}</td>
						<td>${item.age}</td>
						<td>${item.status}</td>
						<td>${item.place}</td>
						<td>${item.district}</td>
						<td>${item.state}</td>
						<td>${item.injuryPart}</td>
						<td>${item.reason}</td>
						<td>${item.date}</td>

					</tr>


				</c:forEach>




			</thead>


		</table>

</body>
</html>
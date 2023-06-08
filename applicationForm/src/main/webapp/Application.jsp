<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<c:forEach items="${errorMsg}" var="error"><br>
		<span style="color: red;">${error.defaultMessage}</span>
	</c:forEach>

	<span style="color: green;">${successMsg}</span>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Application</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">View</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<form action="click" method="post" >
	<div class="row g-3">
		<div class="col-md-6">
			<label for="inputPassword4" class="form-label">First Name</label> <input
				type="text" class="form-control" id="name" name="name" value="${dtos.name}">
		</div>
		<div class="col-md-6">
			<label for="inputPassword4" class="form-label">Age</label> <input
				type="text" class="form-control" id="age" name="age" value="${dtos.age}">
		</div>
	</div>
	<div class="col-12">
		<label for="inputAddress" class="form-label">Weight</label> <input
			type="text" class="form-control" id="weight" name="weight" value="${dtos.weight}">
	</div>
	<div class="col-12">
		<label for="inputAddress" class="form-label">Address</label> <input
			type="text" class="form-control" id="address" name="address" value="${dtos.address}">
	</div>

	<div class="col-12">
		<label for="inputAddress2" class="form-label">CollegeName</label> <input
			type="text" class="form-control" id="collegeName" name="collegeName" value="${dtos.collegeName}">
	</div>
	<div>
	<input type="submit" value="Submit" >
	</div>
</form>
</body>
</html>
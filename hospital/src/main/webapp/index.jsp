<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Xworkz</title>
</head>
<body>

	<form action="click" method="post">
		<div class="col-md-6">
			<label for="inputEmail4" class="form-label">Name</label> <input
				type="text" class="form-control" id="name" name="name">
		</div>
		<div class="col-md-6">
			<label for="inputPassword4" class="form-label">Id</label> <input
				type="number" class="form-control" id="deathId" name="deathId">
		</div>
		<div class="col-12">
			<label for="inputAddress2" class="form-label">Age</label> <input
				type="number" class="form-control" id="age" name="age">
		</div>
		<div class="col-12">
			<label for="inputAddress" class="form-label">Place</label> <input
				type="text" class="form-control" id="place" name="place"
				placeholder="1234 Main St">
		</div>
		<div class="col-md-6">
			<label for="inputCity" class="form-label">District</label> <input
				type="text" class="form-control" id="district" name="district">
		</div>
		<div class="col-md-4">
			<label for="inputState" class="form-label">State</label> <select
				id="state" class="form-select" name="state">
				<option selected>Choose...</option>
				<option>KA</option>
				<option>MH</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Reason</label>
			<textarea class="form-control" id="reason" rows="3" name="reason"></textarea>
		</div>
		<div class="col-md-2">
			<label for="inputZip" class="form-label">Date</label> <input
				type="number" class="form-control" id="date" name="date">
		</div>
		<div class="col-12">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" id="accident"
					name="injuryPart" value="Accident">  <label class="form-check-label"
					for="gridCheck"> Accident </label>
			</div>
		</div>

	<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="status" id="inlineRadio1" value="Married">
  <label class="form-check-label" for="inlineRadio1">Married</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="status" id="inlineRadio2" value="UnMarried">
  <label class="form-check-label" for="inlineRadio2">UnMarried</label>
</div>

		<div class="col-12">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>

	</form>
</body>
</html>
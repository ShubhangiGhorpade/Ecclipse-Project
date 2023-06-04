<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<h1>Welcome Page...........</h1>

	<form action="save" method="post">
		<pre>
		Name<input type="text" name="name"> 
		Email<input type="text" name="email"> 
		MobileNum<input type="text" name="mobileNo">
		Country<input type="text" name="country">
		Type<select name="type" id="type">
			<option value="mother">Mother</option>
			<option value="father">Father</option>
			<option value="brother">Brother</option>
			<option value="sister">Sister</option>
		</select>
		Description<textarea name="description" id="description" rows="3"></textarea>
		Submit<input type="submit" value="submit">
		</pre>
	</form>
</body>
</html>
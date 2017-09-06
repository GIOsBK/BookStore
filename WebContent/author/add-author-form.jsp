<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
<title>Add author</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Add New Author</h2>
		</div>
	</div>

	<div id="container">
		<form action="../AuthorServletController" method="get">
			<input type="hidden" name="command" value="addNewAuthor" />
			<table>
				<tbody>
					<tr>
						<td><label>Author Name:</label></td>
						<td><input type="text" name="nameAuthor"></td>
					</tr>

					<tr>
						<td><label>Date of birth:</label></td>
						<td><input type="text" name="dobString"></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="AddNewAuthor" class="save" /></td>
					</tr>

				</tbody>
				<p>
					<a href=AuthorServletController>Back to List</a>
				</p>
			</table>
		</form>
	</div>




</body>
</html>
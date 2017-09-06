<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>BookStore Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>FooBar University</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add BookStore -->
			
			<input type="button" value="Add Author" 
				   onclick="window.location.href='./author/add-author-form.jsp'; return false;"
				   class="add-student-button"
			/>
			
			<table>
			
				<tr>
					<th>Author Name</th>
					<th>DOB</th>
				</tr>
				
				<c:forEach var="tempAuthor" items="${AUTHOR_LIST}">
					
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="AuthorServletController">
						<c:param name="command" value="LOAD" />
						<c:param name="authorId" value="${tempAuthor.ID}" />
					</c:url>

					<c:url var="deleteLink" value="AuthorServletController">
						<c:param name="command" value="DELETE" />
						<c:param name="authorId" value="${tempAuthor.ID}" />
					</c:url>
																		
					<tr>
						<td> ${tempAuthor.name} </td>
						<td> ${tempAuthor.dobString} </td>
						<td> 
							<a href="${tempLink}">Update</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this author?'))) return false">
							Delete</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>









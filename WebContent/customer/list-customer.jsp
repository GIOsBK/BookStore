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
			
			<input type="button" value="Add BookStore" 
				   onclick="window.location.href='./customer/add-customer-form.jsp'; return false;"
				   class="add-student-button"
			/>
			
			<table>
			
				<tr>
					<th>Customer Name</th>
					<th>Customer Phone</th>
					<th>Customer DOB</th>
				</tr>
				
				<c:forEach var="tempCustomer" items="${CUSTOMER_LIST}">
					
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="CustomerControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>

					<c:url var="deleteLink" value="CustomerControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>
																		
					<tr>
						<td> ${tempCustomer.name} </td>
						<td> ${tempCustomer.phone} </td>
						<td> ${tempCustomer.dobString} </td>
						<td> 
							<a href="${tempLink}">Update</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">
							Delete</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>









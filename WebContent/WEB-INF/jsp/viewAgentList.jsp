<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><table>
<tr>${message}</tr></br>
<tr>User Name:-   ${un}</tr></br>
<tr>Password:-	  ${pwd}</tr></br>
		</table></div>

	<table >
		<thead>
			<tr>
				<th>Agent Id</th>
				<th>Agent Name</th>
				<th>Email</th>
				<th>Primary Contact</th>
				<th>Secondary Contact</th>
				<th>JOb Type</th>
				<th>DOJ</th>
			</tr>
		</thead>
		<c:forEach var="agent" items="${agentList}">
			<tr>
				<td>${agent.id}</td>
				<td>${agent.name}</td>
				<td>${agent.email}</td>
				<td>${agent.pc}</td>
				<td>${agent.ac}</td>
				<td>${agent.jobType}</td>
				<td>${agent.doj}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
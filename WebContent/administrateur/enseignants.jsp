<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
<!doctype html>
<html lang="en">
  <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Sidebar</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  	  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/affichage.css">
  	
	<script src="${pageContext.request.contextPath}/js/sidebar.js"></script>
  </head>
  <body>
<jsp:include page="../sidebar/base1.jsp"/>
 <div class="table-title">
<h3>ENSEIGNANTS</h3>
</div>
<br>

       <table class="table-fill">
	<thead>
	<tr>
	
		<th class="text-left">ID</th>
		<th class="text-left">Nom</th>
		<th class="text-left">Prenom</th>
		<th class="text-left">Username</th>
		<th class="text-left">Password</th>
		<th class="text-left">Emploi</th>
		<th class="text-left"> <p class="action" ></p></th>
		
		
		
	</tr>
	</thead>
	<tbody class="table-hover">
	
	<c:forEach var="ele" items="${liste}">
		<tr>
			<td class="text-left">${ele.getID_ENSEIGNANT()}</td>
			<td class="text-left">${ele.getNom()}</td>
			<td class="text-left">${ele.getPrenom()}</td>
			<td class="text-left">${ele.getUsername()}</td>
			<td class="text-left">${ele.getPassword()}</td>
			<td class="text-left"><a class="upload" href="upload?id=${ele.getID_ENSEIGNANT()}"  type="button"><i class="fa fa-calendar fa-fw"></i></a></td>

			<td class="text-left"><a class="edit" href="modify?id=${ele.getID_ENSEIGNANT()}&table=enseignants"  type="button"><i class="fa fa-pencil fa-fw"></i></a><a class="delete" href="delete?id=${ele.getID_ENSEIGNANT()}&table=enseignants"  type="button"><i class="fa fa-trash-o fa-fw"></i></a></td>
			
			
			
		</tr>
	</c:forEach>
	</tbody>
</table>
      <br>
      <br>
      <br>
      <br>
 <jsp:include page="../sidebar/base2.jsp"/>
 </body>
</html>
      
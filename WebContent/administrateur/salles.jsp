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
<h3>SALLES</h3>
</div>
<br>

       <table class="table-fill">
	<thead>
	<tr>
		<th class="text-left">ID SALLE</th>
		<th class="text-left">NOM SALLE</th>
		<th class="text-left">NUM SALLE</th>
		<th class="text-left"> <p class="action" ></p></th>
	</tr>
	</thead>
	<tbody class="table-hover">
	
	<c:forEach var="ele" items="${liste}">
		<tr>
			<td class="text-left">${ele.getID_SALLE()}</td>
			<td class="text-left">${ele.getNOM_SALLE()}</td>
			<td class="text-left">${ele.getNUM_SALLE()}</td>
			<td class="text-left"><a class="edit" href="modify?id=${ele.getID_SALLE()}&table=salles"  type="button"><i class="fa fa-pencil fa-fw"></i></a><a class="delete" href="delete?id=${ele.getID_SALLE()}&table=salles"  type="button"><i class="fa fa-trash-o fa-fw"></i></a></td>
			
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
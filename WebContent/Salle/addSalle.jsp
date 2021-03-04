<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!doctype html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ajouter Filière</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  </head>
  <body>

	<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Salles" />
		<jsp:param value="salle" name="type"/>
		<jsp:param value="salles" name="types"/>
		<jsp:param value="${salle.getID_SALLE() }" name="id"/>
	</jsp:include>
<div class="conta" >
	<div class="container" >
		<div class="title1">Ajouter Salle</div>
		<form action="${pageContext.request.contextPath}/administrateur/salle/add" method="post">
			<div class="details">
				<div class="input-box">
					<span class="det">Nom Salle</span>
					<input name="nomsalle" type="text" placeholder="Entrer le nom de la Salle" value="" required>
				</div>
				<div class="input-box">
					<span class="det">Num Salle</span>
					<input name="numsalle" type="number" placeholder="Entrer le numéro de la Salle" value="" required>
				</div>
			</div>
			<div class="button">
					<input type="reset" value="Annuler"> <input type="submit"
					name="submit"
						value="Ajouter" >
				</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>
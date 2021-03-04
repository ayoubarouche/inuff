<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!doctype html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ajouter Administrateur</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  </head>
  <body>

	<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Salles" />
		<jsp:param value="administrateur" name="type"/>
		<jsp:param value="administrateurs" name="types"/>
		<jsp:param value="${admin.getID_ADMINISTRATEUR()}" name="id"/>
	</jsp:include>
  <body>
<%@ include file="/sidebar/base1.jsp" %>
<div class="conta" >
	<div class="container" >
		<div class="title1">Ajouter Administrateur</div>
		<form action="#">
			<div class="details">
				<div class="input-box">
					<span class="det">Nom</span>
					<input name="nom" type="text" placeholder="Entrer le nom" value="" required>
				</div>
				<div class="input-box">
					<span class="det">Prénom</span>
					<input name="prenom" type="text" placeholder="Entrer le prénom" value="" required>
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
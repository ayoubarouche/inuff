<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Modifier Enseignant</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  </head>
  <body>
	<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Enseignants" />
		<jsp:param value="enseignant" name="type" />
		<jsp:param value="enseignants" name="types" />
	</jsp:include>
<div class="conta" >
	<div class="container" >
		<div class="title1">Modifier Enseignant</div>
		<form action="${pageContext.request.contextPath}/administrateur/enseignant/update" method="post">
			<div class="details">
				<div class="input-box">
					<span class="det">Id Enseignant</span>
					<input type="text" name="idenseignant" readonly value="${enseignant.getID_ENSEIGNANT()}">
				</div>
				<div class="input-box">
				</div>
				<div class="input-box">
					<span class="det">Nom</span>
					<input type="text" placeholder="Entrer le nom" name="nom" value="${enseignant.getNom()}" required>
				</div>
				<div class="input-box">
					<span class="det">Prénom</span>
					<input type="text" placeholder="Entrer le prénom" name="prenom" value="${enseignant.getPrenom()}"required>
				</div>
				<div class="input-box">
					<span class="det">UserName</span>
					<input type="text"  placeholder="Entrer le username" name="username" value="${enseignant.getUsername()}">
				</div>
				<div class="input-box">
					<span class="det">Mot de pass</span>
					<input type="text" name="password" value="${enseignant.getPassword()}">
				</div>
			</div>
			<div class="button">
				<input type="reset" value="Annuler">
				<input type="submit" name ="submit" value="Modifier">
			</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ajouter Matière</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  </head>
  <body>
<%@ include file="/sidebar/base1.jsp" %>
<div class="conta" >
	<div class="container" >
		<div class="title1">Ajouter Matière</div>
		<form action="#">
			<div class="details">
				<div class="input-box">
					<span class="det">Nom Matière</span>
					<input type="text" placeholder="Entrer le nom de Matière" required>
				</div>
				<div class="input-box">
					<span class="det">Semestre</span>
					<input type="text" placeholder="Entrer le Semestre" required>
				</div>
			</div>
			<div class="button">
				<input type="reset" value="Annuler">
				<input type="submit" value="Ajouter">
			</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>
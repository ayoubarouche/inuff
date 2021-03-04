<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Modifier Matière</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
  </head>
  <body>
<%@ include file="/sidebar/base1.jsp" %>
<div class="conta" >
	<div class="container" >
		<div class="title1">Modifier Matière</div>
		<form action="${pageContext.request.contextPath}/administrateur/matieres/update" method="post">
			<div class="details">
				<div class="input-box">
					<span class="det">Id Matière</span>
					<input type="text" name="idmatiere" readonly value="${matiere.getID_MATIERE()}">
				</div>
				<div class="input-box">
				</div>
				<div class="input-box">
					<span class="det">Nom Matière</span>
					<input type="text" placeholder="Entrer le nom de Matière" value="${matiere.getNOM_MATIERE()}" required>
				</div>
				<div class="input-box">
					<span class="det">Semestre</span>
					<input type="text" placeholder="Entrer le Semestre" value="${matiere.getSEMESTRE()}"  required>
				</div>
			</div>
			<div class="button">
				<input type="reset" value="Annuler">
				<input type="submit" value="Modifier">
			</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>
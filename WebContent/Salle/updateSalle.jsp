<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	  
    <%@ page import="com.inpt.gestionecole.models.Enseignant"%> 
<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Modifier Filière</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/sidebar.css">
</head>
<body>
<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Salles" />
		<jsp:param value="salle" name="type" />
		<jsp:param value="salles" name="types" />
	</jsp:include>
<div class="conta" >
	<div class="container" >
		<div class="title1">Modifier Salle</div>
		<form action="${pageContext.request.contextPath}/administrateur/salles/update" method="post">
			<div class="details">
				<div class="input-box">
						<span class="det">Id Salle</span> <input type="text" readonly
						name="idsalle" 	value="${salle.getID_SALLE()}">
					</div>
					<div class="input-box"></div>
				<div class="input-box">
				</div>
				<div class="input-box">
						<span class="det">Nom Salle</span> <input type="text"
						name="nomsalle"	placeholder="Entrer le Nom de la Salle" value="${salle.getNOM_SALLE()}" required>
				</div>
				<div class="input-box">
						<span class="det">Num Salle</span> <input type="number"
						name="numsalle"	placeholder="Entrer le numéro de Salle" value="${salle.getNUM_SALLE()}" required>
					</div>
			</div>
			<div class="button">
					<input type="reset" value="Annuler"> <input type="submit" name="submit"
						value="Modifier">
				</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>
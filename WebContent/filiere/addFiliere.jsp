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
		<jsp:param name="tabletype" value="Filieres" />
		<jsp:param value="filiere" name="type"/>
		<jsp:param value="filieres" name="types"/>
		<jsp:param value="${filiere.getID_FILIERE() }" name="id"/>
	</jsp:include>
<div class="conta" >
	<div class="container" >
		<div class="title1">Ajouter Filière</div>
	<form action="${pageContext.request.contextPath}/administrateur/filiere/add" method="post">
				<div class="details">
					
					
					<div class="input-box">
						<span class="det">Nom Filière</span> <input type="text"
						name="nomfiliere"	placeholder="Entrer le Nom de la Filière" value="" required>
					</div>
					<div class="input-box">
						<span class="det">Nom Formation</span> <input type="text"
						name="nomformation"	placeholder="Entrer le nom de Formation" value="" required>
					</div>
					<div class="input-box">
						<span class="det">Semestre</span> <input type="text"
						name="semestre"	placeholder="Entrer le Semestre" value="" required>
					</div>
					<div class="input-box">
						<span class="det">Chef de Filière</span> <select name="chef" id="selectchef" >
						<c:forEach items="${enseignantlist}" var="enseignant">
							<option value='${enseignant.getID_ENSEIGNANT()}' ><c:out value="${enseignant.getNom()} ${enseignant.getPrenom()}"/></option>
							
							</c:forEach>
						</select>
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
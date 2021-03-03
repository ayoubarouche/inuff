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
		<jsp:param name="tabletype" value="Filieres" />
	</jsp:include>
	<div class="conta">
		<div class="container">
			<div class="title1">Modifier Filière</div>
			<form action="${pageContext.request.contextPath}/administrateur/filieres/update" method="post">
				<div class="details">
					<div class="input-box">
						<span class="det">Id Filière</span> <input type="text" readonly
						name="idfiliere" 	value="${filiere.getID_FILIERE()}">
					</div>
					<div class="input-box"></div>
					<div class="input-box">
						<span class="det">Nom Filière</span> <input type="text"
						name="nomfiliere"	placeholder="Entrer le Nom de la Filière" value="${filiere.getNOM_FILIERE()}" required>
					</div>
					<div class="input-box">
						<span class="det">Nom Formation</span> <input type="text"
						name="nomformation"	placeholder="Entrer le nom de Formation" value="${filiere.getNOM_FORMATION()}" required>
					</div>
					<div class="input-box">
						<span class="det">Semestre</span> <input type="text"
						name="semestre"	placeholder="Entrer le Semestre" value="${filiere.getSEMESTRE()}" required>
					</div>
					<div class="input-box">
						<span class="det">Chef de Filière</span> <select name="chef" id="selectchef" >
						<c:forEach items="${enseignantlist}" var="enseignant">
							<option value='${enseignant.getID_ENSEIGNANT()}' <c:if test="${filiere.getCHEF_DE_FILIERE()==enseignant.getID_ENSEIGNANT()}">selected</c:if>><c:out value="${enseignant.getNom()} ${enseignant.getPrenom()}"/></option>
							
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="button">
					<input type="reset" value="Annuler"> <input type="submit" name="submit"
						value="Modifier">
				</div>
			</form>
		</div>
	</div>
	<%@ include file="/sidebar/base2.jsp"%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ajouter Filière</title>
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
		<jsp:param value="filiere" name="type" />
		<jsp:param value="filieres" name="types" />
		<jsp:param value="${filiere.getID_FILIERE() }" name="id" />
	</jsp:include>
	<div class="conta">
		<div class="container">
			<div class="title1">Affectation Page</div>
			<form
				action="${pageContext.request.contextPath}/administrateur/deleteaffectation"
				method="post">
				<div class="details">


					<div class="input-box">
						<span class="det">Filiere : </span> <select name="idf"
							id="selectchef"
						>
							<c:forEach items="${filierelist}" var="filiere">
								<option
									value='${filiere.getID_FILIERE()}'>
									<c:out value="${filiere.getNOM_FILIERE()}" /></option>

							</c:forEach>
						</select>
					</div>

					<div class="input-box">
						<span class="det">Matiere : </span> <select name="idm"
							id="selectchef"
							<c:if test="${ma != null}">
						<c:out value="disabled=true"/>
					</c:if>>
							<c:forEach items="${matierelist}" var="matiere">
								<option 
								value='${matiere.getID_MATIERE()}'><c:out
										value="${matiere.getNOM_MATIERE()}" /></option>

							</c:forEach>s
						</select>
					</div>

					<div class="input-box">
						<span class="det">Enseignant : </span> <select name="ide"
							id="selectchef"
							<c:if test="${en != null}">
						<c:out value="disabled=true"/>
					</c:if>>
							<c:forEach items="${enseignantlist}" var="enseignant">
								<option 
							value='${enseignant.getID_ENSEIGNANT()}'><c:out
										value="${enseignant.getNom()} ${enseignant.getPrenom()}" /></option>

							</c:forEach>
						</select>
					</div>
				</div>
				<div class="button">
					<input type="reset" value="Annuler"> <input type="submit"
						name="submit" value="Ajouter">
				</div>
			</form>
		</div>
	</div>
	<%@ include file="/sidebar/base2.jsp"%>
</body>
</html>
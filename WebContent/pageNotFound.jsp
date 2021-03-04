<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Page introuvable !</title>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/pageNotFound.css" />
</head>

<body>

	<div id="notfound">
		<div class="notfound">
			<div class="notfound-404">
				<h1>404</h1>
			</div>
			<h2>OOPS ! Page introuvable !</h2>
			<p>La page que vous recherchez a peut-être été supprimée, son nom a été modifié ou elle est temporairement indisponible.</p>
			<a href="${pageContext.request.contextPath}">Retour à l'accueil</a>
		</div>
	</div>

</body>

</html>

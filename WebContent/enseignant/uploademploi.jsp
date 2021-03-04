<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
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
		<div class="title1">Charger l'emploi du temps</div>
		<form method="post" action="uploademploi" enctype="multipart/form-data">
			<div class="details">
			<%
        		String exist = (String)request.getAttribute("exist");
				
        		if(exist=="true")  {
    			%>            
      			 
        				<div class="input-box">
        				
        				 <a href="download?id=<%= request.getParameter("id") %>">
						<span class="det">Emploi Format pdf</span>
						
						</a>
						</div>
						<div class="input-box">
				
				</div>
					
    		<%
      				  }
    			%>
    			
				<div class="input-box">
					<span class="det">Id Enseignant</span>
					<input type="text" name="id" readonly value="<%= request.getParameter("id") %>">
				</div>
				
				
				<div class="input-box">
				<span class="det">Choisir un fichier</span>
				<input type="file" style="width:100px;padding:0;height:30px" name="file" size="100" accept=".pdf"/>
				 
				</div>
			</div>
			<div class="button">
				<a href="./administrateur/enseignants"><input type="reset" value="Annuler"></a>
				<input type="submit" value="Charger">
			</div>
		</form>
	</div>
	</div>
<%@ include file="/sidebar/base2.jsp" %>
</body>
</html>
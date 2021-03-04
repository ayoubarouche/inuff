<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
    <title>afficher Filiere</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
   
    <link href="http://netdna.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/profile.css">
 	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar1.css">
 
</head>
<body>
	<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Filieres" />
		<jsp:param value="filiere" name="type"/>
		<jsp:param value="filieres" name="types"/>
		<jsp:param value="${filiere.getID_FILIERE()}" name="id"/>
	</jsp:include>
<div class="container">
       
    <div class="main-body">
          <div class="row gutters-sm">
         	 <div class="col-md-4 mb-3">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex flex-column align-items-center text-center" >
                    <img src="https://www.freeiconspng.com/uploads/white-letter-f-icon-png-28.png" alt="Admin" class="rounded-circle" width="150">
                    <div class="mt-3">
                      <h4><c:out value="${filiere.getNOM_FILIERE()}"/></h4>
                      <p class="text-secondary mb-1"></p>
                      <p class="text-muted font-size-sm"></p>
                    </div>
                  </div>
                </div>
              </div>
              <br>
              <a class="btn-dark btn col-12 " href ="./affectation?id=${filiere.getID_FILIERE()}">affecter a un enseignant ou matiere</a>
    
            </div>
            <div class="col-md-8">
              <div class="card mb-3">
                <div class="card-body">
                  <div class="title1">Information </div>
                  <div class="row">
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Id </h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value='<c:out value="${filiere.getID_FILIERE()}"/>'>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nom Filière</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value='<c:out value="${filiere.getNOM_FILIERE()}"/>'>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nom Formation</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value='<c:out value="${filiere.getNOM_FORMATION()}"/>'>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Semestre</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value='<c:out value="${filiere.getSEMESTRE()}"/>'>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Chef de Filière</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value='<c:out value="${enseignant.getNom()} ${enseignant.getPrenom()}"/>' >
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="button2">
                      <button ><a href='${pageContext.request.contextPath}/administrateur/filieres/update?id=<c:out value="${filiere.getID_FILIERE()}"/>'>Modifier</a></button>
                      <button><a href='${pageContext.request.contextPath}/administrateur/delete?table=filieres&id=<c:out value="${filiere.getID_FILIERE()}"/>'>Supprimer</a></button>
                    		
                    </div>
                  </div>
                </div>
              </div>
              <div class="row gutters-sm">
                <div class="col-sm-6 mb-3">
                  <div class="card h-100">
                    <div class="card-body">
                      <div class="title1">Enseignant </div>
                      <div>
                     <c:forEach items="${filiere.getEnseignants()}" var="enseignant">
							<span class="det"><c:out value="${enseignant.getNom()} ${enseignant.getPrenom()}"/></span>
							</c:forEach> 
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-sm-6 mb-3">
                  <div class="card h-100">
                    <div class="card-body">
                      <div class="title1">Matière </div>
                      <div>
                             <c:forEach items="${filiere.getMatiers()}" var="matiere">
							<span class="det"><c:out value="${matiere.getNOM_MATIERE()}"/></span>
							</c:forEach> 
                      </div>
                    </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
    </div>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
</script>
</body>
</html>
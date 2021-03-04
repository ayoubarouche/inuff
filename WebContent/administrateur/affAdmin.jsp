<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
    <title>afficher Administrateur</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
   
    <link href="http://netdna.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/profile.css">
 	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar.css">
 
</head>
<body>
	<jsp:include page="/sidebar/base1.jsp">
		<jsp:param name="tabletype" value="Administrateurs" />
		<jsp:param value="administrateur" name="type"/>
		<jsp:param value="administrateurs" name="types"/>
		<jsp:param value="${admin.getID_ADMINISTRATEUR()}" name="id"/>
	</jsp:include>
<div class="container">
    <div class="main-body">
          <div class="row gutters-sm">
            <div class="col-md-4 mb-3">
              <div class="card  rrr">
                <div class="card-body">
                  <div class="d-flex flex-column align-items-center text-center" >
                    <img src="https://play-lh.googleusercontent.com/XU5sI5tV5flqnFjqC5auMewKDYm1Lt0pPA_kPmcrXBjP6TbVdLnrJ_GHBhGTVKWjieuS" alt="Admin" class="rounded-circle" width="150">
                    <div class="mt-3">
                           <h4><c:out value="${admin.getNom()} ${admin.getPrenom()}"/></h4>
                      <p class="text-secondary mb-1"></p>
                      <p class="text-muted font-size-sm"></p>
                    </div>
                  </div>
                </div>
              </div>
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
                      <input type="text" readonly value="${admin.getID_ADMINISTRATEUR()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nom</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="${admin.getNom()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Prenom</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="${admin.getPrenom()}">
                    </div>
                  </div>
                  <hr>
                   <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Username</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="${admin.getUsername()}">
                    </div>
                  </div>
                  <hr>
                   <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Password</h6>
                    </div>
                    
                    <div class="input-box">
                      <input type="text" readonly value="${admin.getPassword()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="button">
                      <button ><a href='${pageContext.request.contextPath}/administrateur/administrateurs/update?id=<c:out value="${admin.getID_ADMINISTRATEUR()}"/>'>Modifier</a></button>
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
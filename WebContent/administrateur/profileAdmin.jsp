<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
    <title>profile</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/profile.css">
</head>
<body>
<div class="container">
    <div class="main-body">
          <div class="row gutters-sm">
            <div class="col-md-4 mb-3">
              <div class="card  rrr">
                <div class="card-body">
                  <div class="d-flex flex-column align-items-center text-center" >
                    <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" class="rounded-circle" width="150">
                    <div class="mt-3">
                      <h4>${ens.getNom()} ${ens.getPrenom()}</h4>
                      <p class="text-secondary mb-1"></p>
                      <p class="text-muted font-size-sm"></p>
                      <div class="button1">
          
                        <button onclick="window.location.href='download?id=${ens.getID_ENSEIGNANT()}';" >Télécharger l'emploi du temps</button>
                       
                      </div>
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
                      <input type="text" readonly value="${ens.getID_ENSEIGNANT()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nom</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="${ens.getNom()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Prénom</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="${ens.getPrenom()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">UserName</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="${ens.getUsername()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Password</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="${ens.getPassword()}">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="button2">
                      <button onclick="window.location.href='edit?id=${ens.getID_ENSEIGNANT()}';" >Modifier</button>
                      <button onclick="window.location.href='delete?id=${ens.getID_ENSEIGNANT()}&table=enseignants';">Supprimer</button>
                    </div>
                  </div>
                </div>
              </div>
              <div class="row gutters-sm">
                <div class="col-sm-6 mb-3">
                  <div class="card h-100">
                    <div class="card-body">
                      <div class="title1">Matière </div>
                      <div>
                      <c:forEach var="matiere" items="${matieres}">
                        <span class="det">${matiere.getNOM_MATIERE()}</span>
                       </c:forEach>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-sm-6 mb-3">
                  <div class="card h-100">
                    <div class="card-body">
                      <div class="title1">Filière </div>
                      <div>
                        <c:forEach var="filiere" items="${filieres}">
                        <span class="det">${filiere.getNOM_FILIERE()}</span>
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
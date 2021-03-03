<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
<!doctype html>
<html lang="en">
  <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Sidebar</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sidebar1.css">
  	 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/affichage.css">
  	
	<script src="${pageContext.request.contextPath}/js/sidebar.js"></script>
	
  </head>
  <body>
<jsp:include page="../sidebar/base1.jsp"/>
 <div class="table-title">
<h3>ENSEIGNANTS</h3>
</div>
<br>

<div class="content">
    <div class="container">

        <!-- end row -->
        <c:forEach var="ele" items="${liste}" varStatus="counter">
        
        <c:if test="${counter.index % 3 == 0}"><div class="row"></c:if>
            <div class="col-lg-4">
                <div class="text-center card-box">
                    <div class="member-card pt-2 pb-2">
                        <div class="">
                            <h4>${ele.getNom()} ${ele.getPrenom()}</h4>
                        </div>
                        <button onclick="window.location.href='profileadmin?id=${ele.getID_ENSEIGNANT()}';", class="btn btn-primary mt-3 btn-rounded waves-effect w-md waves-light">Voir le Profil</button>
                        <div class="mt-4">
                            <div class="row">
                                <div class="col-4">
                                    <div class="mt-3">
                                        <h4>${ele.getFiliers().size()}</h4>
                                        <p class="mb-0 text-muted">Filieres</p>
                                    </div>
                                </div>
                                
                                <div class="col-4">
                                    <div class="mt-3">
                                        <h4>${ele.getMatiers().size()}</h4>
                                        <p class="mb-0 text-muted">Matieres</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- end col -->
        <c:if test="${counter.index % 3 == 2}"></div></c:if>
        
        </c:forEach>
    
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <!-- container -->
</div>

       
 <jsp:include page="../sidebar/base2.jsp"/>
 </body>
</html>
      
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">
  <head>
	<meta charset="utf-8">
    <title>afficher Salle</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/profile.css">
</head>
<body>
<div class="container">
    <div class="main-body">
          <div class="row gutters-sm">
            <div class="col-md-4 mb-3">
              <div class="card  rrr">
                <div class="card-body">
                  <div class="d-flex flex-column align-items-center text-center" >
                    <img src="https://play-lh.googleusercontent.com/XU5sI5tV5flqnFjqC5auMewKDYm1Lt0pPA_kPmcrXBjP6TbVdLnrJ_GHBhGTVKWjieuS" alt="Admin" class="rounded-circle" width="150">
                    <div class="mt-3">
                      <h4>Nom Salle</h4>
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
                      <input type="text" readonly value="101">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nom Salle</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="TD">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Num Salle</h6>
                    </div>
                    <div class="input-box">
                      <input type="text" readonly value="10">
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="button2">
                      <button >Modifier</button>
                      <button >Supprimer</button>
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
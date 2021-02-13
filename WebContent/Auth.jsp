<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Login Form</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/Login.css">
    <link href="https://fonts.googleapis.com/css?family=Coiny" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Libre+Baskerville" rel="stylesheet">
  </head>
  <body>
    <div class="switch-button">
  <span class="active"></span>
  <button class="switch-button-case left active-case" >Administrateur</button>
  <button class="switch-button-case right" >Enseignant</button>
</div>
    <form class="container" action="login" method="POST">
      <h1>LOGIN</h1>
      <input type="hidden" name="Admin" id="Admin" value="True" />
      <input type="text" name="Username" placeholder="Username">
      <input type="password" name="Password" placeholder="Password">
      <input type="submit" value="Login">
    </form>

  </body>
  <script>
  'use strict';

  var switchButton 			= document.querySelector('.switch-button');
  var switchBtnRight 			= document.querySelector('.switch-button-case.right');
  var switchBtnLeft 			= document.querySelector('.switch-button-case.left');
  var activeSwitch 			= document.querySelector('.active');

  function switchLeft(){
  	switchBtnRight.classList.remove('active-case');
  	switchBtnLeft.classList.add('active-case');
  	activeSwitch.style.left 						= '0%';
    document.getElementById("Admin").value = "True";


  }

  function switchRight(){
  	switchBtnRight.classList.add('active-case');
  	switchBtnLeft.classList.remove('active-case');
  	activeSwitch.style.left 						= '50%';
    document.getElementById("Admin").value = "False";
  }

  switchBtnLeft.addEventListener('click', function(){
  	switchLeft();
  }, false);

  switchBtnRight.addEventListener('click', function(){
  	switchRight();
  }, false);

</script>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
  
    %>
    <%@ page import="com.inpt.gestionecole.models.Administrateur"%>
    
<!DOCTYPE html>

<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="INPT, bienvenue dans votre département digitale">
    <meta name="description" content="">
    <title>home_admin</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/home_admin.css" media="screen">
    <script class="u-script" type="text/javascript" src="${pageContext.request.contextPath}/js/home_admin.js" defer=""></script>
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Oswald:200,300,400,500,600,700|Titillium+Web:200,200i,300,300i,400,400i,600,600i,700,700i,900">
    <meta name="theme-color" content="#478ac9">
  </head>
  <body class="u-body">
    <section class="u-clearfix u-gradient u-uploaded-video u-section-1" id="sec-3aa0">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div  style="width: 1010px;" class="u-align-center-lg u-align-center-xl u-align-left-md u-align-left-sm u-align-left-xs u-container-style u-expanded-width-md u-expanded-width-sm u-expanded-width-xs u-group u-white u-group-1">
          <div class="u-container-layout u-container-layout-1">
            <h1 class="u-text u-text-custom-color-1 u-text-default u-text-1">INPT</h1>
            <nav class="u-align-right u-menu u-menu-dropdown u-menu-open-right u-menu-1" data-submenu-level="on-click">
              <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px; font-weight: 700;">
                <a class="u-button-style u-custom-active-border-color u-custom-active-color u-custom-border u-custom-border-color u-custom-borders u-custom-hover-border-color u-custom-hover-color u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-hover-color u-custom-top-bottom-menu-spacing u-nav-link" href="#" style="padding: 5px 4px; font-size: calc(1em + 10px);">
                  <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
                  <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</symbol>
</defs></svg>
                </a>
              </div>
              <div class="u-custom-menu u-nav-container">
                <ul class="u-nav u-spacing-20 u-unstyled u-nav-1">
     <li class="u-nav-item"><a class="u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-nav-link u-text-active-custom-color-1 u-text-grey-90 u-text-hover-custom-color-2" style="padding: 18px 12px;">Administrateurs</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a href="./administrateurs" class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-nav-link u-text-active-custom-color-1 u-text-grey-90 u-text-hover-custom-color-2" style="padding: 18px 12px;">Enseignants</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a href="./enseignants" class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-nav-link u-text-active-custom-color-1 u-text-grey-90 u-text-hover-custom-color-2" style="padding: 18px 12px;">Matières</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a href="./matieres" class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-nav-link u-text-active-custom-color-1 u-text-grey-90 u-text-hover-custom-color-2" style="padding: 18px 12px;">Filières</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a href="./filieres" class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-nav-link u-text-active-custom-color-1 u-text-grey-90 u-text-hover-custom-color-2" style="padding: 18px 12px;">Salles</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a href="./salles" class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link u-white">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a href="../logout" class="u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-nav-link u-text-active-custom-color-1 u-text-grey-90 u-text-hover-custom-color-2" style="padding: 18px 12px;">Logout</a>
</li></ul>
              </div>
              <div class="u-custom-menu u-nav-container-collapse">
                <div class="u-container-style u-inner-container-layout u-sidenav">
                  <div class="u-sidenav-overflow">
                    <div class="u-menu-close u-menu-close-1"></div>
                    <ul class="u-align-center u-nav u-popupmenu-items u-spacing-0 u-text-active-custom-color-1 u-text-hover-custom-color-2 u-unstyled u-white u-nav-6"><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 18px 12px;">Administrateurs</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 18px 12px;">Enseignants</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 18px 12px;">Matières</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 18px 12px;">Filières</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 18px 12px;">Salles</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10"><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Afficher</a>
</li><li class="u-nav-item"><a class="u-active-palette-5-base u-button-style u-hover-palette-5-base u-nav-link">Ajouter</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 18px 12px;">Logout</a>
</li></ul>
                  </div>
                </div>
                <div class="u-black u-menu-overlay u-opacity u-opacity-0"></div>
              </div>
            </nav>
          </div>
        </div>
        <h1 class="u-align-center u-custom-font u-font-oswald u-text u-text-body-alt-color u-text-2">bienvenue dans votre département digitale</h1>
      </div>
    </section>
    <section class="u-align-left u-clearfix u-grey-10 u-typography-Normal--Introduction u-section-2" src="" id="carousel_d0d2">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-expanded-width u-list u-repeater u-list-1">
	<div class="u-align-center u-container-style u-custom-color-3 u-list-item u-radius-31 u-repeater-item u-shape-round " data-href="./administrateurs">
            <div class="u-container-layout u-similar-container u-valign-top u-container-layout-1"><span class="u-align-center u-custom-color-1 u-icon u-icon-circle u-spacing-15 u-icon-2"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 16.377 16.377" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-8768"></use></svg><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 16.377 16.377" x="0px" y="0px" id="svg-8768" style="enable-background:new 0 0 16.377 16.377;"><g><g><path style="fill:currentColor;" d="M4.331,5.043c0.042,0.256,0.141,0.417,0.238,0.52c0.231,1.54,1.521,2.97,2.698,2.97    c1.373,0,2.623-1.547,2.865-2.967c0.098-0.101,0.199-0.264,0.242-0.522c0.078-0.289,0.18-0.791,0.002-1.025    c-0.01-0.012-0.02-0.023-0.029-0.034c0.166-0.606,0.377-1.858-0.375-2.711C9.906,1.188,9.486,0.686,8.585,0.42L8.158,0.271    C7.45,0.052,7.004,0.004,6.986,0.001c-0.031-0.003-0.065,0-0.096,0.008C6.865,0.016,6.782,0.038,6.716,0.03    C6.547,0.006,6.293,0.093,6.248,0.11c-0.06,0.023-1.43,0.573-1.846,1.849C4.363,2.063,4.197,2.605,4.418,3.936    C4.385,3.958,4.355,3.985,4.33,4.019C4.152,4.253,4.252,4.754,4.331,5.043z M4.869,2.141C4.872,2.135,4.874,2.128,4.877,2.12    c0.339-1.052,1.541-1.538,1.549-1.542c0.055-0.021,0.162-0.051,0.219-0.051c0.118,0.016,0.254-0.005,0.328-0.022    C7.094,0.522,7.47,0.583,8.001,0.747l0.432,0.148c0.801,0.237,1.141,0.681,1.143,0.684c0.006,0.007,0.012,0.013,0.016,0.019    c0.695,0.783,0.338,2.079,0.211,2.457C9.774,4.144,9.795,4.242,9.86,4.308c0.033,0.034,0.072,0.057,0.115,0.069    C9.977,4.5,9.942,4.725,9.887,4.922C9.885,4.931,9.883,4.941,9.881,4.95C9.86,5.089,9.813,5.19,9.75,5.236    c-0.053,0.04-0.09,0.101-0.1,0.167c-0.166,1.19-1.268,2.629-2.382,2.629c-0.938,0-2.055-1.325-2.213-2.624    C5.047,5.34,5.012,5.279,4.956,5.238c-0.063-0.048-0.11-0.15-0.131-0.287c-0.001-0.01-0.003-0.02-0.006-0.029    C4.768,4.739,4.735,4.53,4.732,4.404c0.047-0.005,0.094-0.021,0.134-0.053c0.074-0.058,0.11-0.152,0.092-0.245    C4.683,2.662,4.869,2.141,4.869,2.141z"></path><path style="fill:currentColor;" d="M12.224,9.363c-0.738-0.487-1.855-0.84-1.855-0.84C9.248,8.127,9.24,7.733,9.24,7.733    c-2.203,4.344-3.876,0.014-3.876,0.014C5.21,8.333,2.941,9.021,2.941,9.021C2.278,9.275,1.998,9.657,1.998,9.657    c-0.98,1.454-1.096,4.689-1.096,4.689c0.013,0.739,0.332,0.816,0.332,0.816c2.254,1.006,5.792,1.185,5.792,1.185    c0.985,0.021,1.894-0.047,2.701-0.154c-0.773-0.723-1.262-1.748-1.262-2.887C8.464,11.192,10.134,9.465,12.224,9.363z"></path><path style="fill:currentColor;" d="M12.269,9.963c-1.768,0-3.207,1.438-3.207,3.207c0,1.771,1.439,3.207,3.207,3.207    c1.77,0,3.207-1.437,3.207-3.207C15.476,11.402,14.038,9.963,12.269,9.963z M12.058,14.747c-0.068,0.067-0.178,0.067-0.246,0    l-1.543-1.555c-0.068-0.066-0.068-0.178,0-0.245l0.369-0.369c0.068-0.067,0.178-0.067,0.246,0l1.053,1.061l2.045-2.044    c0.066-0.068,0.178-0.068,0.246,0l0.367,0.367c0.068,0.068,0.068,0.18,0,0.248L12.058,14.747z"></path>
</g>
</g></svg></span>
              <h3 class="u-custom-font u-font-titillium-Web u-text u-text-2">Administrateurs</h3>
            </div>
          </div>
          <div class="u-align-center u-container-style u-custom-color-3 u-list-item u-radius-31 u-repeater-item u-shape-round" data-href="./enseignants">
            <div class="u-container-layout u-similar-container u-valign-top u-container-layout-1"><span class="u-align-center u-custom-color-1 u-icon u-icon-circle u-spacing-15 u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 55 55" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-cd07"></use></svg><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 55 55" x="0px" y="0px" id="svg-cd07" style="enable-background:new 0 0 55 55;"><path d="M55,27.5C55,12.337,42.663,0,27.5,0S0,12.337,0,27.5c0,8.009,3.444,15.228,8.926,20.258l-0.026,0.023l0.892,0.752
	c0.058,0.049,0.121,0.089,0.179,0.137c0.474,0.393,0.965,0.766,1.465,1.127c0.162,0.117,0.324,0.234,0.489,0.348
	c0.534,0.368,1.082,0.717,1.642,1.048c0.122,0.072,0.245,0.142,0.368,0.212c0.613,0.349,1.239,0.678,1.88,0.98
	c0.047,0.022,0.095,0.042,0.142,0.064c2.089,0.971,4.319,1.684,6.651,2.105c0.061,0.011,0.122,0.022,0.184,0.033
	c0.724,0.125,1.456,0.225,2.197,0.292c0.09,0.008,0.18,0.013,0.271,0.021C25.998,54.961,26.744,55,27.5,55
	c0.749,0,1.488-0.039,2.222-0.098c0.093-0.008,0.186-0.013,0.279-0.021c0.735-0.067,1.461-0.164,2.178-0.287
	c0.062-0.011,0.125-0.022,0.187-0.034c2.297-0.412,4.495-1.109,6.557-2.055c0.076-0.035,0.153-0.068,0.229-0.104
	c0.617-0.29,1.22-0.603,1.811-0.936c0.147-0.083,0.293-0.167,0.439-0.253c0.538-0.317,1.067-0.648,1.581-1
	c0.185-0.126,0.366-0.259,0.549-0.391c0.439-0.316,0.87-0.642,1.289-0.983c0.093-0.075,0.193-0.14,0.284-0.217l0.915-0.764
	l-0.027-0.023C51.523,42.802,55,35.55,55,27.5z M2,27.5C2,13.439,13.439,2,27.5,2S53,13.439,53,27.5
	c0,7.577-3.325,14.389-8.589,19.063c-0.294-0.203-0.59-0.385-0.893-0.537l-8.467-4.233c-0.76-0.38-1.232-1.144-1.232-1.993v-2.957
	c0.196-0.242,0.403-0.516,0.617-0.817c1.096-1.548,1.975-3.27,2.616-5.123c1.267-0.602,2.085-1.864,2.085-3.289v-3.545
	c0-0.867-0.318-1.708-0.887-2.369v-4.667c0.052-0.519,0.236-3.448-1.883-5.864C34.524,9.065,31.541,8,27.5,8
	s-7.024,1.065-8.867,3.168c-2.119,2.416-1.935,5.345-1.883,5.864v4.667c-0.568,0.661-0.887,1.502-0.887,2.369v3.545
	c0,1.101,0.494,2.128,1.34,2.821c0.81,3.173,2.477,5.575,3.093,6.389v2.894c0,0.816-0.445,1.566-1.162,1.958l-7.907,4.313
	c-0.252,0.137-0.502,0.297-0.752,0.476C5.276,41.792,2,35.022,2,27.5z M42.459,48.132c-0.35,0.254-0.706,0.5-1.067,0.735
	c-0.166,0.108-0.331,0.216-0.5,0.321c-0.472,0.292-0.952,0.57-1.442,0.83c-0.108,0.057-0.217,0.111-0.326,0.167
	c-1.126,0.577-2.291,1.073-3.488,1.476c-0.042,0.014-0.084,0.029-0.127,0.043c-0.627,0.208-1.262,0.393-1.904,0.552
	c-0.002,0-0.004,0.001-0.006,0.001c-0.648,0.16-1.304,0.293-1.964,0.402c-0.018,0.003-0.036,0.007-0.054,0.01
	c-0.621,0.101-1.247,0.174-1.875,0.229c-0.111,0.01-0.222,0.017-0.334,0.025C28.751,52.97,28.127,53,27.5,53
	c-0.634,0-1.266-0.031-1.895-0.078c-0.109-0.008-0.218-0.015-0.326-0.025c-0.634-0.056-1.265-0.131-1.89-0.233
	c-0.028-0.005-0.056-0.01-0.084-0.015c-1.322-0.221-2.623-0.546-3.89-0.971c-0.039-0.013-0.079-0.027-0.118-0.04
	c-0.629-0.214-1.251-0.451-1.862-0.713c-0.004-0.002-0.009-0.004-0.013-0.006c-0.578-0.249-1.145-0.525-1.705-0.816
	c-0.073-0.038-0.147-0.074-0.219-0.113c-0.511-0.273-1.011-0.568-1.504-0.876c-0.146-0.092-0.291-0.185-0.435-0.279
	c-0.454-0.297-0.902-0.606-1.338-0.933c-0.045-0.034-0.088-0.07-0.133-0.104c0.032-0.018,0.064-0.036,0.096-0.054l7.907-4.313
	c1.36-0.742,2.205-2.165,2.205-3.714l-0.001-3.602l-0.23-0.278c-0.022-0.025-2.184-2.655-3.001-6.216l-0.091-0.396l-0.341-0.221
	c-0.481-0.311-0.769-0.831-0.769-1.392v-3.545c0-0.465,0.197-0.898,0.557-1.223l0.33-0.298v-5.57l-0.009-0.131
	c-0.003-0.024-0.298-2.429,1.396-4.36C21.583,10.837,24.061,10,27.5,10c3.426,0,5.896,0.83,7.346,2.466
	c1.692,1.911,1.415,4.361,1.413,4.381l-0.009,5.701l0.33,0.298c0.359,0.324,0.557,0.758,0.557,1.223v3.545
	c0,0.713-0.485,1.36-1.181,1.575l-0.497,0.153l-0.16,0.495c-0.59,1.833-1.43,3.526-2.496,5.032c-0.262,0.37-0.517,0.698-0.736,0.949
	l-0.248,0.283V39.8c0,1.612,0.896,3.062,2.338,3.782l8.467,4.233c0.054,0.027,0.107,0.055,0.16,0.083
	C42.677,47.979,42.567,48.054,42.459,48.132z"></path></svg></span>
              <h3 class="u-custom-font u-font-titillium-Web u-text u-text-1">Enseignants</h3>
            </div>
          </div>
          <div class="u-align-center u-container-style u-custom-color-3 u-list-item u-radius-31 u-repeater-item u-shape-round u-video-cover u-list-item-2" data-href="./matieres">
            <div class="u-container-layout u-similar-container u-valign-top u-container-layout-2"><span class="u-align-center u-custom-color-1 u-icon u-icon-circle u-spacing-15 u-icon-2"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 60 60" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-d606"></use></svg><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 60 60" x="0px" y="0px" id="svg-d606" style="enable-background:new 0 0 60 60;"><g><path d="M45,25H20c-0.552,0-1,0.447-1,1s0.448,1,1,1h25c0.552,0,1-0.447,1-1S45.552,25,45,25z"></path><path d="M20,19h10c0.552,0,1-0.447,1-1s-0.448-1-1-1H20c-0.552,0-1,0.447-1,1S19.448,19,20,19z"></path><path d="M45,33H20c-0.552,0-1,0.447-1,1s0.448,1,1,1h25c0.552,0,1-0.447,1-1S45.552,33,45,33z"></path><path d="M45,41H20c-0.552,0-1,0.447-1,1s0.448,1,1,1h25c0.552,0,1-0.447,1-1S45.552,41,45,41z"></path><path d="M45,49H20c-0.552,0-1,0.447-1,1s0.448,1,1,1h25c0.552,0,1-0.447,1-1S45.552,49,45,49z"></path><path d="M49,14.586V0H6v55h5v5h43V19.586L49,14.586z M40,8.414l9,9L50.586,19H40V8.414z M8,53V2h39v10.586L39.414,5H11v48H8z
		 M13,58v-3V7h25v14h14v37H13z"></path>
</g></svg></span>
              <h3 class="u-custom-font u-font-titillium-Web u-text u-text-2">Matières</h3>
            </div>
          </div>
          <div class="u-align-center u-container-style u-custom-color-3 u-list-item u-radius-31 u-repeater-item u-shape-round" data-href="./filieres">
            <div class="u-container-layout u-similar-container u-valign-top u-container-layout-3"><span class="u-align-center u-custom-color-1 u-icon u-icon-circle u-spacing-15 u-icon-3"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 512.001 512" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-855c"></use></svg><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 512.001 512" id="svg-855c"><path d="m99.820312 119.785156c33.023438 0 59.890626-26.867187 59.890626-59.894531 0-33.023437-26.867188-59.890625-59.890626-59.890625-33.023437 0-59.890624 26.867188-59.890624 59.890625 0 33.027344 26.867187 59.894531 59.890624 59.894531zm0-79.855468c11.007813 0 19.964844 8.953124 19.964844 19.960937 0 11.011719-8.957031 19.964844-19.964844 19.964844-11.007812 0-19.964843-8.953125-19.964843-19.964844 0-11.007813 8.957031-19.960937 19.964843-19.960937zm214.613282 235.613281h70.957031c8.441406 26.035156 32.914063 44.917969 61.726563 44.917969 35.777343 0 64.882812-29.105469 64.882812-64.882813s-29.105469-64.882813-64.882812-64.882813c-28.8125 0-53.285157 18.882813-61.726563 44.917969h-70.957031v-149.730469h71.296875c8.738281 25.519532 32.945312 43.921876 61.386719 43.921876 35.777343 0 64.882812-29.105469 64.882812-64.882813s-29.105469-64.8828125-64.882812-64.8828125c-29.179688 0-53.914063 19.3632815-62.046876 45.9179685h-110.566406v189.65625h-74.863281v-36.972656c0-33.023437-26.867187-59.890625-59.890625-59.890625h-79.859375c-33.023437 0-59.890625 26.867188-59.890625 59.890625v167.699219h39.929688v144.738281h39.925781v-184.667969h-39.925781v-127.769531c0-11.007813 8.953124-19.960937 19.960937-19.960937h79.859375c11.007812 0 19.960938 8.953124 19.960938 19.960937v127.769531h-39.925782v184.667969h39.925782v-144.738281h39.929687v-90.796875h74.863281v189.65625h110.5625c8.132813 26.554687 32.871094 45.917969 62.050782 45.917969 35.777343 0 64.882812-29.105469 64.882812-64.882813s-29.105469-64.882813-64.882812-64.882813c-28.441407 0-52.648438 18.402344-61.386719 43.921876h-71.296875zm132.683594-44.921875c13.761718 0 24.953124 11.195312 24.953124 24.957031s-11.191406 24.953125-24.953124 24.953125c-13.761719 0-24.957032-11.191406-24.957032-24.953125s11.195313-24.957031 24.957032-24.957031zm0-190.65625c13.761718 0 24.953124 11.195312 24.953124 24.957031s-11.191406 24.953125-24.953124 24.953125c-13.761719 0-24.957032-11.191406-24.957032-24.953125s11.195313-24.957031 24.957032-24.957031zm0 381.3125c13.761718 0 24.953124 11.195312 24.953124 24.957031s-11.191406 24.953125-24.953124 24.953125c-13.761719 0-24.957032-11.191406-24.957032-24.953125s11.195313-24.957031 24.957032-24.957031zm0 0"></path></svg></span>
              <h3 class="u-custom-font u-font-titillium-Web u-text u-text-3">Filières</h3>
            </div>
          </div>
          <div class="u-align-center u-container-style u-custom-color-3 u-list-item u-radius-31 u-repeater-item u-shape-round" data-href="./salles">
            <div class="u-container-layout u-similar-container u-valign-top u-container-layout-4"><span class="u-align-center u-custom-color-1 u-icon u-icon-circle u-spacing-15 u-icon-4"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 508 508" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-7293"></use></svg><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" xml:space="preserve" class="u-svg-content" viewBox="0 0 508 508" x="0px" y="0px" id="svg-7293" style="enable-background:new 0 0 508 508;"><g><g><path d="M417.9,491.6V0H90.1v491.6H0V508h508v-16.4H417.9z M106.5,491.6V16.4h220.4L155.7,50.6v406.7L327,491.6H106.5z     M401.5,489.8l-229.4-45.9V64.1l229.4-45.9V489.8z"></path>
</g>
</g><g><g><path d="M221.2,228.4c-14.1,0-25.6,11.5-25.6,25.6c0,14.1,11.5,25.6,25.6,25.6c14.1,0,25.6-11.5,25.6-25.6    C246.8,239.9,235.3,228.4,221.2,228.4z M221.2,263.2c-5.1,0-9.2-4.1-9.2-9.2c0-5.1,4.1-9.2,9.2-9.2s9.2,4.1,9.2,9.2    S226.3,263.2,221.2,263.2z"></path>
</g>
</g></svg></span>
              <h3 class="u-custom-font u-font-titillium-Web u-text u-text-4">Salles</h3>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
    <footer class="u-align-center u-clearfix u-custom-color-1 u-footer u-footer" id="sec-835c"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">copyright Â© 2021</p>
      </div></footer>
  </body>
</html>
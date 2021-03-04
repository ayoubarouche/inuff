# projet_jee
created by :
	AROUCHE AYOUB
	SOULTANA AICHA
	SAMI EL AMRAOUI
	JAAFAR BELHADJ
# PROJET ARCHITECTURE is MVC : MODEL VIEW CONTROLLER 
  # com.inpt.gestionecole.appControllers
		 contains the servlets that controls the all website
  # com.inpt.gestionecole.config 
		 contains the configuration java classes like connection to database : each one of us need to modify it 

  # com.inpt.gestionecole.databaseControllers
		 contains the controllers of database (dao ) for now these is the package that we will work on it !!!!!!!!!!!!!!!!!!!!!!!!! 
  # com.inpt.gestionecole.models 
		 contains the model or the object that represent the database table
  # com.inpt.gestionecole.shared
		 contains the shared classes and interfaces between administration and teacher
  # com.inpt.gestionecole.tests
		we will do our tests here for database using the main method you can see an exemple that i have created

# SETUP
***************Etape1***************

Import project in eclipse from git 

***************Etape2***************

Maven update project ( TO DOWNLOAD LIBRARIES RELATED TO HIBERNATE AND MYSQL ) 

***************Etape3***************

Database create in mysql server with script in dbForProjeJee.txt and create useradmin for login  in administrateur table


***************Etape4***************
Update your database information (url,username,password) in hibernate.cfg.xml and 

# END
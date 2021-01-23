package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;

import com.inpt.gestionecole.config.Connexion;

public class AffectationMatiereController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple

	public AffectationMatiereController() {
		conn = Connexion.getConnection();
	}
	// here the methods that we will need
}

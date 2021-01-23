package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;

import com.inpt.gestionecole.config.Connexion;

public class HoraireController {
	Connection conn ;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple
	
	public HoraireController() {
		conn = Connexion.getConnection();
	}
	// here add the methods that you will need
}

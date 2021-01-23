package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.shared.User;
import com.inpt.gestionecole.shared.UserController;

public class EnseignantController implements UserController {
	Connection conn = null;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple
	
	public EnseignantController() {
		conn = Connexion.getConnection();
	}

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub

	}
		// here add the methods for the enseignant controller
}

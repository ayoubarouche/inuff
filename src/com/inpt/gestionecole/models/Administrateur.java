package com.inpt.gestionecole.models;

import com.inpt.gestionecole.shared.User;

public class Administrateur extends User {
	int ID_ADMINISTRATEUR;

	public Administrateur() {
		super();
	}

	public Administrateur(int ID_ADMINISTRATEUR) {
		this.ID_ADMINISTRATEUR = ID_ADMINISTRATEUR;
	}

	public Administrateur(int ID_ADMINISTRATEUR, String username, String password, String nom, String prenom) {
		super(username, password, nom, prenom);
		this.ID_ADMINISTRATEUR = ID_ADMINISTRATEUR;
		// TODO Auto-generated constructor stub
	}

	public int getID_ADMINISTRATEUR() {
		return ID_ADMINISTRATEUR;
	}

	public void setID_ADMINISTRATEUR(int iD_ADMINISTRATEUR) {
		ID_ADMINISTRATEUR = iD_ADMINISTRATEUR;
	}

}

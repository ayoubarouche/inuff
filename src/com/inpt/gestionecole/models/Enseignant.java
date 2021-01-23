package com.inpt.gestionecole.models;

import com.inpt.gestionecole.shared.User;

public class Enseignant extends User {
	int ID_ENSEIGNANT;

	public Enseignant() {
		super();
	}

	public Enseignant(int iD_ENSEIGNANT) {
		this.ID_ENSEIGNANT = iD_ENSEIGNANT;
	}

	public Enseignant(int ID_ENSEIGNANT, String username, String password, String nom, String prenom, String id) {
		super(username, password, nom, prenom, id);
		this.ID_ENSEIGNANT = ID_ENSEIGNANT;
		// TODO Auto-generated constructor stub
	}

	public int getID_ENSEIGNANT() {
		return ID_ENSEIGNANT;
	}

	public void setID_ENSEIGNANT(int iD_ENSEIGNANT) {
		ID_ENSEIGNANT = iD_ENSEIGNANT;
	}

}

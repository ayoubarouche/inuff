package com.inpt.gestionecole.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.inpt.gestionecole.shared.User;

public class Enseignant  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_ENSEIGNANT")
	private int ID_ENSEIGNANT;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "MDP_ENSEIGNANT")
	private String password;
	@Column(name = "NOM_ENSEIGNANT")
	private String nom;
	@Column(name = "PRENOM_ENSEIGNANT")
	private String prenom;
	
	public Enseignant() {
		super();
	}

	public Enseignant(int iD_ENSEIGNANT) {
		this.ID_ENSEIGNANT = iD_ENSEIGNANT;
	}

	public Enseignant(int ID_ENSEIGNANT, String username, String password, String nom, String prenom) {
	//	super(username, password, nom, prenom);
		this.ID_ENSEIGNANT = ID_ENSEIGNANT;
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;	
	}

	public int getID_ENSEIGNANT() {
		return ID_ENSEIGNANT;
	}

	public void setID_ENSEIGNANT(int iD_ENSEIGNANT) {
		ID_ENSEIGNANT = iD_ENSEIGNANT;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}

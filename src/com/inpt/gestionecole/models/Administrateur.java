package com.inpt.gestionecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.inpt.gestionecole.shared.User;

@Entity
@Table(name = "Administrateur")
public class Administrateur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_ADMIN")
	private int ID_ADMINISTRATEUR;
	@Column(name ="USERNAME")
	private String username;
	@Column(name ="MDP_ADMIN")
	private String password;
	@Column(name ="NOM_ADMIN")
	private String nom;
	@Column(name ="PRENOM_ADMIN")
	private String prenom;
	
	public Administrateur() {
		super();
	}

	public Administrateur(int ID_ADMINISTRATEUR) {
		this.ID_ADMINISTRATEUR = ID_ADMINISTRATEUR;
	}

	public Administrateur(int ID_ADMINISTRATEUR, String username, String password, String nom, String prenom) {
	//	super(username, password, nom, prenom);
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.ID_ADMINISTRATEUR = ID_ADMINISTRATEUR;
		// TODO Auto-generated constructor stub
	}

	public int getID_ADMINISTRATEUR() {
		return ID_ADMINISTRATEUR;
	}

	public void setID_ADMINISTRATEUR(int iD_ADMINISTRATEUR) {
		ID_ADMINISTRATEUR = iD_ADMINISTRATEUR;
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

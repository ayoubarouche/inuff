package com.inpt.gestionecole.models;

public class Planning {
	private int ID_Planning;
	AffectationMatiere affectation;
	Filiere filiere;
	Salle salle ;
	Horaire horaire;

	public Planning() {

	}
	
	public Planning(int iD_Planning) {
		super();
		ID_Planning = iD_Planning;
	}

	public Planning(int iD_Planning, AffectationMatiere affectation, Filiere filiere,Salle salle, Horaire horaire) {
		super();
		ID_Planning = iD_Planning;
		this.affectation = affectation ; 
		this.filiere = filiere;
		this.horaire = horaire;
		this.salle = salle; 
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public int getID_Planning() {
		return ID_Planning;
	}

	public void setID_Planning(int iD_Planning) {
		ID_Planning = iD_Planning;
	}

	public AffectationMatiere getAffectation() {
		return affectation;
	}

	public void setAffectation(AffectationMatiere affectation) {
		this.affectation = affectation;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Horaire getHoraire() {
		return horaire;
	}

	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}

}

package com.inpt.gestionecole.models;

public class EmploiDuTemps {
	private int ID_EMPLOI;
	Enseignant enseignant;
	Matiere matiere;
	Filiere filiere;
	Salle salle ;
	Horaire horaire;

	public EmploiDuTemps() {

	}
	
	public EmploiDuTemps(int iD_EMPLOI) {
		super();
		ID_EMPLOI = iD_EMPLOI;
	}

	public EmploiDuTemps(int iD_EMPLOI, Enseignant enseignant, Matiere matiere, Filiere filiere,Salle salle, Horaire horaire) {
		super();
		ID_EMPLOI = iD_EMPLOI;
		this.enseignant = enseignant;
		this.matiere = matiere;
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

	public int getID_EMPLOI() {
		return ID_EMPLOI;
	}

	public void setID_EMPLOI(int iD_EMPLOI) {
		ID_EMPLOI = iD_EMPLOI;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
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

package com.inpt.gestionecole.models;

public class AffectationMatiere {
	int ID_AFFECTATION_MATIERE;
	Enseignant enseignant;
	Matiere matiere;
	public AffectationMatiere() {
		
	}
	public AffectationMatiere(int iD_AFFECTATION_MATIERE) {
		super();
		ID_AFFECTATION_MATIERE = iD_AFFECTATION_MATIERE;
	}

	public AffectationMatiere(int iD_AFFECTATION_MATIERE, Enseignant enseignant, Matiere matiere) {
		super();
		ID_AFFECTATION_MATIERE = iD_AFFECTATION_MATIERE;
		this.enseignant = enseignant;
		this.matiere = matiere;
	}

	public int getID_AFFECTATION_MATIERE() {
		return ID_AFFECTATION_MATIERE;
	}

	public void setID_AFFECTATION_MATIERE(int iD_AFFECTATION_MATIERE) {
		ID_AFFECTATION_MATIERE = iD_AFFECTATION_MATIERE;
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

}

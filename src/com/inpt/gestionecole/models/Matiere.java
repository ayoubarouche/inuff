package com.inpt.gestionecole.models;

public class Matiere {
	int ID_MATIERE;
	private String NOM_MATIERE;

	public Matiere() {

	}
	public Matiere (int iD_MATIERE ) {
		this.ID_MATIERE  = iD_MATIERE;
	}
	public Matiere(int iD_MATIERE, String nOM_MATIERE) {
		super();
		ID_MATIERE = iD_MATIERE;
		NOM_MATIERE = nOM_MATIERE;
	}

	public int getID_MATIERE() {
		return ID_MATIERE;
	}

	public void setID_MATIERE(int iD_MATIERE) {
		ID_MATIERE = iD_MATIERE;
	}

	public String getNOM_MATIERE() {
		return NOM_MATIERE;
	}

	public void setNOM_MATIERE(String nOM_MATIERE) {
		NOM_MATIERE = nOM_MATIERE;
	}

}

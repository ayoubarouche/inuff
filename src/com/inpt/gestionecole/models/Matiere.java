package com.inpt.gestionecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity  
@Table(name="Matiere")  
public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_MATIERE")
	int ID_MATIERE;
	@Column(name = "NOM_MATIERE")
	private String NOM_MATIERE;
	@Column(name = "SEMESTRE")
	private String SEMESTRE;

	public Matiere() {

	}
	public Matiere (int iD_MATIERE ) {
		this.ID_MATIERE  = iD_MATIERE;
	}
	public Matiere(int iD_MATIERE, String nOM_MATIERE, String sEMESTRE) {
		super();
		ID_MATIERE = iD_MATIERE;
		NOM_MATIERE = nOM_MATIERE;
		SEMESTRE = sEMESTRE;
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
	public String getSEMESTRE() {
		return SEMESTRE;
	}

	public void setSEMESTRE(String sEMESTRE) {
		SEMESTRE = sEMESTRE;
	}


}

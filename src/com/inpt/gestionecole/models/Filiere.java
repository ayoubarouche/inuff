package com.inpt.gestionecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Filiere")
public class Filiere {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int ID_FILIERE;
	@Column
	String NOM_FILIERE;
	@Column
	String NOM_FORMATION;
	@Column
	String SEMESTRE;
	@Column // the semester id
	int CHEF_DE_FILIERE; // responsable de la filiere

	public Filiere() {
		super();
	}

	public Filiere(int iD_FILIERE) {
		this.ID_FILIERE = iD_FILIERE;
	}

	public Filiere(int iD_FILIERE, String nOM_FILIERE, String nOM_FORMATION, String sEMESTRE,
			int cHEF_DE_FILIERE) {
		super();
		ID_FILIERE = iD_FILIERE;
		NOM_FILIERE = nOM_FILIERE;
		NOM_FORMATION = nOM_FORMATION;
		SEMESTRE = sEMESTRE;
		CHEF_DE_FILIERE = cHEF_DE_FILIERE;
	}

	public int getID_FILIERE() {
		return ID_FILIERE;
	}

	public void setID_FILIERE(int iD_FILIERE) {
		ID_FILIERE = iD_FILIERE;
	}

	public String getNOM_FILIERE() {
		return NOM_FILIERE;
	}

	public void setNOM_FILIERE(String nOM_FILIERE) {
		NOM_FILIERE = nOM_FILIERE;
	}

	public String getNOM_FORMATION() {
		return NOM_FORMATION;
	}

	public void setNOM_FORMATION(String nOM_FORMATION) {
		NOM_FORMATION = nOM_FORMATION;
	}

	public String getSEMESTRE() {
		return SEMESTRE;
	}

	public void setSEMESTRE(String sEMESTRE) {
		SEMESTRE = sEMESTRE;
	}

	public int getCHEF_DE_FILIERE() {
		return CHEF_DE_FILIERE;
	}

	public void setCHEF_DE_FILIERE(int cHEF_DE_FILIERE) {
		CHEF_DE_FILIERE = cHEF_DE_FILIERE;
	}

}

package com.inpt.gestionecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Salle")
public class Salle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SALLE")
	private int ID_SALLE;
	@Column(name = "NOM_SALLE")
	private String NOM_SALLE;
	@Column(name = "NUM_SALLE")
	private int NUM_SALLE;

	public Salle() {
		
	}

	public Salle(int iD_SALLE) {
		
		this.ID_SALLE = iD_SALLE;
	}

	public Salle(int iD_SALLE, String nOM_SALLE,int nUM_SALLE) {
		super();
		ID_SALLE = iD_SALLE;
		NOM_SALLE = nOM_SALLE;
		NUM_SALLE = nUM_SALLE;
	}

	public int getID_SALLE() {
		return ID_SALLE;
	}

	public void setID_SALLE(int iD_SALLE) {
		ID_SALLE = iD_SALLE;
	}

	public String getNOM_SALLE() {
		return NOM_SALLE;
	}

	public void setNOM_SALLE(String nOM_SALLE) {
		NOM_SALLE = nOM_SALLE;
	}
	
	public int getNUM_SALLE() {
		return NUM_SALLE;
	}

	public void setNUM_SALLE(int nUM_SALLE) {
		NUM_SALLE = nUM_SALLE;
	}

}

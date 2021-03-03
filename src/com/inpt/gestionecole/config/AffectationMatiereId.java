package com.inpt.gestionecole.config;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AffectationMatiereId implements Serializable {
	@Column(name = "ID_ENSEIGNANT")
	int ID_ENSEIGNANT;
	@Column(name = "ID_FILIERE")
	int ID_FILIERE;
	@Column(name = "ID_MATIERE")
	int ID_MATIERE;
	public AffectationMatiereId() {
		
	}
	
	public AffectationMatiereId(int iD_ENSEIGNANT, int iD_FILIERE, int iD_MATIERE) {
		super();
		ID_ENSEIGNANT = iD_ENSEIGNANT;
		ID_FILIERE = iD_FILIERE;
		ID_MATIERE = iD_MATIERE;
	}

	public int getID_ENSEIGNANT() {
		return ID_ENSEIGNANT;
	}
	public void setID_ENSEIGNANT(int iD_ENSEIGNANT) {
		ID_ENSEIGNANT = iD_ENSEIGNANT;
	}
	public int getID_FILIERE() {
		return ID_FILIERE;
	}
	public void setID_FILIERE(int iD_FILIERE) {
		ID_FILIERE = iD_FILIERE;
	}
	public int getID_MATIERE() {
		return ID_MATIERE;
	}
	public void setID_MATIERE(int iD_MATIERE) {
		ID_MATIERE = iD_MATIERE;
	}
/*	  @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass())
	            return false;
	 
	        AffectationMatiereId that = (AffectationMatiereId) o;
	        return Objects.equals(ID_ENSEIGNANT, that.getID_ENSEIGNANT()) &&
	               Objects.equals(ID_MATIERE, that.getID_MATIERE()) && Objects.equals(ID_FILIERE, that.getID_FILIERE());
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(ID_ENSEIGNANT, ID_FILIERE,ID_MATIERE);
	    }*/
}

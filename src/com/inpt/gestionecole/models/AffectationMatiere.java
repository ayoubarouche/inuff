package com.inpt.gestionecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import java.util.List;

@Entity  
@Table(name="Affectation")  
public class AffectationMatiere {
	@Id   
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "ID_AFFECTATION")
	int ID_AFFECTATION_MATIERE;
	
	@OneToMany
	@JoinColumn(name="ID_ENSEIGNANT")
	List<Enseignant> enseignants;
	
	@OneToMany
	@JoinColumn(name="ID_MATIERE")
	List<Matiere> matieres;
	
	public AffectationMatiere() {
		
	}
	public AffectationMatiere(int iD_AFFECTATION_MATIERE) {
		super();
		ID_AFFECTATION_MATIERE = iD_AFFECTATION_MATIERE;
	}

	public AffectationMatiere(int iD_AFFECTATION_MATIERE, List<Enseignant> enseignant, List<Matiere> matiere) {
		super();
		ID_AFFECTATION_MATIERE = iD_AFFECTATION_MATIERE;
		this.enseignants = enseignant;
		this.matieres = matiere;
	}

	public int getID_AFFECTATION_MATIERE() {
		return ID_AFFECTATION_MATIERE;
	}

	public void setID_AFFECTATION_MATIERE(int iD_AFFECTATION_MATIERE) {
		ID_AFFECTATION_MATIERE = iD_AFFECTATION_MATIERE;
	}
	public List<Enseignant> getEnseignants() {
		return enseignants;
	}
	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	public List<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}



}

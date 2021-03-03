package com.inpt.gestionecole.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.inpt.gestionecole.databaseControllers.AffectationMatiereController;

@Entity
@Table(name = "Filiere")
public class Filiere {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int ID_FILIERE;
	@Column
	String NOM_FILIERE;
	@Column
	String NOM_FORMATION;
	@Column
	String SEMESTRE;
	@Column // the semester id
	int CHEF_DE_FILIERE; // responsable de la filiere
	@OneToMany(mappedBy = "filiere", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AffectationMatiere> matier_enseignant = new ArrayList<>();
	
	@Transient
	private AffectationMatiereController amc = new AffectationMatiereController();
	public Filiere() {
		super();
	}

	public Filiere(int iD_FILIERE) {
		this.ID_FILIERE = iD_FILIERE;
	}

	public Filiere(int iD_FILIERE, String nOM_FILIERE, String nOM_FORMATION, String sEMESTRE, int cHEF_DE_FILIERE) {
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

	public List<AffectationMatiere> getMatier_enseignant() {
		return matier_enseignant;
	}

	public void setMatier_enseignant(List<AffectationMatiere> matier_enseignant) {
		this.matier_enseignant = matier_enseignant;
	}

	public void AddEnseignantAndMatiere(Enseignant enseignant, Matiere matiere) {
		AffectationMatiere affectation = new AffectationMatiere(enseignant, this, matiere);
		matier_enseignant.add(affectation);
		matiere.getFiliere_enseignant().add(affectation);
		enseignant.getMatier_filiere().add(affectation);
		amc.add(affectation);
	}

	public void RemoveEnseignantAndMatiere(Enseignant enseignant, Matiere matiere) {
		for (Iterator<AffectationMatiere> iterator = matier_enseignant.iterator(); iterator.hasNext();) {
			AffectationMatiere affectation = iterator.next();

			if (affectation.getEnseignant().equals(enseignant) && affectation.getFiliere().equals(this)
					&& affectation.getMatiere().equals(matiere)) {
				iterator.remove();
				affectation.getEnseignant().getMatier_filiere().remove(affectation);
				affectation.getMatiere().getFiliere_enseignant().remove(affectation);
				affectation.setEnseignant(null);
				affectation.setFiliere(null);
				affectation.setMatiere(null);
				amc.deleteAffectationMatiere(affectation);
			}
		}
	}
	public Set<Matiere> getMatiers(){
		Set<Matiere> matiers = new HashSet<>();
		for(AffectationMatiere affectationMatiere :matier_enseignant ) {
				matiers.add(affectationMatiere.getMatiere());
		}
		return matiers;
	}
	public Set<Enseignant> getEnseignants(){
		Set<Enseignant> enseignants = new HashSet<>();
		for(AffectationMatiere affectationMatiere :matier_enseignant ) {
				enseignants.add(affectationMatiere.getEnseignant());
		}
		return enseignants;
	}
		
}

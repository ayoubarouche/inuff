package com.inpt.gestionecole.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
@Table(name = "Matiere")
public class Matiere {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_MATIERE")
	int ID_MATIERE;
	@Column(name = "NOM_MATIERE")
	private String NOM_MATIERE;
	@Column(name = "SEMESTRE")
	private String SEMESTRE;
	@OneToMany(mappedBy = "matiere", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AffectationMatiere> filiere_enseignant = new ArrayList<>();
	
	@Transient
	private AffectationMatiereController amc = new AffectationMatiereController();
	public List<AffectationMatiere> getFiliere_enseignant() {
		return filiere_enseignant;
	}

	public void setFiliere_enseignant(List<AffectationMatiere> filiere_enseignant) {
		this.filiere_enseignant = filiere_enseignant;
	}

	public Matiere() {

	}

	public Matiere(int iD_MATIERE) {
		this.ID_MATIERE = iD_MATIERE;
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

	public void AddEnseignantAndFiliere(Enseignant enseignant, Filiere filiere) {
		AffectationMatiere affectation = new AffectationMatiere(enseignant, filiere, this);
		filiere_enseignant.add(affectation);
		filiere.getMatier_enseignant().add(affectation);
		enseignant.getMatier_filiere().add(affectation);
		amc.add(affectation);
	}

	public void RemoveEnseignantAndFiliere(Enseignant enseignant, Filiere filiere) {
		for (Iterator<AffectationMatiere> iterator = filiere_enseignant.iterator(); iterator.hasNext();) {
			AffectationMatiere affectation = iterator.next();

			if (affectation.getEnseignant().equals(enseignant) && affectation.getFiliere().equals(filiere)
					&& affectation.getMatiere().equals(this)) {
				iterator.remove();
				affectation.getFiliere().getMatier_enseignant().remove(affectation);
				affectation.getEnseignant().getMatier_filiere().remove(affectation);
				affectation.setEnseignant(null);
				affectation.setFiliere(null);
				affectation.setMatiere(null);
				amc.deleteAffectationMatiere(affectation);
			}
		}
	}
}

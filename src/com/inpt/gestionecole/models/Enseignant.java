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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.inpt.gestionecole.shared.User;

@Entity
@Table(name = "Enseignant")
public class Enseignant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENSEIGNANT")
	private int ID_ENSEIGNANT;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "MDP_ENSEIGNANT")
	private String password;
	@Column(name = "NOM_ENSEIGNANT")
	private String nom;
	@Column(name = "PRENOM_ENSEIGNANT")
	private String prenom;
	@OneToMany(mappedBy = "enseignant", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AffectationMatiere> matier_filiere = new ArrayList<>();

	public Enseignant() {
		super();
	}

	public List<AffectationMatiere> getMatier_filiere() {
		return matier_filiere;
	}

	public void setMatier_filiere(List<AffectationMatiere> matier_filiere) {
		this.matier_filiere = matier_filiere;
	}

	public Enseignant(int iD_ENSEIGNANT) {
		this.ID_ENSEIGNANT = iD_ENSEIGNANT;
	}

	public Enseignant(int ID_ENSEIGNANT, String username, String password, String nom, String prenom) {
		// super(username, password, nom, prenom);
		this.ID_ENSEIGNANT = ID_ENSEIGNANT;
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getID_ENSEIGNANT() {
		return ID_ENSEIGNANT;
	}

	public void setID_ENSEIGNANT(int iD_ENSEIGNANT) {
		ID_ENSEIGNANT = iD_ENSEIGNANT;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void AddFiliereAndMatiere(Filiere filiere, Matiere matiere) {
		AffectationMatiere affectation = new AffectationMatiere(this, filiere, matiere);
		matier_filiere.add(affectation);
		filiere.getMatier_enseignant().add(affectation);
		matiere.getFiliere_enseignant().add(affectation);
	}

	public void RemoveFiliereAndMatiere(Filiere filiere, Matiere matiere) {
		for (Iterator<AffectationMatiere> iterator = matier_filiere.iterator(); iterator.hasNext();) {
			AffectationMatiere affectation = iterator.next();

			if (affectation.getEnseignant().equals(this) && affectation.getFiliere().equals(filiere)
					&& affectation.getMatiere().equals(matiere)) {
				iterator.remove();
				affectation.getFiliere().getMatier_enseignant().remove(affectation);
				affectation.getMatiere().getFiliere_enseignant().remove(affectation);
				affectation.setEnseignant(null);
				affectation.setFiliere(null);
				affectation.setMatiere(null);
			}
		}
	}

}

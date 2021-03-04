package com.inpt.gestionecole.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.inpt.gestionecole.config.AffectationMatiereId;

import java.util.List;
import java.util.Objects;

@Entity  
@Table(name="Affectation")  
public class AffectationMatiere {
	@Id
	@Column(name  = "ID_AFFECTATION")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id ;
	
	@ManyToOne(targetEntity=Enseignant.class, optional = false)
	@JoinColumn(name="id_enseignant")
	Enseignant enseignant;
	
	@ManyToOne(targetEntity=Matiere.class, optional = false)
	@JoinColumn(name="id_matiere")
	Matiere matiere;
	
	@ManyToOne(targetEntity=Filiere.class, optional = false)
	@JoinColumn(name="id_filiere")
	Filiere filiere;
	
	public AffectationMatiere() {
		
	}


	public AffectationMatiere( Enseignant enseignant, Filiere filiere,Matiere matiere) {
		super();
	//	this.ID_AFFECTATION = new AffectationMatiereId(enseignant.getID_ENSEIGNANT(),filiere.getCHEF_DE_FILIERE(),matiere.getID_MATIERE());
		this.enseignant = enseignant;
		this.matiere = matiere;
		this.filiere = filiere;
	}

	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	//public AffectationMatiereId getID_AFFECTATION() {
//		return ID_AFFECTATION;
	//}


	public void setID_AFFECTATION(AffectationMatiereId iD_AFFECTATION) {
	//	ID_AFFECTATION = iD_AFFECTATION;
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
	

	   public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	 
	        if (o == null || getClass() != o.getClass())
	            return false;
	 
	        AffectationMatiere that = (AffectationMatiere) o;
	        return Objects.equals(enseignant, that.enseignant) &&
	               Objects.equals(matiere, that.matiere) && Objects.equals(filiere, that.filiere);
	    }
	 
	    @Override
	    public int hashCode() {
	        return Objects.hash(enseignant, matiere,filiere);
	    }

}

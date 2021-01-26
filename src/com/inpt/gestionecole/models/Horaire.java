package com.inpt.gestionecole.models;

import java.sql.Timestamp;
import java.util.Date;

public class Horaire {
	int ID_HORAIRE;
	Date Jour;
	Date Heure_debut;
	Date Heure_fin;

	public Horaire() {

	}

	public Horaire(int ID_HORAIRE) {
		this.ID_HORAIRE = ID_HORAIRE;
	}

	public Horaire(int iD_HORAIRE, Date jour, Date heure_debut, Date heure_fin) {
		super();
		ID_HORAIRE = iD_HORAIRE;
		Jour = jour;
		Heure_debut = heure_debut;
		Heure_fin = heure_fin;
	}

	public int getID_HORAIRE() {
		return ID_HORAIRE;
	}

	public void setID_HORAIRE(int iD_HORAIRE) {
		ID_HORAIRE = iD_HORAIRE;
	}

	public Date getJour() {
		return Jour;
	}

	public void setJour(Date jour) {
		Jour = jour;
	}

	public Date getHeure_debut() {
		return Heure_debut;
	}

	public void setHeure_debut(Date heure_debut) {
		Heure_debut = heure_debut;
	}

	public Date getHeure_fin() {
		return Heure_fin;
	}

	public void setHeure_fin(Date heure_fin) {
		Heure_fin = heure_fin;
	}

	private Date convertTimeStampToDate(Timestamp time) {
		return new Date(time.getTime());
	}

	private Timestamp convertDateToTimeStamp(Date time) {
		return new Timestamp(time.getTime());
	}

	public Timestamp getJourTimestamp() {
		return convertDateToTimeStamp(getJour());

	}

	public Timestamp getHeurDebutTimestamp() {
		return convertDateToTimeStamp(getHeure_debut());
	}

	public Timestamp getHeurFinTimestamp() {
		return convertDateToTimeStamp(getHeure_fin());
	}
	//this methodes will be used for data manipulation
	public int get_jour() {
		
	return this.Jour.getDate();	
	}
	public int get_heur_debut() {
		return this.Heure_debut.getHours();
	}
	public int get_heur_fin() {
		return this.Heure_fin.getHours();
	}
	
}

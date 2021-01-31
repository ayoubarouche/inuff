package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.AffectationMatiere;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Horaire;
import com.inpt.gestionecole.models.Planning;
import com.inpt.gestionecole.models.Salle;
import com.inpt.gestionecole.shared.User;

// how to use this controller

/* 
 * first we need to declare it like this : 
 * PlanningController planningcontroller = new PlanningController();
 * and after that we can use the methods below :)
 */

/*
 * 
 * adding a new planning to database 
 * 
 * 	Planning planning = new Planning(2, new AffectationMatiere(1), new Filiere(1), new Salle(1), new Horaire(3));
	planningcontroller.add(planning);*/

/*
 * delete a planning from database
 * 
 * 	planningcontroller.deletePlanning(1);*/

/*	
 * update a planning 
 * we keep the new model objet id because we use it to find wich row to update in database
 * Planning planning = new Planning(2, new AffectationMatiere(1), new Filiere(1), new Salle(1), new Horaire(6));
	planningcontroller.updatePlanning(planning);*/

/*
	 * to get a planning from database we use this line
	 *  
	Planning p = planningcontroller.findPlanningbyid(2);
	System.out.println("added with succes the horaire id is "+p.getHoraire().getID_HORAIRE());
*/

public class PlanningController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple

	public PlanningController() {
		conn = Connexion.getConnection();
	}
	// here add the methods that you will need

	public int add(Planning planning) {

		int nb = Connexion.Maj("insert into Plannings(ID_AFFECTATION,ID_FILIERE,ID_SALLE,ID_HORAIRE) values("
				+ planning.getAffectation().getID_AFFECTATION_MATIERE() + "," + planning.getFiliere().getID_FILIERE()
				+ "," + planning.getSalle().getID_SALLE() + "," + planning.getHoraire().getID_HORAIRE() + ")");
		return nb;
	}

	public List<Planning> allPlannings() {
		List<Planning> plannings = new ArrayList<>();
		ResultSet rs = Connexion.select("select * from Plannings");
		try {
			while (rs.next()) {
				Planning p = new Planning(rs.getInt(1), new AffectationMatiere(rs.getInt(2)), new Filiere(rs.getInt(3)),
						new Salle(rs.getInt(4)), new Horaire(rs.getInt(5)));
				plannings.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return plannings;
	}

	public Planning findPlanningbyid(int ID_PLANNING) {
		Planning p = null;
		ResultSet rs = Connexion.select("select * from Plannings where ID_PLANNING=" + ID_PLANNING);
		try {
			if (rs.next()) {
				p = new Planning(rs.getInt(1), new AffectationMatiere(rs.getInt(2)), new Filiere(rs.getInt(3)),
						new Salle(rs.getInt(4)), new Horaire(rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;

	}

	public int deletePlanning(int ID_PLANNING) {
		int nb = Connexion.Maj("delete from Plannings where ID_PLANNING=" + ID_PLANNING);
		return nb;
	}

	public int updatePlanning(Planning p) {
		int nb = Connexion
				.Maj("UPDATE `Plannings` SET `ID_AFFECTATION` ='" + p.getAffectation().getID_AFFECTATION_MATIERE()
						+ "', `ID_FILIERE` = '" + p.getFiliere().getID_FILIERE() + "' , `ID_SALLE` = '"
						+ p.getSalle().getID_SALLE() + "' , `ID_HORAIRE` = '" + p.getHoraire().getID_HORAIRE()
						+ "' WHERE `Plannings`.`ID_PLANNING` = " + p.getID_Planning() + ";");
		return nb;
	}
}

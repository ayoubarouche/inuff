package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.Horaire;
import com.inpt.gestionecole.models.Matiere;
 /*
  * the methodes to use for data manipulation in Horaire class is 
  * Horaire horaire = new Horaire();
  *  // to get the day please use : 
  *  horaire.get_jou();
  *  // to get the 'heur debut '
  *  horaire.get_heur_debut()
  *  // to get hte 'heur fin'
  *  horaire.get_heur_fin()
  * 
  */

// ------------ in HoraireController class --------------------


/*
 * for adding a new hour 
 * 	Date jour  = new Date();
	Date heur_debut  = new Date();
	heur_debut.setHours(15);
	Date heur_fin  = new Date();
	heur_fin.setHours(14);
	jour.setDate(2); 
	horaire.setJour(jour);
	horaire.setHeure_debut(heur_debut);
	horaire.setHeure_fin(heur_fin);
horaire_controller.add(horaire);*/
	
	/*
	 * for updating a date
	 * horaire = horaire_controller.findHorairebyid(5);
	Date jour = new Date();
	jour.setDate(24);
	horaire.setJour(jour);
	horaire_controller.updateHoraire(horaire);
	*/
	/*
	 *to get the day please use this methode
	 *   horaire.getJour().getDate()
	 */
	/*
	 * for deleting an horaire use this methode
	 *horaire_controller.deleteHoraire(5); 
	 */



public class HoraireController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple

	public HoraireController() {
		conn = Connexion.getConnection();
	}

	// here add the methods that you will need
	public int add(Horaire horaire) {
		String sql = "insert into Horaire values(?,?,?,?)";
		int nb = -5;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, horaire.getID_HORAIRE());
			ps.setTimestamp(2, horaire.getJourTimestamp());
			ps.setTimestamp(3, horaire.getHeurDebutTimestamp());
			ps.setTimestamp(4, horaire.getHeurFinTimestamp());
			nb = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nb;
	}

	public List<Horaire> allHoraire() {
		List<Horaire> horaires = new ArrayList<Horaire>();
		ResultSet rs = Connexion.select("select * from Horaire");
		try {
			while (rs.next()) {
				Horaire horaire = new Horaire();
				horaire.setID_HORAIRE(rs.getInt(1));
				horaire.setJour(rs.getTimestamp(2));
				horaire.setHeure_debut(rs.getTimestamp(3));
				horaire.setHeure_fin(rs.getTimestamp(4));
				horaires.add(horaire);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return horaires;
	}

	public Horaire findHorairebyid(int ID_HORAIRE) {
		Horaire horaire = null;
		ResultSet rs = Connexion.select("select * from Horaire where ID_HORAIRE=" + ID_HORAIRE);
		try {
			if (rs.next()) {
				horaire = new Horaire();
				horaire.setID_HORAIRE(rs.getInt(1));
				horaire.setJour(rs.getTimestamp(2));
				horaire.setHeure_debut(rs.getTimestamp(3));
				horaire.setHeure_fin(rs.getTimestamp(4));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return horaire;
	}

	public int deleteHoraire(int ID_HORAIRE) {
		int nb = Connexion.Maj("delete from Horaire where ID_HORAIRE=" + ID_HORAIRE);
		return nb;
	}
	
	public int updateHoraire(Horaire horaire) {
		
			String sql = "update Horaire set Jour = ? , Heure_debut = ? , Heure_fin = ? where ID_HORAIRE="+horaire.getID_HORAIRE();
			int nb = -5;
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setTimestamp(1, horaire.getJourTimestamp());
				ps.setTimestamp(2, horaire.getHeurDebutTimestamp());
				ps.setTimestamp(3, horaire.getHeurFinTimestamp());
				nb = ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return nb;
	}
}

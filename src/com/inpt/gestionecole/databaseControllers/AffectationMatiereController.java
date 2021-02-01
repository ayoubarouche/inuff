package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.AffectationMatiere;

public class AffectationMatiereController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple
	EnseignantController enseignantcontroller = new EnseignantController();  
	MatiereController matierecontroller = new MatiereController();
	
	public AffectationMatiereController() {
		conn = Connexion.getConnection();
	}
	public int add(AffectationMatiere a) {
		int nb=Connexion.Maj("insert into Affectation values("+a.getID_AFFECTATION_MATIERE()+",'"+a.getEnseignant().getID_ENSEIGNANT()+"','"+a.getMatiere().getID_MATIERE()+"')");
		return nb;
	}
	public List<AffectationMatiere> allAffectationMatiere() {
		List<AffectationMatiere> affectationmatiere = new ArrayList<AffectationMatiere>();
	    ResultSet rs = Connexion.select("select * from Affectation");
	    
        try {
			while (rs.next()){
		
				AffectationMatiere A= new AffectationMatiere(rs.getInt(1),enseignantcontroller.findEnseignantbyid(rs.getInt(2)),matierecontroller.findMatierebyid(rs.getInt(3)));
				affectationmatiere.add(A);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return affectationmatiere;
	}
	
	public AffectationMatiere findAffectationMatierebyid(int ID_AFFECTATION_MATIERE) {
		AffectationMatiere A=null;
		ResultSet rs = Connexion.select("select * from Affectation where ID_AFFECTATION="+ID_AFFECTATION_MATIERE);
		try {
			if(rs.next()){
			
			A = new AffectationMatiere(rs.getInt(1), enseignantcontroller.findEnseignantbyid(rs.getInt(2)),matierecontroller.findMatierebyid(rs.getInt(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return A;
	}
	public int deleteAffectationMatiere(int ID_AFFECTATION_MATIERE) {
		int nb = Connexion.Maj("delete from Affectation where ID_AFFECTATION="+ID_AFFECTATION_MATIERE);
		return nb;
	}
	public int updateMatiere(AffectationMatiere A) {
		int nb = Connexion.Maj("UPDATE `Affectation` SET `ID_ENSEIGNANT` ='"+A.getEnseignant().getID_ENSEIGNANT()+"', `ID_MATIERE` = '"+A.getMatiere().getID_MATIERE()+"' WHERE `Affectation`.`ID_AFFECTATION` ="+A.getID_AFFECTATION_MATIERE()+"");
		return nb;
	}
	// here the methods that we will need
}

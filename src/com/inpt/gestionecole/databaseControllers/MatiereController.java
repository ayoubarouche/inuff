package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.Matiere;


public class MatiereController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple

	public MatiereController() {
		conn = Connexion.getConnection();
	}
	public int add(Matiere m) {
		int nb=Connexion.Maj("insert into Matiere values("+m.getID_MATIERE()+",'"+m.getNOM_MATIERE()+"','"+m.getSEMESTRE()+"')");
		return nb;
	}
	public List<Matiere> allMatiere() {
		List<Matiere> matiere = new ArrayList<Matiere>();
	    ResultSet rs = Connexion.select("select * from Matiere");
        try {
			while (rs.next()){
				Matiere M= new Matiere(rs.getInt(1),rs.getString(2),rs.getString(3));
				matiere.add(M);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return matiere;
	}
	
	public Matiere findMatierebyid(int ID_MATIERE) {
		Matiere M=null;
		ResultSet rs = Connexion.select("select * from Matiere where ID_MATIERE="+ID_MATIERE);
		try {
			if(rs.next()){
			M = new Matiere(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return M;
	}
	public int deleteMatiere(int ID_MATIERE) {
		int nb = Connexion.Maj("delete from Matiere where ID_MATIERE="+ID_MATIERE);
		return nb;
	}
	public int updateMatiere(Matiere M) {
		int nb = Connexion.Maj("UPDATE `Matiere` SET `NOM_MATIERE` ='"+M.getNOM_MATIERE()+"', `SEMESTRE` = '"+M.getSEMESTRE()+"' WHERE `Matiere`.`ID_MATIERE` ="+M.getID_MATIERE()+"");
		return nb;
	}
	// here add the methods that you will need
}

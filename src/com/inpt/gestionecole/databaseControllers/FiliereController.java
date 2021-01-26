package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Salle;

public class FiliereController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple

	public FiliereController() {
		conn = Connexion.getConnection();

	}
	// here add the methods that you will need
	public int add(Filiere f) {
		int nb=Connexion.Maj("insert into filiere values(null,'"+f.getNOM_FILIERE()+"','"+f.getNOM_FORMATION()+
				"','"+f.getSEMESTRE()+"',"+f.getCHEF_DE_FILIERE()+");");
		return nb;
		
	}
	public List<Filiere> allFiliere(){
		List<Filiere> filiere= new ArrayList<Filiere>();
	    ResultSet rs = Connexion.select("select * from filiere");
        try {
			while (rs.next()){
				Filiere F= new Filiere(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getInt(5));
				filiere.add(F);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filiere;
		
	}
	public Filiere findFilierebyid(int id_F) {
		Filiere F = null;
		ResultSet rs = Connexion.select("select * from filiere where ID_FILIERE="+id_F);
		try {
			if(rs.next()){
			F = new Filiere(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return F;
		
	}
	public int updateFiliere(Filiere F) {
		int nb = Connexion.Maj("UPDATE `Filiere` SET `NOM_FILIERE` ='"+F.getNOM_FILIERE()+"', `NOM_FORMATION` = '"
				+F.getNOM_FORMATION()+"', `SEMESTRE` ='"+F.getSEMESTRE()+"', `CHEF_DE_FILIERE` = "
				+F.getCHEF_DE_FILIERE()+" WHERE `filiere`.`ID_FILIERE` = "+F.getID_FILIERE()+";");
	    return nb;
	}
	
	public int deleteFiliere(int id_F) {
		int nb = Connexion.Maj("delete from Filiere where ID_FILIERE="+id_F);
		return nb;
		
	}
}

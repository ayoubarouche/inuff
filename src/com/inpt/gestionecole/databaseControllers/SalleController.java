package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.Salle;

public class SalleController {
	Connection conn; 
	
	public SalleController() {
		conn = Connexion.getConnection();			
	}
	public int add(Salle s) {
	
		int nb=Connexion.Maj("insert into Salle values("+s.getID_SALLE()+","+s.getNOM_SALLE()+","+s.getNUM_SALLE()+")");
		return nb;
	}	
	public List<Salle> allSalle() {
		List<Salle> salle = new ArrayList<Salle>();
	    ResultSet rs = Connexion.select("select * from Salle");
        try {
			while (rs.next()){
				Salle S= new Salle(rs.getInt(1),rs.getString(2),rs.getInt(3));
				salle.add(S);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return salle;
	}	
	public Salle findSallebyid(int ID_SALLE) {
		Salle S=null;
		ResultSet rs = Connexion.select("select * from Salle where ID_SALLE="+ID_SALLE);
		try {
			if(rs.next()){
			S = new Salle(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return S;
	}
	
	public int deleteSalle(int ID_SALLE) {
		int nb = Connexion.Maj("delete from Salle where ID_SALLE="+ID_SALLE);
		return nb;
	}

	public int updateSalle(Salle S) {
		int nb = Connexion.Maj("UPDATE `Salle` SET `NOM_SALLE()` ="+S.getNOM_SALLE()+", `NUM_SALLE` = "+S.getNUM_SALLE()+" WHERE `Salle`.`ID_SALLE` = "+S.getID_SALLE()+"");
		return nb;
	}
}

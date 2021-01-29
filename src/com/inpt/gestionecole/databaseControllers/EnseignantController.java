package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.shared.User;
import com.inpt.gestionecole.shared.UserController;

public class EnseignantController implements UserController {
	Connection conn = null;
	
	public EnseignantController() {
		conn = Connexion.getConnection();
	}

	@Override
	public void login(String username, String password) {

	}

	@Override
	public String register(User enseignant) {
		
		int nb =0;
		nb = add(enseignant);
		if(nb!=0) {
			return "SUCCESS";
		}
		return "Failure";
	
	}
		
	
	public int add(User enseignant) {
		
		int nb=Connexion.Maj("insert into Enseignant values('"+enseignant.getUsername()+"','"+enseignant.getPassword()+"','"+enseignant.getNom()+"','"+enseignant.getPrenom()+"')");
		return nb;
	}	
	public List<Enseignant> allEnseignant() {
		List<Enseignant> enseignant = new ArrayList<Enseignant>();
	    ResultSet rs = Connexion.select("select * from Enseignant");
        try {
			while (rs.next()){
				Enseignant E= new Enseignant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				enseignant.add(E);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return enseignant;
	}	
	public Enseignant findEnseignantbyid(int ID_ENSEIGNANT) {
		Enseignant E=null;
		ResultSet rs = Connexion.select("select * from Enseignant where ID_ENSEIGNANT="+ID_ENSEIGNANT);
		try {
			if(rs.next()){
			E = new Enseignant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return E;
	}
	
	public int deleteEnseignant(int ID_ENSEIGNANT) {
		int nb = Connexion.Maj("delete from Enseignant where ID_ENSEIGNANT="+ID_ENSEIGNANT);
		return nb;
	}

	public int updateEnseignant(Enseignant E) {
		int nb = Connexion.Maj("UPDATE `Enseignant` SET `username` ='"+E.getUsername()+"', `password` = '"+E.getPassword()+"' , `nom` = '"+E.getNom()+"' , `prenom` = '"+E.getPrenom()+"' WHERE `Enseignant`.`ID_ENSEIGNANT` = "+E.getID_ENSEIGNANT()+";");
		return nb;
	}
}


package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.models.Administrateur;
import com.inpt.gestionecole.shared.User;
import com.inpt.gestionecole.shared.UserController;

public class AdministrateurController implements UserController {
	Connection conn = null;

	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple
	
	public AdministrateurController() {
		// TODO Auto-generated constructor stub
		conn = Connexion.getConnection();
	}

	@Override
	public  Administrateur login(String username, String password) {
		String userName = username; 
        String Password = password;
        String userNameDB = "";
        String passwordDB = "";
        ResultSet all = null;
        all = Connexion.select("select * from Administrateur;");
        try {
			while(all.next())
			{
			 userNameDB = all.getString("username");
			 passwordDB = all.getString("mdp_admin");

			  if(userName.equals(userNameDB) && Password.equals(passwordDB))
			  {
				  Administrateur Admin = null;
				  Admin = new Administrateur(all.getInt(1),all.getString(2), all.getString(3),all.getString(4),all.getString(5));
			  return Admin;
			  }
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return null; 

	}

	@Override
	public String register(User admin) {
		int nb =0;
		nb = add(admin);
		 if (nb!=0) {  
             return "SUCCESS"; 
         }     
         return "failure";  
     
	}
  
	public int add(User Admin) {
		int nb=Connexion.Maj("insert into Administrateur values(null,'"+Admin.getUsername()+"','"+Admin.getNom()+
				"','"+Admin.getPrenom()+"','"+Admin.getPassword()+"');");
		return nb;
		
	}
	public List<Administrateur> allAdministrateur(){
		List<Administrateur> Administrateur= new ArrayList<Administrateur>();
	    ResultSet rs = Connexion.select("select * from Administrateur");
        try {
			while (rs.next()){
				Administrateur Admin= new Administrateur(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
				Administrateur.add(Admin);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Administrateur;
		
	}

	public Administrateur findAdministrateurbyid(int id_Admin) {
		Administrateur Admin = null;
		ResultSet rs = Connexion.select("select * from Administrateur where ID_ADMIN="+id_Admin);
		try {
			if(rs.next()){
				Admin = new Administrateur(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Admin;
	}
	
	public int updateAdministrateur(Administrateur Admin) {
		int nb = Connexion.Maj("UPDATE `Administrateur` SET `USERNAME` ='"+Admin.getUsername()+"', `NOM_ADMIN` = '"
				+Admin.getNom()+"', `PRENOM_ADMIN` ='"+Admin.getPrenom()+"', `MDP_ADMIN` = '"
				+Admin.getPassword()+"' WHERE `filiere`.`ID_ADMIN` = "+Admin.getID_ADMINISTRATEUR()+";");
	    return nb;
	}
	
	public int deleteAdministrateur(int id_Admin) {
		int nb = Connexion.Maj("delete from Administrateur where ID_ADMIN="+id_Admin);
		return nb;
	}

}

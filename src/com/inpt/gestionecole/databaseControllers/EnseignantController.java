package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.models.Administrateur;
import com.inpt.gestionecole.models.AffectationMatiere;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.shared.User;
import com.inpt.gestionecole.shared.UserController;

public class EnseignantController {
	Connection conn = null;
	public static Session session;

	public EnseignantController() {
		conn = Connexion.getConnection();
	}

	public Enseignant login(String username, String password) {
		/*
		 * String userName = username; String Password = password; String userNameDB =
		 * ""; String passwordDB = ""; ResultSet all = null; all =
		 * Connexion.select("select * from Enseignant;"); try { while(all.next()) //
		 * Until next row is present otherwise it return false { userNameDB =
		 * all.getString("USERNAME"); //fetch the values present in database passwordDB
		 * = all.getString("MDP_ENSEIGNANT");
		 * 
		 * if(userName.equals(userNameDB) && Password.equals(passwordDB)) { Enseignant E
		 * ; E = new
		 * Enseignant(all.getInt(1),all.getString(2),all.getString(3),all.getString(4),
		 * all.getString(5)); return E; } } } catch (SQLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } return null;
		 */

		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Enseignant where USERNAME=:username and MDP_ENSEIGNANT=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		Enseignant enseignant = (Enseignant) query.uniqueResult();
		 
		return enseignant;
	}

	public boolean register(Enseignant enseignant) {

		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(enseignant);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			if (null != session.getTransaction()) {

				session.getTransaction().rollback();
				return false;
			}
		} finally {
			if (session != null) {
			
				return true;
			}
		}
		return false;
	}

	public List<Enseignant> allEnseignant() {
		List<Enseignant> enseignants = null;
		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Enseignant");
		enseignants = query.list();
		
		return enseignants;
	}

	public Enseignant findEnseignantbyid(int ID_ENSEIGNANT) {
		Enseignant enseignant = null;
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();

			enseignant = (Enseignant) session.get(Enseignant.class, ID_ENSEIGNANT);
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		return enseignant;

	}

	public boolean deleteEnseignant(Enseignant enseignant) {
		try {
			session.close();
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			List<AffectationMatiere> affectations = enseignant.getMatier_filiere();
		    AffectationMatiereController affController = new AffectationMatiereController();
		    
			for(AffectationMatiere affectation : affectations) {
			affController.deleteAffectationMatiere(affectation);
			}
			session.delete(enseignant);

			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			if (null != session.getTransaction()) {

				session.getTransaction().rollback();
				return false;
			}
		} finally {
			if (session != null) {
		
				return true;
			}
		}
		return false;
	}

	public boolean updateEnseignant(Enseignant enseignant) {
		try {
			session.close();
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(enseignant);

			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			if (null != session.getTransaction()) {

				session.getTransaction().rollback();
				return false;
			}
		} finally {
			if (session != null) {
				
				return true;
			}
		}
		return false;
	}
}

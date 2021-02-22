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
import com.inpt.gestionecole.shared.User;
import com.inpt.gestionecole.shared.UserController;

public class AdministrateurController {
	Connection conn = null;
	static Session session;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple

	public AdministrateurController() {
		// TODO Auto-generated constructor stub
		conn = Connexion.getConnection();
	}

	public Administrateur login(String username, String password) {

		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Administrateur where USERNAME=:username and MDP_ADMIN=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		Administrateur admin = (Administrateur) query.uniqueResult();
		session.close();
		return admin;
	}

	public boolean register(Administrateur Admin) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(Admin);
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
				session.close();
				return true;
			}
		}
		return false;
	}

	public List<Administrateur> allAdministrateur() {
		List<Administrateur> Administrateurs = null;
		/*
		 * ResultSet rs = Connexion.select("select * from Administrateur"); try { while
		 * (rs.next()) { Administrateur Admin = new Administrateur(rs.getInt(1),
		 * rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		 * Administrateur.add(Admin); } } catch (SQLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } return Administrateur;
		 */

		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Administrateur");
		Administrateurs = query.list();
		session.close();
		return Administrateurs;
	}

	public Administrateur findAdministrateurbyid(int id_Admin) {
		Administrateur admin = null;
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();

			admin = (Administrateur) session.get(Administrateur.class, id_Admin);

		} catch (Exception e) {
			// TODO: handle exception
			session.close();
		}
		session.close();
		return admin;
	}

	public boolean updateAdministrateur(Administrateur Admin) {
		/*
		 * int nb =
		 * Connexion.Maj("UPDATE `Administrateur` SET `USERNAME` ='"+Admin.getUsername()
		 * +"', `NOM_ADMIN` = '"
		 * +Admin.getNom()+"', `PRENOM_ADMIN` ='"+Admin.getPrenom()+"', `MDP_ADMIN` = '"
		 * +Admin.getPassword()+"' WHERE `filiere`.`ID_ADMIN` = "+Admin.
		 * getID_ADMINISTRATEUR()+";"); return nb;
		 */

		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(Admin);

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
				session.close();
				return true;
			}
		}
		return false;
	}

	public boolean deleteAdministrateur(Administrateur admin) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.delete(admin);

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
				session.close();
				return true;
			}
		}
		return false;
	}

}

package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.models.Matiere;
import com.inpt.gestionecole.models.Salle;

public class SalleController {
	Connection conn; 
	Session session = null;
	public SalleController() {
		conn = Connexion.getConnection();
	}

public boolean add(Salle s) {
		
		try {
		
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(s);
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
	
public List<Salle> allSalle() {
	List<Salle> salles = new ArrayList<Salle>();
	session = HibernateSessionFactory.buildSessionFactory().openSession();
	Query query = session.createQuery("from Salle");
	salles = query.list();
	session.close();
	return salles;
}
	
	public Salle findSallebyid(int ID_SALLE) {
		Salle S=null;
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();

			S = (Salle) session.get(Salle.class, ID_SALLE);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.close();
		}
		
		return S;

	}
	public boolean deleteSalle(Salle salle) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.delete(salle);

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
	
	public boolean updateSalle(Salle S) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(S);

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
	
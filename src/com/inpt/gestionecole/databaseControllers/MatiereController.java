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
import com.inpt.gestionecole.models.Matiere;


public class MatiereController {
	Connection conn;
	// here add the attributes that you will need view the
	// com.inpt.gestionecole.tests classes for example
	Session session = null;
	public MatiereController() {
		conn = Connexion.getConnection();
	}

public boolean add(Matiere m) {
		
		try {
		
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(m);
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
	
public List<Matiere> allMatiere() {
	List<Matiere> matieres = new ArrayList<Matiere>();
	session = HibernateSessionFactory.buildSessionFactory().openSession();
	Query query = session.createQuery("from Matiere");
	matieres = query.list();
	session.close();
	return matieres;
}
	
	public Matiere findMatierebyid(int ID_MATIERE) {
		Matiere M=null;
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();

			M = (Matiere) session.get(Matiere.class, ID_MATIERE);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.close();
		}
		
		return M;

	}
	public boolean deleteMatiere(Matiere matiere) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.delete(matiere);

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
	
	public boolean updateMatiere(Matiere M) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(M);

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

package com.inpt.gestionecole.databaseControllers;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.models.Filiere;

public class FiliereController {

	// here add the attributes that you will need view the
	// com.inpt.gestionecole.tests classes for example
	Session session = null;

	public FiliereController() {

	}

	public boolean add(Filiere f) {

		try {

			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(f);
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

	public List<Filiere> allFiliere() {
		List<Filiere> filieres = new ArrayList<Filiere>();
		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Filiere");
		filieres = query.list();

		return filieres;
	}

	public Filiere findFilierebyid(int ID_FILIERE) {
		Filiere F = null;
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();

			F = (Filiere) session.get(Filiere.class, ID_FILIERE);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.close();
		}

		return F;
	}

	public boolean deleteFiliere(Filiere filiere) {
		try {
			session.close();
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.delete(filiere);

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

	public boolean updateFiliere(Filiere F) {
		try {
			session.close();
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(F);
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

package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.models.Administrateur;
import com.inpt.gestionecole.models.AffectationMatiere;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;

public class AffectationMatiereController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple
	EnseignantController enseignantcontroller = new EnseignantController();  
	MatiereController matierecontroller = new MatiereController();
	Session session = null;
	public AffectationMatiereController() {
		conn = Connexion.getConnection();
	}
	public boolean add(AffectationMatiere am) {
		
		try {
		
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(am);
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
	//	int nb=Connexion.Maj("insert into Affectation values("+a.getID_AFFECTATION_MATIERE()+",'"+a.getEnseignant().getID_ENSEIGNANT()+"','"+a.getMatiere().getID_MATIERE()+"')");
		//return nb;
	}
	public List<AffectationMatiere> allAffectationMatiere() {
		List<AffectationMatiere> affectationmatieres = null;
		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Affectation");
		affectationmatieres = query.list();
		 
		return affectationmatieres;
	}
	
	public AffectationMatiere findAffectationMatierebyid(int ID_AFFECTATION_MATIERE) {
		AffectationMatiere A=null;
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();

			A = (AffectationMatiere) session.get(AffectationMatiere.class, ID_AFFECTATION_MATIERE);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.close();
		}
		
		return A;

	}
	public boolean deleteAffectationMatiere(AffectationMatiere affectationmatiere) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.delete(affectationmatiere);

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
	public boolean updateAffectationMatiere(AffectationMatiere A) {
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(A);

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
	public List<AffectationMatiere> getMatiereFiliereOfEnseignant(Enseignant enseignant){
		List<AffectationMatiere> affectationsmatiers = new ArrayList<AffectationMatiere>();
		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Affectation where ID_ENSEIGNANT=:id");
		query.setParameter("id", enseignant.getID_ENSEIGNANT());
		affectationsmatiers = query.list();
		return affectationsmatiers;
	}
	
	public List<AffectationMatiere> getMatiereEnseignantOfFiliere(Filiere filiere){
		List<AffectationMatiere> affectationsmatiers = new ArrayList<AffectationMatiere>();
		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Affectation where ID_FILIERE=:id");
		query.setParameter("id",filiere.getID_FILIERE() );
		affectationsmatiers = query.list();
		return affectationsmatiers;
	}
	
	public List<AffectationMatiere> getFilieresEnseignantOfMatiere(Matiere matiere){
		List<AffectationMatiere> affectationsmatiers = new ArrayList<AffectationMatiere>();
		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Affectation where ID_MATIERE=:id");
		query.setParameter("id",matiere.getID_MATIERE() );
		affectationsmatiers = query.list();
		return affectationsmatiers;
	}
	// here the methods that we will need
}

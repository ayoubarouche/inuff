package com.inpt.gestionecole.tests;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.inpt.gestionecole.config.Connexion;
import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.databaseControllers.PlanningController;
import com.inpt.gestionecole.models.AffectationMatiere;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Horaire;
import com.inpt.gestionecole.models.Planning;
import com.inpt.gestionecole.models.Salle;
import com.inpt.gestionecole.models.TestModelExemple;
import java.util.List;

import org.hibernate.Session;
// it's only a class for testing the database exemples here an exemple of how to do it
public class TestExemple {
static Session session ;

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			Filiere filiere = new Filiere( 2,"iccn","hacking and security","3",1);
			session.save(filiere);
			session.getTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			if( null != session.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                session.getTransaction().rollback();
            }
		} finally {
			 if(session != null) {
	                session.close();
	            }
		}	
			
	}
	
}

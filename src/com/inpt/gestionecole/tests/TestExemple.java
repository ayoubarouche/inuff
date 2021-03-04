package com.inpt.gestionecole.tests;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.databaseControllers.AffectationMatiereController;
import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.databaseControllers.MatiereController;
import com.inpt.gestionecole.models.AffectationMatiere;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;
// it's only a class for testing the database exemples here an exemple of how to do it
public class TestExemple {
static Session session ;

	public static void main(String[] args) {
				// TODO Auto-generated method stub
	/*	try {
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
		*/
		AffectationMatiereController aff = new AffectationMatiereController();
			Enseignant ens = new Enseignant();
			ens.setID_ENSEIGNANT(14);
			ens.setNom("google");
			ens.setPassword("hello");
			ens.setUsername("google");
			ens.setPrenom("test");
			Filiere filiere = new Filiere();
			filiere.setNOM_FILIERE("sesnum");
			filiere.setNOM_FORMATION("system embarques");
			filiere.setSEMESTRE("12");
			filiere.setCHEF_DE_FILIERE(17);
			Matiere matiere = new Matiere();
			matiere.setNOM_MATIERE("java c++");
			matiere.setSEMESTRE("12");
			//matiere.setID_MATIERE(6);
		//	filiere.setID_FILIERE(1);
			try {
				session = HibernateSessionFactory.buildSessionFactory().openSession();
				session.beginTransaction();
			//	ens.AddFiliereAndMatiere(filiere, matiere);
			//	filiere = new FiliereController().findFilierebyid(19);
				
			//ens = new EnseignantController().findEnseignantbyid(17);
			//	session.save(matiere);
			//	matiere = new MatiereController().findMatierebyid(10);
				//ens.RemoveFiliereAndMatiere(filiere, matiere);
			//	session.save(filiere);
		//	ens.AddFiliereAndMatiere(filiere, matiere);
//			AffectationMatiereController afc = new AffectationMatiereController();
				//AffectationMatiere am = new AffectationMatiere();
			//	am.setEnseignant(ens);
				//am.setFiliere(filiere);
			//	am.setMatiere(matiere);
			//	afc.add(am);
			//	ens = new EnseignantController().findEnseignantbyid(17);
			session.save(ens);
				 //List<AffectationMatiere> afff =ens.getMatier_filiere();
		/*	if(afff != null ) {
				System.out.println(afff.get(afff.size()-1).getFiliere().getID_FILIERE());
			}*/
			//	List<Enseignant> 
				
				System.out.println(ens.getMatiers().size());
				session.getTransaction().commit();
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("errreur !!!!");
				e.printStackTrace();
			} finally {
				 if(session != null) {
		                session.close();
		            }
			}	
		System.out.println("done !!");
	}
	
}

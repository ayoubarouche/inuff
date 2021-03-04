package com.inpt.gestionecole.appControllers.filieres;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.databaseControllers.MatiereController;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;

/**
 * Servlet implementation class AffectationFiliere
 */
@WebServlet("/administrateur/affectation")
public class AffectationFiliere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AffectationFiliere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("submit")==null) {
			System.out.println("submit is null");
			EnseignantController ec = new EnseignantController();
			FiliereController fc = new FiliereController();
			MatiereController mc = new MatiereController();
			int id = Integer.parseInt(request.getParameter("id"));
			Filiere filiere = fc.findFilierebyid(id);
			if(filiere==null) {
				response.sendRedirect("/gestionecole/administrateur/filieres");
				return ; 
			}
			request.setAttribute("enseignantlist", ec.allEnseignant());
			request.setAttribute("filierelist", fc.allFiliere());
			request.setAttribute("matierelist", mc.allMatiere());
			getServletContext().getRequestDispatcher("/administrateur/affectaion.jsp").forward(request, response);
			
		}
		else {
			System.out.println("submit not null");
			int idfiliere = Integer.parseInt(request.getParameter("idfiliere"));
			int idmatiere = Integer.parseInt(request.getParameter("idmatiere"));
			int idenseignant = Integer.parseInt(request.getParameter("idenseignant"));
			FiliereController fc = new FiliereController();
			MatiereController mc = new MatiereController();
			EnseignantController ec = new EnseignantController();
			Filiere filiere = fc.findFilierebyid(idfiliere) ;
			if(filiere==null) {
				response.sendRedirect("/gestionecole/administrateur/filieres");
			return ;	
			}
			Matiere matiere = mc.findMatierebyid(idmatiere);
			if(matiere==null) {
				response.sendRedirect("/gestionecole/administrateur/filieres");
			return ;	
			}
			Enseignant enseignant = ec.findEnseignantbyid(idenseignant);
			if(enseignant==null) {
				response.sendRedirect("/gestionecole/administrateur/filieres");
			return ;	
			}
			enseignant.AddFiliereAndMatiere(filiere, matiere);
			response.sendRedirect("/gestionecole/administrateur/filieres?id="+idfiliere);
			
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

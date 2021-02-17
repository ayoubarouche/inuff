package com.inpt.gestionecole.appControllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.AdministrateurController;
import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.databaseControllers.MatiereController;
import com.inpt.gestionecole.databaseControllers.SalleController;

/**
 * Servlet implementation class Affichage
 */
@WebServlet({"/administrateur/enseignants","/administrateur/salles","/administrateur/matieres","/administrateur/filieres","/administrateur/administrateurs"})

public class Affichage extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Affichage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		switch(request.getServletPath()) {
		 case "/administrateur/administrateurs":
				AdministrateurController adminController = new AdministrateurController();
				request.setAttribute("liste", adminController.allAdministrateur());
				getServletContext().getRequestDispatcher("/administrateur/administrateurs.jsp").forward(request, response);
			    break;
		  case "/administrateur/enseignants":
			EnseignantController ensController = new EnseignantController();
			request.setAttribute("liste", ensController.allEnseignant());
			getServletContext().getRequestDispatcher("/administrateur/enseignants.jsp").forward(request, response);
		    break;
		  case "/administrateur/salles":
			SalleController sallesController = new SalleController();
			request.setAttribute("liste", sallesController.allSalle());
			getServletContext().getRequestDispatcher("/administrateur/salles.jsp").forward(request, response);
		    break;
		  case "/administrateur/matieres":
			 MatiereController matController = new MatiereController();
			 request.setAttribute("liste", matController.allMatiere());
			 getServletContext().getRequestDispatcher("/administrateur/matieres.jsp").forward(request, response);
			 break;
		  case "/administrateur/filieres":
			 FiliereController filController = new FiliereController();
			 EnseignantController filensController = new EnseignantController();
			 request.setAttribute("enscon", filensController);
			 request.setAttribute("liste", filController.allFiliere());
			 getServletContext().getRequestDispatcher("/administrateur/filieres.jsp").forward(request, response);
			 break;
		    
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

package com.inpt.gestionecole.appControllers;

import java.io.IOException;
import java.net.http.HttpRequest;
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
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;

/**
 * Servlet implementation class Affichage
 */
@WebServlet({ "/administrateur/enseignants", "/administrateur/salles", "/administrateur/matieres",
		"/administrateur/filieres", "/administrateur/administrateurs" })

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		switch (request.getServletPath()) {
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
			/*
			 * FiliereController filController = new FiliereController();
			 * EnseignantController filensController = new EnseignantController();
			 * request.setAttribute("enscon", filensController);
			 * request.setAttribute("liste", filController.allFiliere());
			 * getServletContext().getRequestDispatcher("/administrateur/filieres.jsp").
			 * forward(request, response); break;
			 */
			try {
				afficherfiliere(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void afficherfiliere(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = 0;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			response.getWriter().append("erreur no id filiere found").append(request.getContextPath());

		}
		if (id == 0) {
			FiliereController filController = new FiliereController();
			EnseignantController filensController = new EnseignantController();
			request.setAttribute("enscon", filensController);
			request.setAttribute("liste", filController.allFiliere());
			getServletContext().getRequestDispatcher("/administrateur/filieres.jsp").forward(request, response);
			return;
		}
		if (id > 0) {
			FiliereController filController = new FiliereController();
			Filiere filiere = filController.findFilierebyid(id);
			if (filiere == null) {
				response.getWriter().append("erreur no filiere with that id found").append(request.getContextPath());
				return;
			} else {
				request.setAttribute("filiere", filiere);
				filiere.getCHEF_DE_FILIERE();
				Enseignant enseignant = new EnseignantController().findEnseignantbyid(filiere.getCHEF_DE_FILIERE());
				
				; 
				filiere.getEnseignants();
				request.setAttribute("enseignant", enseignant);
				getServletContext().getRequestDispatcher("/filiere/affFiliere.jsp").forward(request, response);
				return;
			}
		}

	}
}

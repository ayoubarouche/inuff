package com.inpt.gestionecole.appControllers.filieres;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.models.Filiere;

/**
 * Servlet implementation class Update
 */
// pour /administrateur/filieres/update => pour la page de mise a jour de filiere
// l'autre route pour faire la mise a jour
@WebServlet({ "/administrateur/filieres/update" })
public class UpdateFiliere extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * h
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateFiliere() {
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
		FiliereController fc = new FiliereController();
		EnseignantController ec = new EnseignantController();
		if (request.getParameter("submit") == null) {
			int id = Integer.parseInt(request.getParameter("id"));
			Filiere filiere = fc.findFilierebyid(id);
			request.setAttribute("enseignantlist", ec.allEnseignant());
			request.setAttribute("filiere", filiere);

			getServletContext().getRequestDispatcher("/filiere/updateFiliere.jsp").forward(request, response);
		} else {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			String namefiliere = request.getParameter("nomfiliere");
			int idfiliere = Integer.parseInt(request.getParameter("idfiliere"));
			String nameformation = request.getParameter("nomformation");
			String semestre = request.getParameter("semestre");
			int chef = Integer.parseInt(request.getParameter("chef"));
			Filiere filieretomodify = fc.findFilierebyid(idfiliere);
			if (filieretomodify != null) {
				filieretomodify.setCHEF_DE_FILIERE(chef);
				filieretomodify.setNOM_FILIERE(namefiliere);
				filieretomodify.setNOM_FORMATION(nameformation);
				filieretomodify.setSEMESTRE(semestre);
				if (fc.updateFiliere(filieretomodify)) {
					response.sendRedirect("/gestionecole/administrateur/filieres?id"+idfiliere);
				} else {
					response.getWriter().append("filiere update erreur ");
				}
			} else {
				response.getWriter().append("filiere id not found ");
			}
		}
	}

	/*
	 * switch (request.getServletPath()) { case "/administrateur/filieres/update":
	 * int id = Integer.parseInt(request.getParameter("id")); Filiere filiere =
	 * fc.findFilierebyid(id); request.setAttribute("enseignantlist",
	 * ec.allEnseignant()); request.setAttribute("filiere", filiere);
	 * 
	 * getServletContext().getRequestDispatcher("/filiere/updateFiliere.jsp").
	 * forward(request, response); break; case "/administrateur/updatefiliere":
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * String namefiliere = request.getParameter("nomfiliere"); int idfiliere =
	 * Integer.parseInt(request.getParameter("idfiliere")); String nameformation =
	 * request.getParameter("nomformation"); String semestre =
	 * request.getParameter("semestre"); int chef =
	 * Integer.parseInt(request.getParameter("chef")); Filiere filieretomodify =
	 * fc.findFilierebyid(idfiliere); if (filieretomodify != null) {
	 * filieretomodify.setCHEF_DE_FILIERE(chef);
	 * filieretomodify.setNOM_FILIERE(namefiliere);
	 * filieretomodify.setNOM_FORMATION(nameformation);
	 * filieretomodify.setSEMESTRE(semestre); if (fc.updateFiliere(filieretomodify))
	 * { response.getWriter().append("filiere updates"); } else {
	 * response.getWriter().append("filiere update erreur "); } } else {
	 * response.getWriter().append("filiere id not found "); } break;
	 * 
	 * }
	 * 
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

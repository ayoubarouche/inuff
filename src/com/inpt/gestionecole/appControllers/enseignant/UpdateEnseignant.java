package com.inpt.gestionecole.appControllers.enseignant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;

/**
 * Servlet implementation class UpdateEnseignant
 */
@WebServlet("/administrateur/enseignant/update")
public class UpdateEnseignant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEnseignant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		EnseignantController ec = new EnseignantController();
		if (request.getParameter("submit") == null) {
			int id = 0;
			try {
				id = 		Integer.parseInt(request.getParameter("id"));
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
			Enseignant enseignant  = (Enseignant) request.getSession().getAttribute("enseignant");
			if(enseignant == null )enseignant = ec.findEnseignantbyid(id); 
			request.setAttribute("enseignant",enseignant );
				
			getServletContext().getRequestDispatcher("/enseignant/updateEnseignant.jsp").forward(request, response);
		} else {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			Enseignant ens = (Enseignant) request.getSession().getAttribute("enseignant");
			int idenseignant = ens!=null ? ens.getID_ENSEIGNANT() : Integer.parseInt(request.getParameter("idenseignant"));
			String username = request.getParameter("username");
			String password = request.getParameter("password");
		
			Enseignant enseignantmodify = ec.findEnseignantbyid(idenseignant);
			if (enseignantmodify != null) {
				enseignantmodify.setUsername(username);
				enseignantmodify.setNom(nom);
				enseignantmodify.setPrenom(prenom);
				enseignantmodify.setPassword(password);
				if (ec.updateEnseignant(enseignantmodify)) {
					response.sendRedirect("/gestionecole/administrateur/profileadmin?id="+idenseignant);
				} else {
					response.getWriter().append("filiere update erreur ");
				}
			} else {
				response.getWriter().append("filiere id not found ");
			}
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

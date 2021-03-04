package com.inpt.gestionecole.appControllers.administrateur;

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
import com.inpt.gestionecole.shared.UserController;

/**
 * Servlet implementation class AddEnseignant
 */
@WebServlet("/administrateur/enseignants/add")
public class AddEnseignant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddEnseignant() {
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
		if (request.getParameter("submit") == null) {
			System.out.println("submit is null");
			EnseignantController ec = new EnseignantController();
			request.setAttribute("enseignantlist", ec.allEnseignant());
			getServletContext().getRequestDispatcher("/administrateur/AddEnseignant.jsp").forward(request, response);

		} else {
			String nom = (String) request.getParameter("nom");
			String prenom = (String) request.getParameter("prenom");
			String username = UserController.generateUsername(nom, prenom);
			String password = UserController.generatePassword();
			Enseignant enseignant = new Enseignant();
			EnseignantController enscontroller = new EnseignantController();
			enseignant.setNom(nom);
			enseignant.setPrenom(prenom);
			enseignant.setUsername(username);
			enseignant.setPassword(password);
			response.getWriter().append("Served at: ").append(request.getContextPath());
			if (enscontroller.register(enseignant)) {

				response.sendRedirect("/gestionecole/administrateur/enseignants");
				return;
			}

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

}

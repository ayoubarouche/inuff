package com.inpt.gestionecole.appControllers.administrateurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.AdministrateurController;
import com.inpt.gestionecole.databaseControllers.SalleController;
import com.inpt.gestionecole.models.Administrateur;
import com.inpt.gestionecole.models.Salle;
import com.inpt.gestionecole.shared.UserController;

/**
 * Servlet implementation class AddAdmin
 */
@WebServlet("/administrateur/administrateur/add")
public class AddAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdmin() {
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
			getServletContext().getRequestDispatcher("/administrateur/AddAdmin.jsp").forward(request, response);
		}
		else {
			System.out.println("submit not null");
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String username = UserController.generateUsername(nom, prenom);
			String password = UserController.generatePassword();
			Administrateur admin = new Administrateur();
			admin.setNom(nom);
			admin.setPrenom(prenom);
			admin.setUsername(username);
			admin.setPassword(password);
			AdministrateurController ac = new AdministrateurController();
			if(ac.register(admin)) {
				
				response.sendRedirect("/gestionecole/administrateur/administrateurs");
				return;
			}
			else response.getWriter().append("admin not added ");
		
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.inpt.gestionecole.appControllers.administrateurs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.inpt.gestionecole.databaseControllers.AdministrateurController;
import com.inpt.gestionecole.models.Administrateur;


/**
 * Servlet implementation class UpdateAdmin
 */
@WebServlet("/administrateur/administrateurs/update")
public class UpdateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdministrateurController ac = new AdministrateurController();
		if (request.getParameter("submit") == null) {
			int id = Integer.parseInt(request.getParameter("id"));
			Administrateur admin = ac.findAdministrateurbyid(id);
			request.setAttribute("admin", admin);

			getServletContext().getRequestDispatcher("/administrateur/updateAdmin.jsp").forward(request, response);
		}else {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			int idadmin = Integer.parseInt(request.getParameter("idadmin"));
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Administrateur administrateurtomodify = ac.findAdministrateurbyid(idadmin);
			if (administrateurtomodify != null) {
				administrateurtomodify.setNom(nom);
				administrateurtomodify.setPrenom(prenom);
				administrateurtomodify.setUsername(username);
				administrateurtomodify.setPassword(password);
				
				if (ac.updateAdministrateur(administrateurtomodify)) {
					response.sendRedirect("/gestionecole/administrateur/administrateurs?id"+idadmin);
				} else {
					response.getWriter().append("admin update erreur ");
				}
			} else {
				response.getWriter().append("admin id not found ");
			}
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

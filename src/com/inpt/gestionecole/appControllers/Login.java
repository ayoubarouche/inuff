package com.inpt.gestionecole.appControllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inpt.gestionecole.databaseControllers.AdministrateurController;
import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.models.Administrateur;
import com.inpt.gestionecole.models.Enseignant;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session.getAttribute("logedin")!=null) {
		 	response.sendRedirect(request.getContextPath());
		}
		else {
			// if it's not loged in it will returned to login page
	Boolean isAdmin = 	Boolean.valueOf((String)request.getParameter("Admin"));
	String username = (String)request.getParameter("Username");
	String password = (String)request.getParameter("Password");
		if(isAdmin) {
			AdministrateurController adminController = new AdministrateurController();
			Administrateur Admin = (Administrateur)adminController.login(username, password);
			if(Admin==null) {
				response.sendRedirect("Auth.jsp");
				return;
			}
			session.setAttribute("logedin", true);
			session.setAttribute("admin", Admin);
			System.out.println("name is : "+Admin.getNom());
					response.sendRedirect("Administrateur");
		}
		else {
			EnseignantController ensController = new EnseignantController();
			Enseignant ens = (Enseignant) ensController.login(username, password);
			session.setAttribute("logedin", true);
			session.setAttribute("enseignant", ens);	
			response.sendRedirect("Enseignant");
		}
			PrintWriter writer = response.getWriter();
			writer.println("<h1>Hello  you are not loged in </h1> isadmin : "+isAdmin+" username : "+username+ " password : "+password);
			writer.close();
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

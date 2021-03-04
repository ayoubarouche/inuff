package com.inpt.gestionecole.appControllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inpt.gestionecole.models.Administrateur;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	String yourName = request.getParameter("yourName");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + yourName + "</h1>");
		writer.close();
*/
			HttpSession session = request.getSession();
			if(session.getAttribute("logedin")!=null) {
				 
			if(session.getAttribute("admin")!=null)response.sendRedirect("Administrateur");
			else if(session.getAttribute("enseignant")!=null)response.sendRedirect("Enseignant");
			}
			else {
				
				// if it's not loged in it will returned to login page
				response.sendRedirect("logout");
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

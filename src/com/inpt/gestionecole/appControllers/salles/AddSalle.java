package com.inpt.gestionecole.appControllers.salles;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.inpt.gestionecole.databaseControllers.SalleController;

import com.inpt.gestionecole.models.Salle;

/**
 * Servlet implementation class AddSalle
 */
@WebServlet("/administrateur/salle/add")
public class AddSalle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSalle() {
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
			getServletContext().getRequestDispatcher("/Salle/addSalle.jsp").forward(request, response);
		}
		else {
			System.out.println("submit not null");
			String nomsalle = request.getParameter("nomsalle");
			int numsalle = Integer.parseInt(request.getParameter("numsalle"));
			Salle salle = new Salle();
			salle.setNOM_SALLE(nomsalle);
			salle.setNUM_SALLE(numsalle);
	
			SalleController sc = new SalleController();
			if(sc.add(salle)) {
				
				response.sendRedirect("/gestionecole/administrateur/salles");
				return;
			}
			else response.getWriter().append("salle not added ");
		
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

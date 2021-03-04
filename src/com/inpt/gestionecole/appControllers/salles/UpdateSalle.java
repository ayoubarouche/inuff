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
 * Servlet implementation class UpdateSalle
 */
@WebServlet("/amdinistrateur/salles/update")
public class UpdateSalle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSalle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SalleController sc = new SalleController();
		if (request.getParameter("submit") == null) {
			int id = Integer.parseInt(request.getParameter("id"));
			Salle salle = sc.findSallebyid(id);
			request.setAttribute("salle", salle);

			getServletContext().getRequestDispatcher("/filiere/updateSalle.jsp").forward(request, response);
		}else {
			response.getWriter().append("Served at: ").append(request.getContextPath());

			String nomsalle = request.getParameter("nomsalle");
			int idsalle = Integer.parseInt(request.getParameter("idsalle"));
			int numsalle = Integer.parseInt(request.getParameter("numsalle"));
			Salle salletomodify = sc.findSallebyid(idsalle);
			if (salletomodify != null) {
				salletomodify.setNOM_SALLE(nomsalle);
				salletomodify.setNUM_SALLE(numsalle);
				
				if (sc.updateSalle(salletomodify)) {
					response.sendRedirect("/gestionecole/administrateur/salles?id"+idsalle);
				} else {
					response.getWriter().append("salle update erreur ");
				}
			} else {
				response.getWriter().append("salle id not found ");
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

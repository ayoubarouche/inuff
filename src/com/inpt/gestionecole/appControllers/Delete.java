package com.inpt.gestionecole.appControllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.databaseControllers.MatiereController;
import com.inpt.gestionecole.databaseControllers.SalleController;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/administrateur/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String table=request.getParameter("table");
		int id=Integer.parseInt(request.getParameter("id"));
		switch(table) {
		  case "enseignants":
			EnseignantController ensController = new EnseignantController();
			ensController.deleteEnseignant(id);
			response.sendRedirect(request.getContextPath()+"/administrateur/enseignants");
		    break;
		  case "salles":
			SalleController sallesController = new SalleController();
			sallesController.deleteSalle(id);
			response.sendRedirect(request.getContextPath()+"/administrateur/salles");
		    break;
		  case "matieres":
			 MatiereController matController = new MatiereController();
			 matController.deleteMatiere(id);
			 response.sendRedirect(request.getContextPath()+"/administrateur/matieres");
			 break;
		  case "filieres":
			 FiliereController filController = new FiliereController();
			 filController.deleteFiliere(id);
			 response.sendRedirect(request.getContextPath()+"/administrateur/filieres");
			 break;
		    
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

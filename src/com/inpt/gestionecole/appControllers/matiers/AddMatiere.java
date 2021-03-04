package com.inpt.gestionecole.appControllers.matiers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.databaseControllers.MatiereController;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;

/**
 * Servlet implementation class AddMatiere
 */
@WebServlet("/administrateur/matiere/add")
public class AddMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMatiere() {
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
			EnseignantController ec = new EnseignantController();
			request.setAttribute("enseignantlist", ec.allEnseignant());
			getServletContext().getRequestDispatcher("/matiere/addMatiere.jsp").forward(request, response);
			
		}
		else {
			System.out.println("submit not null");
			String namematiere = request.getParameter("nommatiere");
			String semestre = request.getParameter("semestre");
			Matiere matiere = new Matiere();
	matiere.setNOM_MATIERE(namematiere);
	matiere.setSEMESTRE(semestre);

			MatiereController mc = new MatiereController();
			if(mc.add(matiere)) {
				response.sendRedirect("/gestionecole/administrateur/matieres");
				return;
			}
			else response.getWriter().append("matiere not added ");
		
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

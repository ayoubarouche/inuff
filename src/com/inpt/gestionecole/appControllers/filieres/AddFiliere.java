package com.inpt.gestionecole.appControllers.filieres;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.models.Filiere;

/**
 * Servlet implementation class AddFiliere
 */
@WebServlet("/administrateur/filiere/add")
public class AddFiliere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFiliere() {
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
			getServletContext().getRequestDispatcher("/filiere/addFiliere.jsp").forward(request, response);
			
		}
		else {
			System.out.println("submit not null");
			String namefiliere = request.getParameter("nomfiliere");
			
			String nameformation = request.getParameter("nomformation");
			String semestre = request.getParameter("semestre");
			int chef = Integer.parseInt(request.getParameter("chef"));
			Filiere filiere = new Filiere();
			filiere.setCHEF_DE_FILIERE(chef);
			filiere.setNOM_FILIERE(namefiliere);
			filiere.setNOM_FORMATION(nameformation);
			filiere.setSEMESTRE(semestre);
			FiliereController fc = new FiliereController();
			if(fc.add(filiere)) {
				request.setAttribute("success", "filière a été ajouté avec succes");
				response.sendRedirect("/gestionecole/administrateur/filieres");
				return;
			}
			else response.getWriter().append("filiere not added ");
		
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

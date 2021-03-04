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
 * Servlet implementation class UpdateMatiere
 */
@WebServlet("/administrateur/matieres/update")
public class UpdateMatiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMatiere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MatiereController mc = new MatiereController();
		EnseignantController ec = new EnseignantController();
		if (request.getParameter("submit") == null) {
			int id = Integer.parseInt(request.getParameter("id"));
			Matiere matiere = mc.findMatierebyid(id);
			request.setAttribute("enseignantlist", ec.allEnseignant());
			request.setAttribute("matiere", matiere);

			getServletContext().getRequestDispatcher("/matiere/updateMatiere.jsp").forward(request, response);
		} else {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			String namefiliere = request.getParameter("nommatiere");
			int idmatiere = Integer.parseInt(request.getParameter("idmatiere"));
			String semestre = request.getParameter("semestre");
			Matiere matieretomodify = mc.findMatierebyid(idmatiere);
			if (matieretomodify != null) {
				matieretomodify.setNOM_MATIERE(namefiliere);
				matieretomodify.setSEMESTRE(semestre);
				if (mc.updateMatiere(matieretomodify)) {
					response.sendRedirect("/gestionecole/administrateur/matieres?id"+idmatiere);
				} else {
					response.getWriter().append("matiere update erreur ");
				}
			} else {
				response.getWriter().append("matiere id not found ");
			}
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

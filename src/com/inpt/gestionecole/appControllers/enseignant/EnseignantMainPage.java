package com.inpt.gestionecole.appControllers.enseignant;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;

/**
 * Servlet implementation class EnseignantMainPage
 */
@WebServlet("/Enseignant")
public class EnseignantMainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnseignantMainPage() {
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
			Enseignant ens =(Enseignant)session.getAttribute("enseignant");
			Set<Matiere> matieres = ens.getMatiers(); 
			Set<Filiere> filieres = ens.getFiliers(); 
			request.setAttribute("matieres", matieres);
			request.setAttribute("filieres", filieres);
			getServletContext().getRequestDispatcher("/enseignant/profileEns.jsp").forward(request, response);
			
		}
		else {
			response.sendRedirect("Auth.jsp");
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

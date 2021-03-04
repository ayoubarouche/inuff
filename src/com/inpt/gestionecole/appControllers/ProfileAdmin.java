package com.inpt.gestionecole.appControllers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.models.AffectationMatiere;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;

/**
 * Servlet implementation class ProfileAdmin
 */
@WebServlet("/administrateur/profileadmin")
public class ProfileAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EnseignantController ensController = new EnseignantController();
		int id=Integer.parseInt(request.getParameter("id"));
		Enseignant ens = ensController.findEnseignantbyid(id);
		Set<Matiere> matieres = ens.getMatiers(); 
		Set<Filiere> filieres = ens.getFiliers(); 
		request.setAttribute("matieres", matieres);
		request.setAttribute("filieres", filieres);
		request.setAttribute("ens", ens);
		//test if emploi exists
		String id_s = String.valueOf(id);
		String SAVE_DIR = "emplois";
		String appPath = request.getServletContext().getRealPath("");
		String savePath = appPath + File.separator + SAVE_DIR;
		String filePath = savePath + File.separator + id_s+".pdf";
		File pdfFile = new File(filePath);
		if (!pdfFile.exists()) {
        	request.setAttribute("exist","false");
        }else {request.setAttribute("exist","true");}
		//endtest
		getServletContext().getRequestDispatcher("/administrateur/profileAdmin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

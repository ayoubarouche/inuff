package com.inpt.gestionecole.appControllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inpt.gestionecole.models.Enseignant;

/**
 * Servlet implementation class Download
 */
@WebServlet({"/administrateur/download","/enseignant/download"})
public class Download extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Download() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id;
		System.out.println(request.getServletPath());
		id=request.getParameter("id");
		if(request.getServletPath().equals("/enseignant/download")) {
			HttpSession session = request.getSession();
			Enseignant ens =(Enseignant)session.getAttribute("enseignant");
			id = String.valueOf(ens.getID_ENSEIGNANT());
		}
		
		String SAVE_DIR = "emplois";
		String appPath = request.getServletContext().getRealPath("");
		String savePath = appPath + File.separator + SAVE_DIR;
		String filePath = savePath + File.separator + id+".pdf";
		
		File pdfFile = new File(filePath);

		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "attachment; filename=" + id+".pdf");
		response.setContentLength((int) pdfFile.length());

		FileInputStream fileInputStream = new FileInputStream(pdfFile);
		OutputStream responseOutputStream = response.getOutputStream();
		int bytes;
		while ((bytes = fileInputStream.read()) != -1) {
			responseOutputStream.write(bytes);
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

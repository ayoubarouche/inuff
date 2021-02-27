package com.inpt.gestionecole.appControllers;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadEmploi
 */
@WebServlet("/administrateur/uploademploi")
@MultipartConfig(fileSizeThreshold=1024*1024*2,maxFileSize=1024*1024*10,maxRequestSize=1024*1024*50)
public class UploadEmploi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String SAVE_DIR = "emplois";

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadEmploi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//
		
		
		String appPath = request.getServletContext().getRealPath("");
		String savePath = appPath + File.separator + SAVE_DIR;
		File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
        String fileName =request.getParameter("id")+".pdf";
	    for (Part part : request.getParts()) {
	      part.write(savePath + File.separator + fileName);
	    }
	    response.sendRedirect("./upload?id="+request.getParameter("id"));
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

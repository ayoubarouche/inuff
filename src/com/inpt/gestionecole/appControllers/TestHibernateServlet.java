package com.inpt.gestionecole.appControllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.models.Filiere;

/**
 * Servlet implementation class TestHibernateServlet
 */
@WebServlet("/testHibernateServlet")
public class TestHibernateServlet extends HttpServlet {
	static Session session ;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestHibernateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		Filiere filiere = new Filiere( 2,"iccn","hacking and security","3",1);
		testaddFiliere(filiere);
		response.getWriter().append("Served at: ").append(request.getContextPath());	
	}
	private static void testaddFiliere(Filiere filiere) {

		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(filiere);
			session.getTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			if( null != session.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                session.getTransaction().rollback();
            }
		} finally {
			 if(session != null) {
	                session.close();
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

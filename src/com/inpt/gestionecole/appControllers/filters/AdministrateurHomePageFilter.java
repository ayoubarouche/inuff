package com.inpt.gestionecole.appControllers.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AdministrateurHomePageFilter
 */
 @WebFilter(filterName = "/AdministrateurHomePageFilter",
urlPatterns = {"/administrateur/*"})
  
public class AdministrateurHomePageFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AdministrateurHomePageFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("hello in the filter administrateur ");
		HttpServletRequest httprequest =(HttpServletRequest) request;
	    HttpServletResponse httpresponse =(HttpServletResponse) response;
	    HttpSession session = ((HttpServletRequest) request).getSession();
	    if(session.getAttribute("logedin")!=null) {
	    	System.out.println("logedin in filter ");
	    	if(session.getAttribute("admin")==null) {
	    		   	httpresponse.sendRedirect(httprequest.getContextPath());
	     	return;
	    	}
	    	
	     	else 
	    		chain.doFilter(request, response);
	    	return;
	    }
	    else {
	    	httpresponse.sendRedirect(httprequest.getContextPath());
	   	return;
	    }
		// pass the request along the filter chain
		 
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

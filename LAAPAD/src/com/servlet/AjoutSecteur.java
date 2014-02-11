package com.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjouterSecteur
 */
@WebServlet("/AjoutSecteur")
public class AjoutSecteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutSecteur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/jsp/ajouter_secteur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String secteur= request.getParameter("secteur_name");
		String adresse= request.getParameter("secteur_adr");
		
		double longitude= Double.valueOf(request.getParameter("secteur_long"));
		double latittude= Double.parseDouble(request.getParameter("secteur_lat"));
		
		
		Writer out= response.getWriter();
		out.write(secteur);
		out.write(adresse);
		out.write(String.valueOf(longitude));	
		out.write(String.valueOf(latittude));			
		
	}

}

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

@WebServlet("/AjoutProduit")
public class AjoutProduit extends HttpServlet
{
	private static final long serialVersionUID = -5362945471121505662L;

	public AjoutProduit()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			boolean fichierUploade = false;
		      
			response.setContentType("text/html");
		      
			PrintWriter out = response.getWriter();

			boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
			
			// Récupération des variables du formulaire
			
			int codeProduit = Integer.valueOf(request.getParameter("code_produit").trim().toUpperCase());
			String nomProduit = String.valueOf(request.getParameter("nom_poduit").trim().toUpperCase());
			String descriptionProduit = String.valueOf(request.getParameter("description_produit").trim().toUpperCase());
			
			// Si le code produit n'a pas été saisi
			
			if (codeProduit == 0)
			{
				out.println("Vous n'avez pas saisi le code du produit, veuillez r&eacute;essayer.");
			}

			// Vérification du bon format du formulaire : "enctype ..."
			
			if (!isMultipartContent)
			{
				out.println("You are not trying to upload<br/>");
				
				return;
			}

			FileItemFactory factory = new DiskFileItemFactory();
			
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			try
			{
				List<FileItem> fields = upload.parseRequest(request);
				
				Iterator<FileItem> it = fields.iterator();
				
				if (!it.hasNext())
				{
					out.println("No fields found");
					return;
				}
				
				while (it.hasNext())
				{
					FileItem fileItem = it.next();
					
					boolean isFormField = fileItem.isFormField();
					
					// Si on est sur le champ du fichier à uploader
					
					if (!isFormField)
					{
						// Création du fichier
						
						factory.createItem(fileItem.getFieldName(), fileItem.getContentType(), fileItem.isFormField(), fileItem.getName());
						
						// Copie du fichier
						
				        Streams.copy(((FileItemStream) fileItem).openStream(), fileItem.getOutputStream(), true);
				        
				        fichierUploade = true;
				        
				        // Fin du parcours des champs une fois que le fichier est uploadé
				        
				        break;
					}
				}
				
				// Fichier correctement uploadé
				
				if (fichierUploade)
				{
					// Création du produit et insertion en base ...
				}
				else
				{
					out.println("Le fichier n'a pas ete correctement uploade.");
				}
			}
			catch (FileUploadException e)
			{
				e.printStackTrace();
			}
		}
		catch (Exception z)
		{
			z.printStackTrace();
		}
	}
}
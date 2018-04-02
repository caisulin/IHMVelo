package fr.eseo.jee.agence.velo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.jee.agence.velo.sw2.LocationSEI;
import fr.eseo.jee.agence.velo.sw2.LocationService;
import fr.eseo.jee.agence.velo.sw2.Velo;



/**
 * Servlet implementation class RechercherVelo
 */
@WebServlet("/RechercherVelo")
public class RechercherVelo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechercherVelo() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categorie = request.getParameter("categorie");
		String ville = request.getParameter("ville");
		List<Velo> lesVelos = new ArrayList<Velo>();
		Velo velo = new Velo();
		velo.setCategorie(categorie);
		velo.setVille(ville);
		String dateDebut = request.getParameter("dateDebut");
		String dateFin = request.getParameter("dateFin");
		if (dateDebut.isEmpty() || dateFin.isEmpty()) {
			boolean dateVide = true;
			request.setAttribute("dateVide", dateVide);
			RequestDispatcher dispat = request.getRequestDispatcher("index.jsp");
			dispat.forward(request, response);
		}
		dateDebut = dateDebut.substring(6) + '-'+ dateDebut.substring(0,2)+'-'+ dateDebut.substring(3,5);
		dateFin = dateFin.substring(6) + '-'+ dateFin.substring(0,2)+'-'+ dateFin.substring(3,5);
		
		// utiliser le sw pour convertir
		LocationService service = new LocationService();
		LocationSEI port = service.getLocationPort();
		
		lesVelos = port.trouverVelo(velo);
		
		HttpSession session = request.getSession();
		session.setAttribute("lesVelos", lesVelos);
		request.setAttribute("lesVelos", lesVelos);
		session.setAttribute("dateDebut", dateDebut);		
		session.setAttribute("dateFin", dateFin);

		RequestDispatcher dispat = request.getRequestDispatcher("listeVelo.jsp");
		dispat.forward(request, response);		}

}

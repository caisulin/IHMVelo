package fr.eseo.jee.agence.hotel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.jee.agence.hotel.sw.Chambre;
import fr.eseo.jee.agence.hotel.sw.GestionHotelsSEI;
import fr.eseo.jee.agence.hotel.sw.GestionHotelsService;
import fr.eseo.jee.agence.velo.sw.LocationSEI;
import fr.eseo.jee.agence.velo.sw.LocationService;
import fr.eseo.jee.agence.velo.sw.Velo;



/**
 * Servlet implementation class RechercherVelo
 */
@WebServlet("/RechercherHotel")
public class RechercherChambre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RechercherChambre() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categorie = request.getParameter("categorie");
		List<Chambre> lesChambres = new ArrayList<Chambre>();
		Chambre chambre = new Chambre();
		chambre.setTypeChambre(categorie);
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
		GestionHotelsService service = new GestionHotelsService();
		GestionHotelsSEI port = service.getGestionHotelsPort();
		
		lesChambres = port.trouverChambre(chambre);
		
		HttpSession session = request.getSession();
		session.setAttribute("lesChambres", lesChambres);
		request.setAttribute("lesChambres", lesChambres);
		session.setAttribute("dateDebut", dateDebut);		
		session.setAttribute("dateFin", dateFin);

		RequestDispatcher dispat = request.getRequestDispatcher("listeChambre.jsp");
		dispat.forward(request, response);		}

}

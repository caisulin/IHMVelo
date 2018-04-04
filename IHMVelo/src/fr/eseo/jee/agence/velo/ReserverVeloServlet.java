package fr.eseo.jee.agence.velo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.jee.agence.velo.sw2.ReservationVelo;
import fr.eseo.jee.agence.velo.sw2.LocationSEI;
import fr.eseo.jee.agence.velo.sw2.LocationService;

/**
 * Servlet implementation class VeloServlet
 */
@WebServlet("/ReserverVelo")
public class ReserverVeloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReserverVeloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String dateDebut = session.getAttribute("dateDebut").toString();		
		String dateFin = session.getAttribute("dateFin").toString();
		
		String idVelo = session.getAttribute("idVelo").toString();
		
		String idClient = session.getAttribute("codeClient").toString();
		
		/* on créer la reservation */
		ReservationVelo reservation = new ReservationVelo();
		reservation.setCodeClient(Integer.valueOf(idClient));
		reservation.setCodeVelo(Integer.valueOf(idVelo));
		reservation.setDateDebut(dateDebut);
		reservation.setDateFin(dateFin);
		reservation.setPaiementEffectue(false);
		
		/* on l'envoit dans le webservice */
		LocationService service = new LocationService();
		LocationSEI locationVelo = service.getLocationPort();
				
		int resultatRequete = locationVelo.reserverVelo(reservation);
		
		/*
		 * On redirige vers la bonne page fct du resultat de la requête
		 */
		if (resultatRequete > 0) {
			// reservation ok
			session.setAttribute("codeReservation", resultatRequete);

			RequestDispatcher dispat = request.getRequestDispatcher("idReservation.jsp");
			dispat.forward(request, response);

		} else {
			// reservation fail 
			RequestDispatcher dispat = request.getRequestDispatcher("erreurReservation.jsp");
			dispat.forward(request, response);
		}
	}

}

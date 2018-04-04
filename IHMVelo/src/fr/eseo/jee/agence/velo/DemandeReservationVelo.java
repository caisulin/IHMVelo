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
@WebServlet("/DemandeReservationVelo")
public class DemandeReservationVelo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DemandeReservationVelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		HttpSession session = request.getSession();
		Object dateDebut = session.getAttribute("dateDebut");		
		Object dateFin = session.getAttribute("dateFin");
		
		Object idVelo = session.getAttribute("idVelo");
		
		RequestDispatcher dispat = request.getRequestDispatcher("DemandeMail.jsp");
		dispat.forward(request, response);
	}

}

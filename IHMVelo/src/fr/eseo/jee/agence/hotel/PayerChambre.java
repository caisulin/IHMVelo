package fr.eseo.jee.agence.hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.jee.agence.hotel.sw.GestionHotelsSEI;
import fr.eseo.jee.agence.hotel.sw.GestionHotelsService;
import fr.eseo.jee.agence.velo.sw.LocationSEI;
import fr.eseo.jee.agence.velo.sw.LocationService;
import fr.eseo.jee.agence.velo.sw.Velo;



/**
 * Servlet implementation class RechercherVelo
 */
@WebServlet("/PayerHotel")
public class PayerChambre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayerChambre() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codeReservation = Integer.parseInt(request.getParameter("codeReservation"));
		String result = "";
		
		// utiliser le sw pour convertir
		GestionHotelsService service = new GestionHotelsService();
		GestionHotelsSEI port = service.getGestionHotelsPort();
		
		result = port.payerChambre(codeReservation);
		
		HttpSession session = request.getSession();
		request.setAttribute("result", result);

		RequestDispatcher dispat = request.getRequestDispatcher("paiementChambreResponse.jsp");
		dispat.forward(request, response);		}

}

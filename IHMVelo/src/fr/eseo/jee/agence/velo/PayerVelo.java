package fr.eseo.jee.agence.velo;

import java.io.IOException;

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
@WebServlet("/PayerVelo")
public class PayerVelo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayerVelo() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codeReservation = Integer.parseInt(request.getParameter("codeReservation"));
		String result = "";
		
		// utiliser le sw pour convertir
		LocationService service = new LocationService();
		LocationSEI port = service.getLocationPort();
		
		result = port.payerVelo(codeReservation);
		
		HttpSession session = request.getSession();
		request.setAttribute("result", result);

		RequestDispatcher dispat = request.getRequestDispatcher("paiementResponse.jsp");
		dispat.forward(request, response);		}

}

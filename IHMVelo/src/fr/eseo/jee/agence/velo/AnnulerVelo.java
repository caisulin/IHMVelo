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
@WebServlet("/AnnulerVelo")
public class AnnulerVelo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnulerVelo() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codeReservation = Integer.parseInt(request.getParameter("codeReservation"));
		boolean result = false;
		
		
		// utiliser le sw pour convertir
		LocationService service = new LocationService();
		LocationSEI port = service.getLocationPort();
		
		result = port.annulerVelo(codeReservation);
		
		HttpSession session = request.getSession();
		request.setAttribute("result", result);

		RequestDispatcher dispat = request.getRequestDispatcher("annulationResponse.jsp");
		dispat.forward(request, response);		}

}

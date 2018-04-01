package fr.eseo.jee.agence.velo;

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
		
		// utiliser le sw pour convertir
		LocationService service = new LocationService();
		LocationSEI port = service.getLocationPort();
		
		lesVelos = port.trouverVelo(velo);
		

		HttpSession session = request.getSession();
		session.setAttribute("lesVelos", lesVelos);
		request.setAttribute("lesVelos", lesVelos);
		session.setAttribute("ville", ville);
		session.setAttribute("categorie", categorie);

		

		RequestDispatcher dispat = request.getRequestDispatcher("listeVelo.jsp");
		dispat.forward(request, response);		}

}

package fr.eseo.jee.agence.velo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemandeReservationVeloServlet
 */
@WebServlet("/ResultatRechercheVelo")
public class RechercherVeloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public RechercherVeloServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * Récupération des données du formulaire de Recherche Velo (index.html)
		 */
		String ville = request.getParameter("ville");
		String dateDebut = request.getParameter("dateDebut");
		String heureDebut = request.getParameter("heureDebut");
		String dateFin = request.getParameter("dateFin");
		String heureFin = request.getParameter("heureFin");
		String typeVelo = request.getParameter("velo");
		String typeAccesoire = request.getParameter("accesoire");

		/*
		 * Requete vers le webservice
		 * On récupère une liste de vélo de type velo[]
		 * Et on enregistre les vélo/la liste de vélo dans la session
		 */
		
		StringBuilder tableauVelo = new StringBuilder();
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>" +
		"<head><title>Resultat Recherche</title></head>"+
		"<body>" +
		"<H2 ALIGN=CENTER> Resultat de recherche vélo </H2>" +
		"<br>" +
		"<P margin-left=10px> Ville : " + ville +
		"<br> Date de début : " + dateDebut +
		"  heure de début : " + heureDebut +
		"<br> Date de fin : " + dateFin +
		"  heure de fin : " + heureFin +
		"<br> Type de vélo : " + typeVelo +
		"<br> Type d'accesoire : " + typeAccesoire + "</P>" +
		"</body>"+
		"</html>" );

//		RequestDispatcher dispacher = request.getRequestDispatcher("ListeVelo.jsp");
//ldispacher.forward(request, response);

	}

}

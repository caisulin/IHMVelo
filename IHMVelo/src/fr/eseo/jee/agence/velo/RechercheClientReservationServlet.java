package fr.eseo.jee.agence.velo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.jee.agence.client.ClientBD;

/**
 * Servlet implementation class RechercheClientReservation
 */
@WebServlet("/RechercheClient")
public class RechercheClientReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RechercheClientReservationServlet() {
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

		/*
		 * Récupération du formulaire de l'adresse mail
		 */
		String adresseMail = request.getParameter("mail");

		/*
		 * On se connecte a la bdd
		 */
		ClientBD.connexion();

		/*
		 * On recherche le client
		 */
		int idClientTrouve = ClientBD.getIdClient(adresseMail);

		session.setAttribute("mailClient", adresseMail);
		
		ClientBD.deconnexion();

		/*
		 * On redirige vers la bonne page fct de l'existance du client
		 */
		if (idClientTrouve > 0) {
			// aller a la page de reservation
			session.setAttribute("codeClient", idClientTrouve);

			RequestDispatcher dispat = request.getRequestDispatcher("ReserverVelo");
			dispat.forward(request, response);

		} else {
			// aller a la page créer un compte
			RequestDispatcher dispat = request.getRequestDispatcher("creationCompteClient.jsp");
			dispat.forward(request, response);
		}
	}
}

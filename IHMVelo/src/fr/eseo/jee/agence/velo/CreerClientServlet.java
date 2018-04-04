package fr.eseo.jee.agence.velo;

import java.io.IOException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.jee.agence.client.Client;
import fr.eseo.jee.agence.client.ClientBD;

/**
 * Servlet implementation class CreerClientServlet
 */
@WebServlet("/CreerClient")
public class CreerClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreerClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Je créer un compte client");

		/* On récupère les informations du client */
		String emailClient = request.getParameter("mailClient");
		String nomClient = request.getParameter("nom");
		String prenomClient = request.getParameter("prenom");
		String telClient = request.getParameter("telephone");
		String addresseClient = request.getParameter("adresse");
		
		Client client = new Client();
		client.setNom(nomClient);
		client.setPrenom(prenomClient);
		client.setTelephone(telClient);
		client.setAdresse(addresseClient);
		client.setEmail(emailClient);
		
		System.out.println(client.toString());

		Statement statement = ClientBD.connexion();

		int resultat = ClientBD.ajoutClient(client);
		System.out.println("idClient = " + resultat);
		if (resultat == 0) {
			/* le client s'est bien ajouté */
			System.out.println("client ok, id=" + resultat);
		} else {
			/* il y a eu une erreur lors de la creation du client */
			System.out.println("client fail");
		}
		
		/* on recherche le client dans la base pour avoir son id */
		
		int idClientTrouve = ClientBD.getIdClient(emailClient);
		
		/* on le met en session pour pouvoir réaliser la réservation */
		HttpSession session = request.getSession();
		session.setAttribute("codeClient", idClientTrouve);
		
		ClientBD.deconnexion();

		RequestDispatcher dispat = request.getRequestDispatcher("ReserverVelo");
		dispat.forward(request, response);
	}

}

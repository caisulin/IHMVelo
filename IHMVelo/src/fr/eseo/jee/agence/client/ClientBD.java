package fr.eseo.jee.agence.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eseo.jee.agence.client.Client;

public class ClientBD {

	private static Statement stmt;
	private static Connection connect;

	public static Statement connexion() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			connect = DriverManager.getConnection("jdbc:mysql://localhost/gestionClient?user=adminclient&password=network&autoReconnect=true&useSSL=false");
			
			stmt = connect.createStatement();
			
			return stmt;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void deconnexion() {
		try {
			stmt.close();
			connect.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	
	public static int ajoutClient(Client client) {
		connexion();
		int result = -1;
		try {
			stmt.execute("INSERT INTO Client(`nom`, `prenom`, `telephone`, `email`, `adresse`) "
					+ "VALUES ('"+client.getNom()
					+ "', '"+client.getPrenom()
					+ "', '"+client.getTelephone()
					+ "', '"+client.getEmail()
					+ "', '"+client.getAdresse()+ "')");
			
			result = 0;
			deconnexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static int getIdClient(String email) {
		connexion();
		int result = -1;
		try {
			stmt.executeQuery("SELECT idClient FROM Client WHERE "
					+ "email='" + email +"'");
			ResultSet rset = stmt.getResultSet();
			if (rset.next()==true) {
				result = rset.getInt("idClient");
			}
		deconnexion();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}

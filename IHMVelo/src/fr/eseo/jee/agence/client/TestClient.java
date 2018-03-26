package fr.eseo.jee.agence.client;



public class TestClient {

	public static void main(String[] args) {
		Client client = new Client();
		client.setNom("nom");
		client.setPrenom("prenom");
		client.setAdresse("add");
		client.setEmail("client@email.fr");
		client.setTelephone("000");
		System.out.println(client.toString());
		ClientBD clientBD = new ClientBD();
		System.out.println(clientBD.ajoutClient(client));
	}
}

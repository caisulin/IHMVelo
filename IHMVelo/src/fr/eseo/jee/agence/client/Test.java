package fr.eseo.jee.agence.client;



import java.util.ArrayList;
import java.util.List;

import fr.eseo.jee.agence.velo.sw2.LocationSEI;
import fr.eseo.jee.agence.velo.sw2.LocationService;
import fr.eseo.jee.agence.velo.sw2.Velo;

public class Test {

	public static void main(String[] args) {
		
		String categorie = "vtt";
		String ville = "Nantes";
		Velo velo = new Velo();
		velo.setCategorie(categorie);
		velo.setVille(ville);
		velo.setCodeVelo(1);
		velo.setPrixLocation(10);
		List<Velo> lesVelos = new ArrayList<Velo>();
		
		// utiliser le sw pour convertir
		LocationService service = new LocationService();
		LocationSEI port = service.getLocationPort();
		
		
		List<Velo> velos = port.trouverVelo(velo);
		for (int i=0; i<velos.size(); i++) {
			System.out.println(velos.get(i).toString());
		}
		System.out.println(velos);
		
		
		
//		farenheit = port.celsiusToFarenheit(celsius);
		lesVelos = port.trouverVelo(velo);
		System.out.println(lesVelos.get(0).toString());
	}

}

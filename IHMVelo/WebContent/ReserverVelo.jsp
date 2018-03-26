<%@ page language="java" contentType="text/html5; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Réserver un vélo</title>
</head>
<body>
<h2>Réserver un vélo</h2>
	
	<form method="post" action="DemandeReservationVelo">
		<fieldset>
			<legend>Vos coordonnées</legend>
			Nom : <input type="text" name="nom" /> <br>
			Prénom : <input type="text" name="prenom" /> <br> 
			Numéro de téléphone : <input type="tel" name="naissance"> <br> 
			Adresse mail : <input type="email" name="mail"> <br>
		</fieldset>

		<br>

		<fieldset>
			<legend>Votre demande de location</legend>
			Localisation : <select name="ville">
				<option>Angers
				<option>Bordeaux
				<option>Nantes
			</select> <br> 
			Début  Date : <input type="date" name="dateDebut"> 
			Heure : <input type="time" name="heureDebut"> <br>
			Fin  Date : <input type="date" name="dateFin">
			Heure : <input type="time" name="heureFin"> <br> 
			Type de vélo : <select name="velo">
				<option>Fixie
				<option>VTT
				<option>Vélo homme
				<option>Vélo femme
				<option>Vélo enfant
			</select> <br> 
			Accesoire : <select name="accesoire">
				<option>Aucun
				<option>Petites roulettes
				<option>Remorque pour enfant
				<option>Porte bagages
				<option>Siège enfant
			</select>
		</fieldset> <br>

		<input type="submit" value="envoyer">

	</form>
</body>
</html>
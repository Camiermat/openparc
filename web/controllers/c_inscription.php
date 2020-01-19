<?php

require_once(PATH_MODELS.'UserDAO.php');

//require_once(PATH_MODELS.'CategorieDAO.php');

if (isset($_POST['Identifiant']) and isset($_POST['Mot_de_passe']) and isset($_POST['email'])) {
	$id =  htmlspecialchars($_POST['Identifiant']);
	$mdp =  htmlspecialchars($_POST['Mot_de_passe']);
	$em = htmlspecialchars($_POST['email']);
	$mdphash = password_hash($mdp, PASSWORD_DEFAULT);

	if (!((new UserDAO()) -> existUser($id))){
		(new UserDAO()) -> createUser($id,$mdphash, $em);
		$pata = (new UserDAO())-> getUser($id);
		$_SESSION['Identifiant']= $pata->getUserId();

			$message = "<h1>Merci de vous etres inscrit sur notre sites !</h1>\r\nLine 2\r\nLine 3";
			$message = wordwrap($message, 70, "\r\n");

			mail($pata->getEmail(), 'Merci', $message);

		header('location: index.php');
		exit();

	} else {
		$alert = choixAlert('connexion_incorrect');
	}


}
require_once(PATH_VIEWS.$page.'.php');
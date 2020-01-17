<?php

require_once(PATH_MODELS.'UserDAO.php');

//require_once(PATH_MODELS.'CategorieDAO.php');

if (isset($_POST['Identifiant']) and isset($_POST['Mot_de_passe'])) {
	$id =  htmlspecialchars($_POST['Identifiant']);
	$mdp =  htmlspecialchars($_POST['Mot_de_passe']);
	$mdphash = password_hash($mdp, PASSWORD_DEFAULT);

	if (!((new UserDAO()) -> existUser($id))){
		(new UserDAO()) -> createUser($id,$mdphash);
		$pata = (new UserDAO())-> getUser($id);
		$_SESSION['Identifiant']= $pata->getUserId();
		header('location: index.php');

	} else {
		$alert = choixAlert('connexion_incorrect');
	}


}
require_once(PATH_VIEWS.$page.'.php');
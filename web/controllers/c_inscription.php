<?php

require_once(PATH_MODELS.'UserDAO.php');

//require_once(PATH_MODELS.'CategorieDAO.php');

if (isset($_POST['Identifiant']) and isset($_POST['Mot_de_passe'])) {
	$id =  htmlspecialchars($_POST['Identifiant']);
	$mdp =  htmlspecialchars($_POST['Mot_de_passe']);
	$mdphash = password_hash($mdp, PASSWORD_DEFAULT);
	
	if (!((new UserDAO()) -> existUser($id))){
	//if($id==IDENTIFIANT and password_verify($mdp,MOT_DE_PASSE)){
	/*	$_SESSION[$id]=1;
		header('location: index.php');
		*/
		(new UserDAO()) -> createUser($id,$mdphash);
		header('location: index.php');

	} else {
		$alert = choixAlert('connexion_incorrect');
	}


}
require_once(PATH_VIEWS.$page.'.php');
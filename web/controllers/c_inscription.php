<?php

//require_once(PATH_MODELS.'PhotoDAO.php');
//require_once(PATH_MODELS.'CategorieDAO.php');

if (isset($_POST['Identifiant']) and isset($_POST['Mot_de_passe'])) {
	$id =  htmlspecialchars($_POST['Identifiant']);
	$mdp =  htmlspecialchars($_POST['Mot_de_passe']);
	if($id==IDENTIFIANT and password_verify($mdp,MOT_DE_PASSE)){
		$_SESSION[$id]=1;
		header('location: index.php');
	} else {
		$alert = choixAlert('connexion_incorrect');
	}
	echo password_hash($mdp, PASSWORD_DEFAULT);

}
require_once(PATH_VIEWS.$page.'.php');
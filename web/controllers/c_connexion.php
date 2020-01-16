<?php

//require_once(PATH_MODELS.'PhotoDAO.php');
//require_once(PATH_MODELS.'CategorieDAO.php');

require_once(PATH_MODELS.'UserDAO.php');

if (isset($_POST['Identifiant']) and isset($_POST['Mot_de_passe'])) {
	$id =  htmlspecialchars($_POST['Identifiant']);
	$mdp =  htmlspecialchars($_POST['Mot_de_passe']);
	
	if((new UserDAO()) -> existUser($id)){
		$pata = (new UserDAO())-> getUser($id);
		echo $mdphash;
		echo '<br>';
		echo $pata->getPassHash();
		if(password_verify($mdp, $pata->getPassHash())){
			$_SESSION['Identifiant']=$pata;
			header('location: index.php');
		} 
		else {
			$alert = choixAlert('connexion_incorrect');
		}
	} 
	else {
		$alert = choixAlert('connexion_incorrect');
	}

}
require_once(PATH_VIEWS.$page.'.php');
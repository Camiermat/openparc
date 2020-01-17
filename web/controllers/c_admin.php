
<?php


require_once(PATH_MODELS.'UserDAO.php');
//appel de la vue
//require_once(PATH_MODELS.'PhotoDAO.php');
//require_once(PATH_MODELS.'CategorieDAO.php');

	if (isset($_SESSION['Identifiant'])) {
		if($_SESSION['Identifiant']!="admin"){
			$page='accueil';
			header('location: index.php');
		}
	}
	else{
		$page='accueil';
		header('location: index.php');
	}

require_once(PATH_VIEWS.$page.'.php');
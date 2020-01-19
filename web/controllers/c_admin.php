
<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_MODELS.'UserDAO.php');
//appel de la vue
//require_once(PATH_MODELS.'PhotoDAO.php');
//require_once(PATH_MODELS.'CategorieDAO.php');
$skilibit = 0;
$skoooilibit = 0;
	if (isset($_SESSION['Identifiant'])) {
		if($_SESSION['Identifiant']!="admin"){
			$page='accueil';
			header('location: index.php');
		}
		else{
			if(isset($_POST['code_promo']) && isset($_POST['montant_promo'])){
				$res = (new UserDAO)->prepareCat('INSERT into CodePromo values (?,?)');
				$co = htmlspecialchars($_POST['code_promo']);
				$mo = htmlspecialchars($_POST['montant_promo']);
				$res -> execute(array($co,$mo));
				$skilibit = 1;
			}
			if(isset($_POST['plus12']) && isset($_POST['moins12'])){
				$res2 = (new UserDAO)->prepareCat('UPDATE Prix SET montant=? where nom=?');
				$res3 = (new UserDAO)->prepareCat('UPDATE Prix SET montant=? where nom=?');
				$plus = htmlspecialchars($_POST['plus12']);
				$moins = htmlspecialchars($_POST['moins12']);
				$res2 -> execute(array($plus, "plus12"));
				$res3 -> execute(array($moins, "moins12"));
				$skoooilibit = 1;
			}
		}
	}
	else{
		$page='accueil';
		header('location: index.php');
	}

require_once(PATH_VIEWS.$page.'.php');
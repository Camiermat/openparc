
<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_MODELS.'UserDAO.php');
//appel de la vue
//require_once(PATH_MODELS.'PhotoDAO.php');
//require_once(PATH_MODELS.'CategorieDAO.php');
$skilibit = 0;
$skoooilibit = 0;
$skoooiooot =0;
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
				$res -> closeCursor();
			}
			if(isset($_POST['jour']) &&  isset($_POST['prixx']) && isset($_POST['cat'])){
				$res2 = (new UserDAO)->prepareCat('UPDATE Prix SET montant=? where nom=? and cat=?');
				$c = htmlspecialchars($_POST['cat']);
				$plus = htmlspecialchars($_POST['jour']);
				$moins = htmlspecialchars($_POST['prixx']);
				$res2 -> execute(array($moins, $plus, $c));

				$skoooilibit = 1;
				$res2 -> closeCursor();

			}
			if(isset($_POST['jour']) &&  isset($_POST['nb_place']) && isset($_POST['cat'])){
				$res3 = (new UserDAO)->prepareCat('UPDATE NombrePlaces SET nb_place_total=? where cat=? and jour=?');
				$jou = htmlspecialchars($_POST['jour']);
				$nbp = htmlspecialchars($_POST['nb_place']);
				$kat = htmlspecialchars($_POST['cat']);
				$res3 -> execute(array($nbp, $kat, $jou));

				$skoooiooot = 1;
				$res3 -> closeCursor();

			}
		}
	}
	else{
		$page='accueil';
		header('location: index.php');
	}

	function getPrice($nomjour, $nomcat){
		$res6 = (new UserDAO)->prepareCat('SELECT montant from Prix where nom=? and Cat =?');

		$res6 -> execute(array($nomjour,$nomcat));
		foreach ($res6 as $p){
				$result = $p['montant'] ;
			}
			$res6 -> closeCursor();
		return $result.' $';
	}

require_once(PATH_VIEWS.$page.'.php');
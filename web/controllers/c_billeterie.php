<?php

require_once(PATH_MODELS.'UserDAO.php');

require_once(PATH_VIEWS.$page.'.php');
	function getPrice($nomjour, $nomcat){
		$res6 = (new UserDAO)->prepareCat('SELECT montant from Prix where nom=? and Cat =?');

		$res6 -> execute(array($nomjour,$nomcat));
		foreach ($res6 as $p){
				$result = $p['montant'] ;
			}

		return $result.' $';
	}

?>


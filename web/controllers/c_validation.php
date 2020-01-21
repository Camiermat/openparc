<?php

require_once(PATH_MODELS.'UserDAO.php');



	function getPrice($nomjour, $nomcat){
		$res6 = (new UserDAO)->prepareCat('SELECT montant from Prix where nom=? and Cat =?');

		$res6 -> execute(array($nomjour,$nomcat));
		foreach ($res6 as $p){
				$result = $p['montant'] ;
			}
		$res6 -> closeCursor();
		return $result;
	}
	function getPromo($nompour){
		$res8 = (new UserDAO)->prepareCat('SELECT montant_promo from CodePromo where code_promo=? ');

		$res8 -> execute(array($nompour));
		if ($res8){
			
			foreach ($res8 as $p){
					$resulta = $p['montant_promo'];
				}
		}
		else {
			$resulta =null;
		}
		$res8 -> closeCursor();
		return $resulta;
	}
//ecrire ici l incrementation et la verification des places dispo 

$nbmoin3 = abs(htmlspecialchars($_POST['moinsde3quant']));
$catmoin3=htmlspecialchars($_POST['exampleSelect']);

$nbmoin12 = abs(htmlspecialchars($_POST['moinsde12quant']));
$catmoin12= htmlspecialchars($_POST['exampleSelect2']);


$nbplu12 = abs(htmlspecialchars($_POST['plusde12quant']));
$catplu12=htmlspecialchars($_POST['exampleSelect12']);

$prixplus12 = getPrice(htmlspecialchars($_POST['exampleSelect1']),$catplu12);


if($_POST['exampleSelect1']=='Samedi' or $_POST['exampleSelect1']=='Vendredi'){
	$prixmoin12 = getPrice(htmlspecialchars($_POST['exampleSelect1']),$catmoin12)-10;
}
else{
	$prixmoin12 = getPrice(htmlspecialchars($_POST['exampleSelect1']),$catmoin12)-5;	
}


if (isset($_POST['codepromo'])){
	if ($_POST['codepromo']!=""){
	if (getPromo(htmlspecialchars($_POST['codepromo']))!=null){
		$pro = getPromo(htmlspecialchars($_POST['codepromo']));
	}
	else{
		$fujiko=1;
	}
	if(getPromo(htmlspecialchars($_POST['codepromo']))<0 or getPromo(htmlspecialchars($_POST['codepromo']))>100){
		$fujiko=1;
	}
}
}
require_once(PATH_VIEWS.$page.'.php');
?>


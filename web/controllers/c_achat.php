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
	function insert($identif,$msg,$id){
		$res = (new UserDAO)->prepareCat('INSERT into Achats values (?,?,?)');
		$res -> execute(array($identif,$msg,$id));
		$res -> closeCursor();
		return null;
	}

	function actunbtot($jour,$nb,$c){
		$res = (new UserDAO)->prepareCat('UPDATE NombrePlaces SET utilisé=? where cat=? and jour=?');
		$res -> execute(array($nb,$c,$jour));
		$res -> closeCursor();
		return null;
	}
	function gettot($jour, $c){
		$res = (new UserDAO)->prepareCat('SELECT nb_place_total FROM NombrePlaces where cat=? and jour=?');
		$res -> execute(array($c,$jour));
		if ($res){	
			foreach ($res as $p){
					$result = $p['nb_place_total'];
				}
		}
		else {
			$res -> closeCursor();
			$result =null;
		}
		$res -> closeCursor();
		return $result;
	}


	function getutil($jour, $c){
		$res = (new UserDAO)->prepareCat('SELECT utilisé FROM NombrePlaces where cat=? and jour=?');
		$res -> execute(array($c,$jour));
		if ($res){	
			foreach ($res as $p){
					$result = $p['utilisé'];
				}
		}
		else {
			$res -> closeCursor();
			$result =null;
		}
		$res -> closeCursor();
		return $result;
	}
	//ecrire ici l incrementation et la verification des places dispo 


$nbmoin3 = htmlspecialchars($_POST['moinsde3quant']);
$catmoin3=htmlspecialchars($_POST['exampleSelect']);

$nbmoin12 = htmlspecialchars($_POST['moinsde12quant']);
$catmoin12= htmlspecialchars($_POST['exampleSelect2']);
$prixmoin12 = getPrice(htmlspecialchars($_POST['exampleSelect1']),$catmoin12);

$nbplu12 = htmlspecialchars($_POST['plusde12quant']);
$catplu12=htmlspecialchars($_POST['exampleSelect12']);
$prixplus12 = getPrice(htmlspecialchars($_POST['exampleSelect1']),$catplu12);


$nbtpcat1 = 0;
$nbtpcat2 = 0; 
if($catmoin3==1){
$nbtpcat1 += $nbmoin3;
}
else{
$nbtpcat2 += $nbmoin3;
}
if($catmoin12==1){
$nbtpcat1 += $nbmoin12;
}
else{
$nbtpcat2 += $nbmoin12;
}
if($catplu12==1){
$nbtpcat1 += $nbplu12;
}
else{
$nbtpcat2 += $nbplu12;
}

if((getutil($_POST['exampleSelect1'], 1)+$nbtpcat1)>gettot($_POST['exampleSelect1'], 1)){
	if((getutil($_POST['exampleSelect1'], 2)+$nbtpcat2)>gettot($_POST['exampleSelect1'], 2)){
		header('location: index.php?errorp1=1&errorp2=1');
		exit();
	}
header('location: index.php?errorp1=1');
exit();
}
else{
	actunbtot($_POST['exampleSelect1'], $nbtpcat1, 1);
}
if((getutil($_POST['exampleSelect1'], 2)+$nbtpcat2)>gettot($_POST['exampleSelect1'], 2)){	
	if((getutil($_POST['exampleSelect1'], 1)+$nbtpcat1)>gettot($_POST['exampleSelect1'], 1)){
		header('location: index.php?errorp1=1&errorp2=1');
		exit();
	}
header('location: index.php?errorp2=1');
exit();
}
else{
	actunbtot($_POST['exampleSelect1'], $nbtpcat2, 2);
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


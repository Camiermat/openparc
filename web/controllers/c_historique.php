<?php

require_once(PATH_MODELS.'UserDAO.php');


	function gethist($user){
		$res = (new UserDAO)->prepareCat('SELECT msg from Achats where Identifiant=? ');

		$res -> execute(array($user));
		
		foreach ($res as $p){
					$result = $p['msg'] ;
					echo'	<div class="col-md-4 col-sm-12 text-center">
						<img id="imageQRcode" src="http://chart.apis.google.com/chart?cht=qr&chs=300x300&chl='.$result.'" alt="QR Code" name="imageQRcode" /><br>
						<a href="http://chart.apis.google.com/chart?cht=qr&chs=500x500&chl='.$result.'"><button class="btn btn-sm btn-warning">Télécharger le qr code</button></a>
					</div>';
				}
		$res -> closeCursor();
		return null;
	}
require_once(PATH_VIEWS.$page.'.php');
?>

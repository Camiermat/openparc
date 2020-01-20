<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Zone message d'alerte -->
<?php require_once(PATH_VIEWS.'alert.php');?>
<div class="container">
	<h1>Historique des achats de <?=$_SESSION['Identifiant'];?> :</h1>
	<div class="row">
		<?php	
			if (isset($_SESSION['Identifiant'])) {
				gethist(htmlspecialchars($_SESSION['Identifiant']));	
			}
		?>
	</div>
</div>
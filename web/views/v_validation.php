
<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Zone message d'alerte -->
<?php require_once(PATH_VIEWS.'alert.php');
if(((!($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12!=0) and !($nbmoin3!=0)) or !(isset($_SESSION['Identifiant'])))){
	echo'
							<div class="alert alert-danger alert-dismissible fade show" role="alert">
								<p>Tu n\'es pas connecté ou ta comande est vide</p>
								<button type="button" class="close" data-dismiss="alert" aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>';
					}

	?>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-sm-12">
			<h1 class="col-12">Récapitulatif de la commande :</h1>
			<p><span class="text-success">Nombres de billets moins de 3 ans </span>: <?= $nbmoin3.' Gratuit en catégorie '.$catmoin3 ;?> </p>
			<p><span class="text-success">Nombres de billets moins de 12 ans</span> : <?=$nbmoin12.' à '.$prixmoin12.' $ en catégorie '.$catmoin12 ;?> </p>
			<p><h7><span class="text-info">Sous total </span>: <?= $nbmoin12*$prixmoin12.' $' ;?></h7></p>
			<p><span class="text-success">Nombre de billets plus de 12 ans </span>: <?=$nbplu12.' à '.$prixplus12.' $ en catégorie '.$catplu12 ;?> </p>
			<p><h7><span class="text-info">Sous total</span> : <?= $nbplu12*$prixplus12.' $' ;?></h7></p>
			<p><span class="text-warning">Total hors promotions </span>: <?= $nbmoin12*$prixmoin12 + $nbplu12*$prixplus12.' $' ;?></p>
			<p><span class="text-info">Promotion de</span> : <?php if (isset($pro)) {
										echo $pro.' %';
									}
									else{
										echo '0 $';
									} ?>
				
			</p>
			<p><span class="text-secondary">Total </span>: <?php 
			if(isset($pro)) {
				echo ($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12) - (($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12)*($pro/100)).' $';
			}else{
				echo ($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12).' $';
			}
				?></p>
			

		</div>
		<div class="col-md-6 col-sm-12">
			<form action='index.php?page=achat' method='POST' name='achat-form'>
				<?='<input type="hidden" name="exampleSelect1" value="'.$_POST["exampleSelect1"].'">';?>

				<?='<input type="hidden" name="moinsde3quant" value="'.$nbmoin3.'">';?>
				<?='<input type="hidden" name="exampleSelect" value="'.$catmoin3.'">';?>

				<?='<input type="hidden" name="moinsde12quant" value="'.$nbmoin12.'">';?>
				<?='<input type="hidden" name="exampleSelect2" value="'.$catmoin12.'">';?>

				<?='<input type="hidden" name="plusde12quant" value="'.$nbplu12.'">';?>
				<?='<input type="hidden" name="exampleSelect12" value="'.$catplu12.'">';?>
				<?php 
				if (isset($_POST['nlicence'])){
					echo'<input type="hidden" name="nlicence" value="'.$_POST['nlicence'].'">';
				}
					if((($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12!=0) or ($nbmoin3!=0)) and (isset($_SESSION['Identifiant']))){
						echo '<div style="margin-top : 30pt;" class="text-center">
							<button type="submit" class="btn btn-secondary btn-lg">Valider</button>
							<h6 class="col-12 text-warning">Vous allez etre redirigé vers votre page de payement</h5>
						</div>';
					}	
				?>
			</form>
		</div>

	</div>
</div>

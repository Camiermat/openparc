
<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Zone message d'alerte -->
<?php require_once(PATH_VIEWS.'alert.php');?>
<div class="container">
	<div class="row">
		<div class="col-6">
			<h1 class="col-12">Récapitulatif de la commande :</h1>
			<p>Nombres de billets moins de 3 ans : <?= $nbmoin3.' Gratuit en catégorie '.$catmoin3 ;?> </p>
			<p>Nombres de billets moins de 12 ans : <?=$nbmoin12.' à '.$prixmoin12.' $ en catégorie '.$catmoin12 ;?> </p>
			<p><h7>Sous total : <?= $nbmoin12*$prixmoin12.' $' ;?></h7></p>
			<p>Nombre de billets plus de 12 ans : <?=$nbplu12.' à '.$prixplus12.' $ en catégorie '.$catplu12 ;?> </p>
			<p><h7>Sous total : <?= $nbplu12*$prixplus12.' $' ;?></h7></p>
			<p>Total hors promotions : <?= $nbmoin12*$prixmoin12 + $nbplu12*$prixplus12.' $' ;?></p>
			<p>Promotion de : <?php if (isset($pro)) {
										echo $pro.' %';
									}
									else{
										echo '0 $';
									} ?>
				
			</p>
			<p>Total : <?php 
			if(isset($pro)) {
				echo ($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12) - (($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12)*($pro/100)).' $';
			}else{
				echo ($nbmoin12*$prixmoin12 + $nbplu12*$prixplus12).' $';
			}
				?></p>
			

		</div>
		<div class="col-6">
			<form action='index.php?page=achat' method='POST' name='achat-form'>
				<?='<input type="hidden" name="exampleSelect1" value="'.$_POST["exampleSelect1"].'">';?>

				<?='<input type="hidden" name="moinsde3quant" value="'.$nbmoin3.'">';?>
				<?='<input type="hidden" name="exampleSelect" value="'.$catmoin3.'">';?>

				<?='<input type="hidden" name="moinsde12quant" value="'.$nbmoin12.'">';?>
				<?='<input type="hidden" name="exampleSelect2" value="'.$catmoin12.'">';?>

				<?='<input type="hidden" name="plusde12quant" value="'.$nbplu12.'">';?>
				<?='<input type="hidden" name="exampleSelect12" value="'.$catplu12.'">';?>

				<div style="margin-top : 30pt;" class="text-center">
					<button type="submit" class="btn btn-secondary btn-lg">Valider</button>
					<h6 class="col-12 text-warning">Vous allez etre redirigé vers votre page de payement</h5>
				</div>
			</form>
		</div>

	</div>
</div>

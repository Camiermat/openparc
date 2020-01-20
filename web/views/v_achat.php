
<?php require_once(PATH_VIEWS.'header.php');?>
<div class="alert alert-info alert-dismissible fade show" role="alert">
	<b>Merci beaucoup</b> de votre <i>achat</i><b> !! !</b>
	<button type="button" class="close" data-dismiss="alert" aria-label="Close">
		<span aria-hidden="true">&times;</span>
	</button>
</div>


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

			<h1 class="col-12">Moyen de Récupération :</h1>
			<h3 class="col-12">Le QR code :</h3>
			<div>
				<!--Qr code -->
				<a href="#"><button class="btn btn-sm btn-warning">Télécharger le qr code</button></a>
			</div>
			<h7 class="col-12 text-info"><b>**</b><i> Un email vous a été envoyé avec le récapitulatif et le qr code</i></h7>
			
		</div>

	</div>
</div>
			








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

			<h1 class="col-12">Moyen de Récupération :</h1>
			<h3 class="col-12">Le QR code :</h3>
			<div>
				<?php
					$u = uniqid();
					$bonsoir= 'Identifiant:'.$_SESSION['Identifiant'].',pour le '.$_POST["exampleSelect1"].',Nombres de billets moins de 3 ans:'.$nbmoin3.'en catégorie'.$catmoin3.',Nombres de billets moins de 12 ans:'.$nbmoin12.'en catégorie'.$catmoin12.',Nombre de billets plus de 12 ans:'.$nbplu12.'en catégorie'.$catplu12.',id:'.$u;
					if (isset($_POST['nlicence'])){
						$bonsoir = $bonsoir.',ET LE NUM LICENCE:'.$_POST['nlicence'];
					}
					insert($_SESSION['Identifiant'],$bonsoir,$u);
						echo '<img style="border-radius:15pt;" id="imageQRcode" src="http://chart.apis.google.com/chart?cht=qr&chs=300x300&chl='.$bonsoir.'" alt="QR Code" name="imageQRcode" />';
				
				
			echo '<a href="http://chart.apis.google.com/chart?cht=qr&chs=500x500&chl='.$bonsoir.'"><button class="btn btn-sm btn-warning">Télécharger le qr code</button></a>';
				?>
			</div>
			<h7 class="col-12 text-info"><b>**</b><i> Un email vous a été envoyé avec le récapitulatif et le qr code</i></h7>
			
		</div>

	</div>
</div>
			







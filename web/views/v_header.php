<?php
/*
 * DS PHP
 * Vue Entete HTML du site
 *
 * Copyright 2017, Eric Dufour
 * http://techfacile.fr
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 *
 */
?>
<!DOCTYPE html>
<html>
	<head>
		<title><?= TITRE ?></title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="Language" content="<?= LANG ?>"/>
		<meta name="viewport" content="width=device-width; initial-scale=1; maximum-scale=1; user-scalable=0"/> 

		<link href="<?= PATH_CSS ?>bootstrap.css" rel="stylesheet"> 
		<link href="<?= PATH_CSS ?>css.css" rel="stylesheet">
		
	<!--	<script type="text/javascript" src="<?= PATH_SCRIPTS ?>jquery-3.1.1.js"></script>
		<script type="text/javascript" src="<?= PATH_SCRIPTS ?>jquery.validate.min.js"></script>
		<script type="text/javascript" src="<?= PATH_SCRIPTS ?>monjs.js"></script>
		-->
	</head> 
	<body>
		<!-- En-tête -->
		<header class="header" >
			<section class="container" >
				<div class = "row">
					
						<img class="col-sm-8 col-md-5"  id='logoto' src="<?= PATH_LOGO ?>" alt="<?= LOGO ?>" >
					
						<h2 class="text-warning"><?= TITRE ?></h2>
					
				</div>
			</section>
		</header>
		<?php 
			if (isset($_SESSION['Identifiant'])) {
				if($_SESSION['Identifiant']=="admin"){
					if($page=="admin"){
						if($skilibit==1){
							echo'
							<div class="alert alert-secondary alert-dismissible fade show" role="alert">
	  							Le code promo a été <b>ajouté </b>!
	  							<button type="button" class="close" data-dismiss="alert" aria-label="Close">
	  								<span aria-hidden="true">&times;</span>
	 							</button>
							</div>
							';
						}
						if ($skoooilibit==1) {
							echo'
								<div class="alert alert-info alert-dismissible fade show" role="alert">
		  							Les montants ont été <b>modifiés</b> !
		  							<button type="button" class="close" data-dismiss="alert" aria-label="Close">
		  								<span aria-hidden="true">&times;</span>
		 							</button>
								</div>
								';
						}
					}
				}
			}
		?>

		<?php 
		if (isset($fujiko)){
			if ($fujiko==1) {

				echo'
				<div class="alert alert-secondary alert-dismissible fade show" role="alert">
						Code promo non valide !
						<button type="button" class="close" data-dismiss="alert" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
				</div>
				';
			}
		}
		?>

		<!-- Menu -->
		<?php include(PATH_VIEWS.'menu.php'); ?>
		<!-- Vue -->
			<section class="container">
				<div class = "row">

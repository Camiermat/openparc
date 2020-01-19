<?php

//  En tête de page
?>
<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Zone message d'alerte -->
<?php require_once(PATH_VIEWS.'alert.php');?>

<!--  Début de la page -->
<div class="container">
	<div class="row">
<h1 class="col-12"><?php  echo TITRE_PAGE_INSCRIPTION;?></h1>
</div>
</div>
<!--  Formulaire -->
<div class="container ">
<form action='index.php?page=inscription' method='POST' name='inscription_form'>
	<div class="form-group row">
		<label for="Identifiant" class=" col-md-1 col-sm-4 form-label" >Identifiant:</label>
		 <div class="">
		 	<input type='text' id="Identifiant" class="form-control" name='Identifiant' required></input>
		 </div>
	</div>
	<div class="form-group row">
		<label for="email" class=" col-md-1 col-sm-4 form-label" >Email :</label>
		 <div class="">
		 	<input type='email' id="email" class="form-control" name='email' required></input>
		 </div>
	</div>
	<div class="form-group row">
		<label for="password" class=" col-md-1 col-sm-4 form-label">Password:</label>
		<div class="">
			<input class="form-control" id="password" type='password' name='Mot_de_passe' required></input>
		</div>
	</div>
 	<button type="submit" class="btn btn-primary">Valider</button>
	
</form>
</div>
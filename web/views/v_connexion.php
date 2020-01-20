
<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Zone message d'alerte -->
<?php require_once(PATH_VIEWS.'alert.php');?>

<!--  Début de la page -->
<div class="container">
	<div class="row">
<h1 class="col-12"><?php  echo TITRE_PAGE_CONNEXION;?></h1>
</div>
</div>
<!--  Formulaire -->

<form action='index.php?page=connexion' method='POST' name='connexion_form'>
	<div class="form-group row">
	<label for="Identifiant" class=" col-form-label" >Identifiant :</label>
	 <div class=""><input type='text' id="Identifiant" class="form-control" name='Identifiant' required></input></div>
</div>
<div class="form-group row">
	<label for="password" class=" col-form-label">Password :</label>
	<div class=""><input class="form-control" id="password" type='password' name='Mot_de_passe' required></input></div>
</div>
 <button type="submit" class="btn btn-primary">Valider</button>
	
</form>

<!--  Fin de la page -->


<!--  Pied de page -->
<?php //require_once(PATH_VIEWS.'footer.php'); 
?>
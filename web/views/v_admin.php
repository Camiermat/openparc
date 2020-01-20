<?php
/*

 */
//  En tête de page
//require(PATH_ENTITY.'Photo.php');
//require(PATH_ENTITY.'Categorie.php');
?>
<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Zone message d'alerte -->
<?php require_once(PATH_VIEWS.'alert.php');?>


<!--  Début de la page -->
<div class="container">
	<div class="row">
		<h1 style="margin-top: 10pt;margin-bottom: 40pt;" class="col-12"><?php  echo TITRE_PAGE_ADMIN;?></h1>
	</div>
</div>
<br>
<br>
<!--  Formulaire -->

	
	<form class="col-md-6 col-sm-12" action='index.php?page=admin' method='POST' name='admin_form_promo'>
		<h2>Ajout de nouveaux codes</h2>
		<div class="form-group">
			
			<div>
				<label for="code_promo"  >Nouveau code promo :</label>
				<input type='text' id="code_promo" class="form-control col-8" name='code_promo' required></input>
				
			</div>
			<div class="row">
				<div class="col-12">
					<label for="code_promo"  >Montant du code :</label>
					<input type='number' id="montant_promo" class="form-control col-4" name='montant_promo' required></input>
				</div>
			</div>
			<button type="submit" style="margin-top: 10pt;" class="btn btn-info">Valider</button>
		</div>
	</form>
		
	<form class="col-md-6 col-sm-12" action='index.php?page=admin' method='POST' name='admin_form_12'>
		<h2> Modification des prix</h2>
		<div class="form-group row">
			<label for="jour" >Selectioner le jour :</label>
			<select class="form-control col-4" id="jour" name="jour" >
		        <option>Dimanche</option>
		        <option>Lundi</option>
		        <option>Mardi</option>
		        <option>Mercredi</option>
		        <option>Jeudi</option>
		        <option>Vendredi</option>
		        <option>Samedi</option>
		      </select>
		</div>
		<div class="form-group row">
			<label class="" for="prixx" >Nouveau prix :</label>
			<input type='number' id="prixx" class="form-control col-2" name='prixx' required></input>
			<label class="" for="cat" >Catégorie :</label>
			<select class="form-control col-2" id="cat" name="cat" >
		        <option>1</option>
		        <option>2</option>
		      </select>
			<div class="col-12 text-center"><button type="submit" style="margin-top: 10pt;" class="btn btn-info ">Valider</button></div>
		</div>
	</form>


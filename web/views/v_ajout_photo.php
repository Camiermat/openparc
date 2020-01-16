<?php
/*
 * DS PHP
 * Vue page index - page d'accueil
 *
 * Copyright 2016, Eric Dufour
 * http://techfacile.fr
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 *
 */
//  En tête de page
?>
<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Zone message d'alerte -->
<?php require_once(PATH_VIEWS.'alert.php');?>

<!--  Début de la page -->
<h1><?php  echo TITRE_PAGE_CONNEXION;?></h1>

<!--  Formulaire -->

<form action='index.php?ajout_photo' method='POST' name='ajout_form'>
	<label>Choisir le fichier : </br><input type='file' name='fichier' required></input></label></br>
	<label>Décrire la photo en une phrase : </br><input type='text' name='description' required></input></label></br>
	<label>Choisir une categorie : </br>
		<select name="categorie" id="cat-id" onchange="myform.submit()">
			<?php
			if(!isset($_GET['categorie'])){
				$categories = (new CategorieDAO()) -> __getAllCategorie();
				foreach ($categories as $c)
				{
					echo '<option value="'.$c->__getNomCat().'">'.$c->__getNomCat().'</option>';
				}
			} else {
				echo '<option value="'.$_GET['categorie'].'">'.$_GET['categorie'].'</option>';
				$categories = (new CategorieDAO()) -> __getAllCategorie();
				foreach ($categories as $c)
				{
					if ($c->__getNomCat()!=$_GET['categorie']){
						echo '<option value="'.$c->__getNomCat().'">'.$c->__getNomCat().'</option>';
					}
				}
			}
			?>
		</select>
	</label></br>
	<input type='submit' value='Envoyer' name='button'></input>
</form>

<!--  Fin de la page -->


<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php'); 

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
<table class="text-center table table-striped table-bordered col-md-6 col-sm-12">

  <thead>
    <tr  class="table-info">
      <th scope="col">Grand Public</th>
      <th scope="col">Cat. 1</th>
      <th scope="col">Cat. 2</th>
    </tr>
  </thead>
  <tbody>
    <tr class="table-active">
      <th scope="row">Dimanche</th>
      <td><?= getPrice('Dimanche',1).'<br><small>places total:'.gettot("Dimanche", 1).'</small><br><small>places utilisé:'.getutil("Dimanche", 1).'</small>';?></td>
      <td><?= getPrice('Dimanche',2).'<br><small>places total:'.gettot("Dimanche", 2).'</small><br><small>places utilisé:'.getutil("Dimanche", 2).'</small>';?></td>
    </tr>
    <tr class="table-active">
      <th scope="row">Lundi</th>
      <td><?= getPrice('Lundi',1).'<br><small>places total:'.gettot("Lundi", 1).'</small><br><small>places utilisé:'.getutil("Lundi", 1).'</small>';?></td>
      <td><?= getPrice('Lundi',2).'<br><small>places total:'.gettot("Lundi", 2).'</small><br><small>places utilisé:'.getutil("Lundi", 2).'</small>';?></td>
    </tr>
    <tr class="table-active">
      <th scope="row">Mardi</th>
      <td><?= getPrice('Mardi',1).'<br><small>places total:'.gettot("Mardi", 1).'</small><br><small>places utilisé:'.getutil("Mardi", 1).'</small>';?></td>
      <td><?= getPrice('Mardi',2).'<br><small>places total:'.gettot("Mardi", 2).'</small><br><small>places utilisé:'.getutil("Mardi", 2).'</small>';?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Mercredi</th>
      <td><?= getPrice('Mercredi',1).'<br><small>places total:'.gettot("Mercredi", 1).'</small><br><small>places utilisé:'.getutil("Mercredi", 1).'</small>';?></td>
      <td><?= getPrice('Mercredi',2).'<br><small>places total:'.gettot("Mercredi", 2).'</small><br><small>places utilisé:'.getutil("Mercredi", 2).'</small>';?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Jeudi</th>
      <td><?= getPrice('Jeudi',1).'<br><small>places total:'.gettot("Jeudi", 1).'</small><br><small>places utilisé:'.getutil("Jeudi", 1).'</small>';?></td>
      <td><?= getPrice('Jeudi',2).'<br><small>places total:'.gettot("Jeudi", 2).'</small><br><small>places utilisé:'.getutil("Jeudi", 2).'</small>';?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Vendredi</th>
      <td><?= getPrice('Vendredi',1).'<br><small>places total:'.gettot("Vendredi", 1).'</small><br><small>places utilisé:'.getutil("Vendredi", 1).'</small>';?></td>
      <td><?= getPrice('Vendredi',2).'<br><small>places total:'.gettot("Vendredi", 2).'</small><br><small>places utilisé:'.getutil("Vendredi", 2).'</small>';?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Samedi</th>
      <td><?= getPrice('Samedi',1).'<br><small>places total:'.gettot("Samedi", 1).'</small><br><small>places utilisé:'.getutil("Samedi", 1).'</small>';?></td>
      <td><?= getPrice('Samedi',2).'<br><small>places total:'.gettot("Samedi", 2).'</small><br><small>places utilisé:'.getutil("Samedi", 2).'</small>';?></td>
    </tr>
  </tbody>
</table> 


	<div class="col-md-6 col-sm-12">
	<form action='index.php?page=admin' method='POST' name='admin_form_12'>
		<h2 class="text-info"> Modification des prix</h2>
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

	<form style="margin-top: 30pt;"  action='index.php?page=admin' method='POST' name='admin_form_quantité'>
		<h2 class="text-info"> Modification du nombre de places</h2>
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
			<label for="nb_place"  >Nombres de places :</label>
			<input type='number' id="nb_place" class="form-control col-2" name='nb_place' required></input>
			<label class="" for="cat" >Catégorie :</label>
			<select class="form-control col-2" id="cat" name="cat" >
		        <option>1</option>
		        <option>2</option>
		      </select>
			<div class="col-12 text-center"><button type="submit" style="margin-top: 10pt;" class="btn btn-info ">Valider</button></div>
		</div>
	</form>




<form  action='index.php?page=admin' method='POST' name='admin_form_promo'>
		<h2 class="text-info">Ajout de nouveaux codes</h2>
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

</div>
	
	
	

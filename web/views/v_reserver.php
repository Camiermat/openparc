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
<div class="container">
	<from>
<div class="row">

	<div class="col-5">
		<h1>Etape 1 :</h1>
			<h5 class="text-info" ><b>Selectionner les <i>places </i>:</b></h5>
	<table class="table table-striped table-bordered ">
	  <thead>
	    <tr  class="table-info">
	        <th scope="col">
		      <select class="form-control" id="exampleSelect1">
		        <option>Dimanche</option>
		        <option>Lundi</option>
		        <option>Mardi</option>
		        <option>Mercredi</option>
		        <option>Jeudi</option>
		        <option>Vendredi</option>
		        <option>Samedi</option>
		      </select>
		    </th>
	      <th scope="col">Catégorie</th>
	      <th scope="col">quantité</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr class="table-active">
	      <th >moins de 3 ans</th>
	      <td>
	      	<select class="form-control" id="exampleSelect1">
	      		<option>Cat.1</option>
	      		<option>Cat.2</option>
	      	</select>
	      </td>
	      <td>
	      	<input class="form-control" type="number" name="moinsde12quant">
	      </td>
	    </tr>
	    <tr class="table-active">
	      <th >moins de 12 ans</th>
	      <td>
	      	<select class="form-control" id="exampleSelect1">
	      		<option>Cat.1</option>
	      		<option>Cat.2</option>
	      	</select>
	      </td>
	      <td>
	      	<input class="form-control" type="number" name="moinsde12quant">
	      </td>
	    </tr>
	    <tr class="table-active">
	      <th >plus de 12 ans</th>
	      <td>
	      	<select class="form-control" id="exampleSelect1">
	      		<option>Cat.1</option>
	      		<option>Cat.2</option>
	      	</select>
	      </td>
	      <td>
	      	<input class="form-control" type="number" name="moinsde12quant">
	      </td>
	    </tr>

	  </tbody>
	</table> 
	</div>	

	<div class="col-6">
		<h1>Etape 2 :</h1>
		<h5 class="text-info" ><b>Rentrer un <i>code promo</i> ou de<i> licence </i>:</b></h5>

		<div>
			<label for="codepromo" class="  form-label">Entre ton code promo pour avoir une réduction :</label>
			<input class="form-control" type="text" name="codepromo">
			<label for="nlicence" class=" form-label">Entre ton numéro de licence pour avoir une réduction :</label>
			<input class="form-control" type="text" name="nlicence">
		</div>
		<div style="margin-top : 30pt;" class="text-center">
			<button type="submit" class="btn btn-secondary">Valider</button>
		</div>

	</div>


</div>

</from>
</div>
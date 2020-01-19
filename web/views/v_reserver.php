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
<div class="row">
	<div class="col-6">
		<h1>Etape 1 :</h1>
		<h7 ><i>Selectionner la date :</i></h7>
	</div>

<div class="col-6">
	<h1>Etape 2 :</h1>
		<h7><i>Selectionner les places</i></h7>
<table class="table table-striped table-bordered ">
  <thead>
    <tr  class="table-info">
        <th scope="col">
	      <select class="form-control" id="exampleSelect1">
	        <option>Lundi</option>
	        <option>Mardi</option>
	        <option>Mercredi</option>
	        <option>Jeudi</option>
	        <option>Vendredi</option>
	        <option>Samedi</option>
	        <option>Dimanche</option>
	      </select>
	    </th>
      <th scope="col">Prix</th>
      <th scope="col">quantité</th>
    </tr>
  </thead>
  <tbody>
    <tr class="table-active">
      <th >moins de 3 ans</th>
      <td>price 1</td>
      <td>price 2</td>
    </tr>
    <tr class="table-active">
      <th >moins de 12 ans</th>
      <td>price 1</td>
      <td>price 2</td>
    </tr>
    <tr class="table-active">
      <th >plus de 12 ans</th>
      <td>price 1</td>
      <td>price 2</td>
    </tr>

  </tbody>
</table> 
</div>	
</div>
</div>
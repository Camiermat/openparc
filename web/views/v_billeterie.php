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
<h1>Tarif Grand public :</h1>
<p><b>**</b><i> Les enfants de <u>moins</u> de <b>12 ans</b> <u>et</u> les <b>licenciés</b> peuvent disposer d'une reduction de <b>10</b> euros les <u>samedi</u> et <u>vendredi</u> et de <b>5</b> euros tous les <u>autres jours</u> <b>!</b></i></p>

<table class="text-center table table-striped table-bordered col-md-6 col-sm-10">

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
      <td><?= getPrice('Dimanche',1);?></td>
      <td><?= getPrice('Dimanche',2);?></td>
    </tr>
    <tr class="table-active">
      <th scope="row">Lundi</th>
      <td><?= getPrice('Lundi',1);?></td>
      <td><?= getPrice('Lundi',2);?></td>
    </tr>
    <tr class="table-active">
      <th scope="row">Mardi</th>
      <td><?= getPrice('Mardi',1);?></td>
      <td><?= getPrice('Mardi',2);?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Mercredi</th>
      <td><?= getPrice('Mercredi',1);?></td>
      <td><?= getPrice('Mercredi',2);?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Jeudi</th>
      <td><?= getPrice('Jeudi',1);?></td>
      <td><?= getPrice('Jeudi',2);?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Vendredi</th>
      <td><?= getPrice('Vendredi',1);?></td>
      <td><?= getPrice('Vendredi',2);?></td>
    </tr>

    <tr class="table-active">
      <th scope="row">Samedi</th>
      <td><?= getPrice('Samedi',1);?></td>
      <td><?= getPrice('Samedi',2);?></td>
    </tr>
  </tbody>
</table> 
<div class="text-center">
<p class="text-secondary"><b>***</b> La réduction <i>moins</i> de <b>12 ans</b> s'applique uniquement pour la <u>catégorie 2</u>.</p>
<a href="index.php?page=reserver"><button  class="btn btn-info col-5 btn-lg">Réserver</button></a><br>
<a href="index.php?page=reserver"><button style="margin-top: 10pt;" class="btn btn-warning btn-sm ">Entrer un code Promo</button></a>
</div>
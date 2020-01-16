<?php

//appel de la vue
//require_once(PATH_MODELS.'PhotoDAO.php');
//require_once(PATH_MODELS.'CategorieDAO.php');

$cat = TEXTE_PAGE_ACCUEIL2;
if (isset($_GET["categorie"])){
	$cat =  htmlspecialchars($_GET['categorie']);
}
require_once(PATH_VIEWS.$page.'.php');
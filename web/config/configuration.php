<?php

const DEBUG = true; // production : false; dev : true

// Accès base de données
const BD_HOST = 'iutdoua-web.univ-lyon1.fr';
const BD_DBNAME = 'p1805797';
const BD_USER = 'p1805797';
const BD_PWD = '368798';

// Langue du site
const LANG ='FR-fr';

// Paramètres du site : nom de l'auteur ou des auteurs
const AUTEUR = 'DAURELLE Timothée'; 
define('TITRE','Site officiel de l\'open parc de lyon');

//dossiers racines du site
define('PATH_CONTROLLERS','./controllers/c_');
define('PATH_ASSETS','./assets/');
define('PATH_LIB','./lib/');
define('PATH_MODELS','./models/');
define('PATH_VIEWS','./views/v_');
define('PATH_TEXTES','./languages/');
define('PATH_ENTITY','./entities/');

//sous dossiers
define('PATH_CSS', PATH_ASSETS.'css/');
define('PATH_IMAGES', PATH_ASSETS.'images/');
define('PATH_SCRIPTS',PATH_ASSETS.'scripts/');
//define("PATH_GALERIE",'galerie/');
//define('PATH_LOG','log/');

//fichiers
//define('LOG_BDD','logbdd.txt');
define('PATH_LOGO', PATH_IMAGES.'logo.jpg');
define('PATH_MENU', PATH_VIEWS.'menu.php');

define('IDENTIFIANT','Matteo');
define('MOT_DE_PASSE','$2y$10$HEMilMy3JTifJwj6A/W2SuMESD4fpRYGpfeWZnSRQGrSJzumOTzHu');
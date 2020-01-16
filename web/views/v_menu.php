<?php
/*
 * TP PHP
 * Vue menu
 *
 * Copyright 2016, Eric Dufour
 * http://techfacile.fr
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 *
 * menu: http://www.w3schools.com/bootstrap/bootstrap_ref_comp_navs.asp
 */
?>
<!-- Menu du site -->

<nav class="navbar navbar-default">
  <div class="container-fluid" >
    <ul class="nav navbar-nav">
    	<div class="row">
		<li <?php echo ($page=='index' ? 'class="active"':'')?>>
			<a href="index.php" >
				<button <?= 'class="btn btn-outline-'.($page=='accueil' ? 'secondary"':'info"'); ?> >
					<?= MENU_ACCUEIL ?>
				</button>
			</a>
		</li>
		<li>
			<a href="index.php?page=billeterie" >
				<button <?= 'class="btn btn-outline-'.($page=='billeterie' ? 'secondary"':'info"'); ?> >
					Billeterie
				</button>
			</a>
		</li>
		<li>
			<a href="index.php?page=vip" >
				<button <?= 'class="btn btn-outline-'.($page=='vip' ? 'secondary"':'info"'); ?> >
					Espace VIP
				</button>
			</a>
		</li>
		<li>
			<a href="index.php?page=hebergement" >
				<button <?= 'class="btn btn-outline-'.($page=='hebergement' ? 'secondary"':'info"'); ?> >
					Hébergement
				</button>
			</a>
		</li>
	</div>
	</ul>
	<ul class="nav navbar-nav navbar-right">
		<li>
			<?php
			if (isset($_SESSION[IDENTIFIANT])) {
				if ($_SESSION[IDENTIFIANT]==1){
					echo '<a href="index.php?page=deconnexion">'.MENU_DECONNEXION.'</a>';
				} else {
					echo '<a href="index.php?page=connexion">'.MENU_CONNEXION.'</a>';
				}
			} else {
				echo '<a href="index.php?page=connexion">'.MENU_CONNEXION.'</a>';
			}
			?>
		</li>
    </ul>
  </div>
</nav>




<!-- Menu du site -->

<nav style="margin-top: 5pt;" class="navbar navbar-default">
  <div class="container-fluid" >
    <ul class="nav navbar-nav">
    	<div class="row">
			<li class="menubtnn">
				<a href="index.php" >
					<button <?= 'class="btn btn-outline-'.($page=='accueil' ? 'secondary"':'info"'); ?> >
						<?= MENU_ACCUEIL ?>
					</button>
				</a>
			</li>
			<li class="menubtnn">
				<a href="index.php?page=billeterie" >
					<button <?= 'class="btn btn-outline-'.($page=='billeterie' ? 'secondary"':'info"'); ?> >
						Billeterie
					</button>
				</a>
			</li>
			<li class="menubtnn">
				<a href="index.php?page=vip" >
					<button <?= 'class="btn btn-outline-'.($page=='vip' ? 'secondary"':'info"'); ?> >
						Espace VIP
					</button>
				</a>
			</li>
			<li class="menubtnn">
				<a href="index.php?page=hebergement" >
					<button <?= 'class="btn btn-outline-'.($page=='hebergement' ? 'secondary"':'info"'); ?> >
						Hébergement
					</button>
				</a>
			</li>
			<?php 
			if (isset($_SESSION['Identifiant'])) {
				if($_SESSION['Identifiant']=="admin"){
					echo   '<li class="menubtnn">
								<a href="index.php?page=admin">
									<button class="btn btn-outline-'.($page=="admin" ? "danger":"warning").'" >
									Modifications 
									</button>
								</a>
							</li>';
				}

			}
			?>
		</div>
	</ul>
	<ul class="nav navbar-nav text-center navbar-right">
		<li>
			<?php
			if (isset($_SESSION['Identifiant'])) {
					echo '<a style="margin-right:15pt;" href="index.php?page=historique">'.MENU_ACHATS.'</a>
							<a href="index.php?page=deconnexion">'.MENU_DECONNEXION.'</a>';
			} else {
				echo '<a href="index.php?page=connexion" class="menubtnn">'.MENU_CONNEXION.'</a>
				<a href="index.php?page=inscription" class="menubtnn">'.MENU_INSCRIPTION.'</a>';
			}
			if(isset($_SESSION['mode'])){
				if(!isset($_POST['mode'])){
					if($_SESSION['mode']=='light'){
						echo'<form action="index.php" method="POST" name="mode_form">
						<input type="hidden" name="mode" value="dark">
						<button type="submit" class="btn btn-sm btn-link text-info">Dark-mode</button>
						</form>
						';
					}
					else{
						echo'<form action="index.php" method="POST" name="mode_form">
						<input type="hidden" name="mode" value="light">
						<button type="submit" class="btn btn-sm btn-link text-info">Light-mode</button>
						</form>
						';
					}
				}
				else{
					if($_POST['mode']=='light'){
						echo'<form action="index.php" method="POST" name="mode_form">
					<input type="hidden" name="mode" value="dark">
					<button type="submit" class="btn btn-sm btn-link text-info">Dark-mode</button>
					</form>
					';
					}
					else{
						echo'<form action="index.php" method="POST" name="mode_form">
					<input type="hidden" name="mode" value="light">
					<button type="submit" class="btn btn-sm btn-link text-info">Light-mode</button>
					</form>
					';
					}
				}
			}
			else{
				if(!isset($_POST['mode'])){
					echo'<form action="index.php" method="POST" name="mode_form">
					<input type="hidden" name="mode" value="dark">
					<button type="submit" class="btn btn-sm btn-link text-info">Dark-mode</button>
					</form>
					';
				}
				else{
					if($_POST['mode']=='light'){
						echo'<form action="index.php" method="POST" name="mode_form">
					<input type="hidden" name="mode" value="dark">
					<button type="submit" class="btn btn-sm btn-link text-info">Dark-mode</button>
					</form>
					';
					}
					else{
						echo'<form action="index.php" method="POST" name="mode_form">
					<input type="hidden" name="mode" value="light">
					<button type="submit" class="btn btn-sm btn-link text-info">Light-mode</button>
					</form>
					';
					}
				}
			}
			?>
		</li>
    </ul>
  </div>
</nav>
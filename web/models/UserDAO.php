<?php
require_once('DAO.php');

class UserDAO extends DAO {
	
	public function getUser($i){
		$res = $this->prepareCat('SELECT * from User where Identifiant = ?');
		$res -> execute(array(htmlspecialchars($i)));
		if ($res){
			require_once(PATH_ENTITY.'User.php');
			foreach ($res as $p){
				$result = new User($p['Identifiant'],$p['PassHash']);
			}
			return $result;
		} else return null;
	}
	
	public function existUser($i){
		$res = $this->prepareCat('SELECT * from User where Identifiant = ?');
		$res -> execute(array($i));
		$res2 = $res -> fetchAll();
		$res -> closeCursor();
		if ($res2){
			return $res2;
		} else return null;
	}

	public function createUser($i,$m,$e){
		$res = $this->prepareCat('INSERT into User values (?,?,?)');
		$res -> execute(array($i,$m,$e));
		return null;
	}

}
?>

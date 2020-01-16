<?php
class User {
	private $UserId;
	private $PassHash;

	
	public function __construct($p, $n){
		$this->UserId = $p;
		$this->PassHash = $n;
	}

	public function getUserId(){
		return $this->UserId;
	}
	
	public function getPassHash(){
		return $this->PassHash;
	}
	
}
?>
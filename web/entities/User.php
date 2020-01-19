<?php
class User {
	private $UserId;
	private $PassHash;
	private $email;

	
	public function __construct($p, $n, $f){
		$this->UserId = $p;
		$this->PassHash = $n;
		$this->email = $f;
	}

	public function getUserId(){
		return $this->UserId;
	}
	
	public function getPassHash(){
		return $this->PassHash;
	}

	public function getEmail(){
		return $this->email;
	}
	
}
?>
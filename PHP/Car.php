<?php
require_once('Account.php')
class Car{
    public $id = integer;
    public $license = string;
    public $driver = string;
    public $passenger = string;

    public function __construct($license,$driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "Licencia: " $this->license "Driver: " $this->driver;
    }
}
?>
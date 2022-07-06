<?php
require_once ('Car.php');
class uberX extends Car {
    public $brand;
    public $model;

    public __construct($license, $driver, $brand, $model){
        parent::__construct($license,$driver)
        $this->brand = $brand;
        $this->model = $model;
    }
    
}
?>
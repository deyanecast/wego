<?php
require_once("Car.php");
require_once("uberX.php");
require_once("Account.php");

$uberX = new uberX("AMC123",new Account("Andres Herrera","HOLI"), "Toyota","X");
$uberX->printDataCar();
?>
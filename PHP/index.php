<?php
require_once("Car.php");
require_once("uberX.php");
require_once("Account.php");

$uberX = new uberX("AMC123",new Account("Andres Herrera","HOLI"), "Toyota","X");
$uberX->printDataCar();

$uberPool = new uberPool("AMC123",new Account("Andres Herrera","HOLI"), "Toyota","X");
$uberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

?>


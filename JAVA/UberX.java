package JAVA;

class UberX extends Car{
    String brand;
    String Model;

    public UberX(String license, Account driver, String brand, String Model){
        super(license, driver);
        this.brand = brand;
        this.Model = Model;
    }  

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + Model + " Brand: " + brand);
    }
}
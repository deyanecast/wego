package JAVA;

class UberPool extends Car{
    String brand;
    String Model;

    public UberPool(String license, Account driver, String brand, String Model){
        super(license, driver);
        this.brand = brand;
        this.Model = Model;
    }  
}
package JAVA;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "an123"));
        car.passenger = 4;
        car.printDataCar();

        var car2 = new Car("AMQ321", new Account("Andrea Herrera", "AND123"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}
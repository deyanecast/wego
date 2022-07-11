package JAVA;

import java.util.Map;
import java.util.ArrayList;


class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6  pasajeros");
        }
    }
}
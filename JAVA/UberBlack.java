package JAVA;

import java.util.Map;
import java.util.ArrayList;


class UberBlack extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver,Map<String, Map<String, Integer>> typeCarAccepted,ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
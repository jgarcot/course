package com.roche.vnv.third.srp.bad;

public class Lot {

    private String lotNumber;
    private String controlName;

    public Lot(String lotNumber, String controlName) {  //Constructor to be invoked to create objects from the class specification
        this.lotNumber = lotNumber;
        this.controlName = controlName;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getControlName() {
        return controlName;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

//    The only thing should be responsible for is knowing the values of itself. Should be entirely unconcerned how a value/s should be printed
//    We should create a concrete class to perform this
    public void printInfo() {
        System.out.println("LOT NUMBER IS " + lotNumber);
    }
}

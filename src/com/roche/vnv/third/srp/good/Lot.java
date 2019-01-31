package com.roche.vnv.third.srp.good;

public class Lot implements Printable {

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


    public void printInfo() {
        System.out.println("LOT NUMBER IS " + lotNumber);
    }

    @Override
    public String whichProperties() {
        return lotNumber;
    }
}

interface Printable { //ideally would be defined in a separate file & public
    String whichProperties();
}

class ConsolePrinter {

    public void print(Printable printable) { //Doing it so, we allow to any class implementing Printable to be printed by the properties we want
        System.out.println(printable.whichProperties());
    }
}

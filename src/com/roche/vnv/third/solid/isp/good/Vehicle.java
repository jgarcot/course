package com.roche.vnv.third.solid.isp.good;

//Abstract classes cannot be instantiated, but they can be subclassed.
abstract class Vehicle implements SwitchEngine {

    @Override
    public void startEngine() {
        System.out.println("");
    }

    @Override
    public void shutdownEngine() {

    }
}

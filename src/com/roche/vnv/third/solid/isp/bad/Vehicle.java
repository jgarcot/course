package com.roche.vnv.third.solid.isp.bad;

/**
 * Abstract classes cannot be instantiated, but they can be subclassed.
 * @link https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 */

abstract class Vehicle implements VehicleActions {

    //Parent class could implement some methods of the interface common to its children

    @Override
    public void startEngine() {
        System.out.println("up");
    }

    @Override
    public void shutdownEngine() {
        System.out.println("down");
    }
}

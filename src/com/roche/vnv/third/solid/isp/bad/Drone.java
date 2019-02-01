package com.roche.vnv.third.solid.isp.bad;

public class Drone extends Vehicle {

    //Clients should not be forced to depend on interfaces they do not use by throwing an Exception or empty method

    @Override
    public void turnRadioOn() {
        throw new UnsupportedOperationException("Generally speaking a drone has not this feature");
    }

    @Override
    public void turnRadioOff() {
        throw new UnsupportedOperationException("Generally speaking a drone has not this feature");
    }

    @Override
    public void turnCameraOn() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOff() {
        System.out.println("no");
    }
}

package com.roche.vnv.third.solid.isp.good;

public class Drone extends Vehicle implements SwitchCamera {

    @Override
    public void turnCameraOn() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOff() {
        System.out.println("no");
    }
}

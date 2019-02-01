package com.roche.vnv.third.solid.isp.good;

public class Car extends Vehicle implements SwitchRadio, SwitchCamera {

    @Override
    public void turnCameraOn() {
        System.out.println("yes");
    }

    @Override
    public void turnCameraOff() {
        System.out.println("no");
    }

    @Override
    public void turnRadioOn() {
        System.out.println("yes");
    }

    @Override
    public void turnRadioOff() {
        System.out.println("yes");
    }
}

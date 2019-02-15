package com.roche.vnv.third.solid.dip.good;

public class PhoneNotifier implements DeploymentNotifier {

    private final Twilio twilio;

    public PhoneNotifier(Twilio twilio) {
        this.twilio = twilio;
    }

    @Override
    public void sendTo(boolean deployed, String... params) {
       if (!deployed) {
           twilio.send(new Phone("", ""));
       }
    }
}
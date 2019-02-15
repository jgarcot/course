/**
 * should be move to package model as its an entity of our domain
 */
package com.roche.vnv.third.solid.dip.good;

public class Phone {

    /**
     * Makes sense to declare it as static attributes? - We won't be able to reuse it as i.e: FROM_NUMBER will be always the same phone
     */
//    private static final String FROM_NUMBER = "111 111 111";
//    private static final String TO_NUMBER = "666 666 666";
//    private Twilio twilio;

    private final String fromNumber;
    private final String toNumber;
    private final Twilio twilio;

    public Phone(String fromNumber, String toNumber) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.twilio = new Twilio();
    }

    /**
     * Why phone is responsible of sending a sms? Not accomplishing Single Responsibility Principle as well!
     */
//    public void sendTo(String text) {
//        //do the work
//        twilio.sendTo(FROM_NUMBER, TO_NUMBER, text);
//    }
}



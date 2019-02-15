package com.roche.vnv.third.solid.dip.bad;

public class Phone {

    /**
     * Makes sense to declare it as static attributes?
     */
    private static final String FROM_NUMBER = "111 111 111";
    private static final String TO_NUMBER = "666 666 666";
    private final Twilio twilio; //use an external dependency to perform the work

    public Phone() {
        twilio = new Twilio();
    }

    public void sendTo(String text) {
        //do the work
        twilio.sendTo(FROM_NUMBER, TO_NUMBER, text);
    }
}

/**
 * External service (real - https://developer.mailchimp.com/) to sendTo email, social ads and more
 */
class Twilio {

    public void sendTo(String fromNumber, String toNumber, String text) {
        //do some work
    }
}



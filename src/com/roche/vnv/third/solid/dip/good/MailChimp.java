package com.roche.vnv.third.solid.dip.good;

/**
 * External service (real - https://www.twilio.com/) to sendTo sms, video and whatsapp
 */
public class MailChimp {

    /**
     * Why should we define a sendTo() with parameters like from, to, subject, text?
     *
     * public void sendTo(String from, String to, String subject, String text) {
     *     //do some work
     * }
     * @param email The email with its features to be send
     */
    public void send(Email email) {
        //do some work
    }
}

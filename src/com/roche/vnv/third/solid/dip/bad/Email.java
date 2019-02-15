package com.roche.vnv.third.solid.dip.bad;

public class Email {

    /**
     * Makes sense to declare it as static attributes?
     */
    private static final String FROM = "hello@";
    private static final String TO = "gift@";
    private static final String SUBJECT = "subject";
    private final MailChimp mailChimp;

    public Email() {
        this.mailChimp = new MailChimp();
    }

    public void sendTo(String text) {
        //do the work
        mailChimp.send(FROM, TO, SUBJECT, text);
    }
}

/**
 * External service (real - https://www.twilio.com/) to sendTo sms, video and whatsapp
 */
class MailChimp {

    public void send(String from, String to, String subject, String text) {
        //do some work
    }
}

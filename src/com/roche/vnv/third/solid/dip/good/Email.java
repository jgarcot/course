/**
 * should be move to package model as its an entity of our domain
 */
package com.roche.vnv.third.solid.dip.good;


public class Email {

    /**
     * Makes sense to declare it as static attributes? - We won't be able to reuse it as i.e: FROM will be always the same address
     */
//    private static final String FROM = "hello@";
//    private static final String TO = "gift@";
//    private static final String SUBJECT = "subject";
//    private final MailChimp mailChimp;

    private final String from;
    private final String to;
    private final String subject;
    private final String text;

    public Email(String from, String to, String subject, String text) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
    }



    /**
     * Why email is responsible of sending an email? Not accomplishing Single Responsibility Principle as well!
     */
//    public void sendTo(String text) {
//        //do the work
//        mailChimp.sendTo(FROM, TO, SUBJECT, text);
//    }
}



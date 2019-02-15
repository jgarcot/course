package com.roche.vnv.third.solid.dip.good;

public class EmailNotifier implements DeploymentNotifier {

    private final MailChimp mailChimp;

    public EmailNotifier(MailChimp mailChimp) {
        this.mailChimp = mailChimp;
    }

    @Override
    public void sendTo(boolean deployed, String... params) { //equal to String[] params

        /**
         * final Email email = EmailBuilder.anEmail().withFrom("").withTo("").create(); --> Example of Builder pattern. We will see it!
         */
        /**
         * Ideally we should load from, to and subject from other entity (ie: User), or a config file ...
         */
        Email email = new Email("", "", "", params[0]);
        if (deployed) {
            mailChimp.send(email);
        }
    }
}


package com.roche.vnv.third.solid.dip.bad;

import java.util.Random;

public class DeploymentTracker {

    private final Email email;
    private final Phone phone;

    public DeploymentTracker(Email email, Phone phone) {
        this.email = email;
        this.phone = phone;
    }

    public void deploy(String buildNumber) {

        boolean deployed;

        /**
         * Perform some magic with the build ie: download it, install it...
         */

        deployed = new Random().nextBoolean(); //Generates random boolean

        /**
         * This high level module should describe the "general" behavior (aka the business logic)
         * The low level modules should be written in a way to apply those concrete details (if - else) according an abstraction
         * @see <a href="https://dzone.com/articles/adapter-design-pattern-in-java"></a>
         */
        if (deployed) {
            email.sendTo("Congrats! The build " + buildNumber + "has been succesfully deployed. RIP");
        } else {
            phone.sendTo("Upppps! The build " + buildNumber + "has not been sucessfully deployed. Fix it ASAP");
        }
    }
}

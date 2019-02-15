package com.roche.vnv.third.solid.dip.good;

import java.util.List;
import java.util.Random;

public class DeploymentTracker {

    private final List<DeploymentNotifier> deploymentNotifiers;

    public DeploymentTracker(List<DeploymentNotifier> deploymentNotifiers) {
        this.deploymentNotifiers = deploymentNotifiers;
    }

    public void deploy(String buildNumber) {

        boolean deployed;

        /**
         * Perform some magic with the build ie: download it
         */

        deployed = new Random().nextBoolean();

        /**
         * Imperative style
         *
         * for(int i = 0; i < deploymentNotifiers.size(); i++) {
         *      deploymentNotifiers.get(i).sendTo(deployed, buildNumber);
         * }
         *
         */

        /**
            Functional style
         */

        deploymentNotifiers.forEach(deploymentNotifier -> deploymentNotifier.sendTo(deployed, buildNumber));

    }
}

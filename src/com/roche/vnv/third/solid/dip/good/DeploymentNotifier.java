package com.roche.vnv.third.solid.dip.good;

/**
 * Abstraction where specific classes apply concrete details
 */
public interface DeploymentNotifier {

    void sendTo(boolean status, String... params);
}

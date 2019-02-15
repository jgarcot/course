package com.roche.vnv.cocktail;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldEndpointTest {

    private HelloWorldEndpoint helloWorldEndpoint;

    @Before
    public void setUp() {
        /**
         * Generates a clean instance for each @Test we will have
         */
        this.helloWorldEndpoint = new HelloWorldEndpoint();
    }

    @Test
    public void shouldSayHelloWhenUserName() { //Give a proper test name - it should be used for project's documentation
//        assertEquals("Javi", helloWorldEndpoint.sayHello("Javi")); //based on JUnit assertEquals
        /**
         * both provide the same output, I mean, test PASSED or FAILED
         */
        assertThat(helloWorldEndpoint.sayHello("Javi")).isEqualTo("Javi"); //based on assertJ
    }
}

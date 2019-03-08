package com.roche.vnv.cocktail;

import com.roche.vnv.cocktail.domain.model.User;
import com.roche.vnv.cocktail.jpa.UserJpaRepository;
import com.roche.vnv.cocktail.rest.controller.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class HelloWorldControllerTest {

    private HelloWorldController helloWorldController;

    @Mock
    private UserJpaRepository userJpaRepository;

    @Before
    public void setUp() {
        /**
         * Generates a clean instance for each @Test we will have
         */
        MockitoAnnotations.initMocks(this);
        this.helloWorldController = new HelloWorldController(userJpaRepository);
    }

    @Test
    /**
     * public void shouldGiveAMessageWhenUserIsUnknown() {}
     */
    public void should_give_a_message_when_user_is_unknown() {
        /**
         * Follow A-A-A (Arrange-Act-Assert)
         */
        final String name = "a-not-existing-name";
        final User unknownUser = new User(-1, name, "Who are you? " + name);

        when(userJpaRepository.findByName(anyString())).thenReturn(Optional.empty()); //TODO: Discuss anyString() - Why should we avoid anyBlaBla() methods?

        final User actualUser = helloWorldController.sayHello(name);

        assertThat(actualUser).isEqualTo(unknownUser);
    }

    @Test
//    public void should() { //Give a proper test name - it should be used for project's documentation
    public void should_give_full_user_info() {
        final String name = "Javi";
        final User expectedUser = new User(0, name, "Welcome back!");

        when(userJpaRepository.findByName(name)).thenReturn(Optional.of(expectedUser));

        /**
         * assert jUnit approach
         * assertEquals("Javi", helloWorldController.sayHello("Javi"));
         *
         * both provide the same output, I mean, test PASSED or FAILED
         */
        assertThat(helloWorldController.sayHello(name)).isEqualTo(expectedUser); //based on assertJ
    }
}

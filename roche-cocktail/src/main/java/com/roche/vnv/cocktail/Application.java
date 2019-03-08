package com.roche.vnv.cocktail;

import com.roche.vnv.cocktail.domain.model.User;
import com.roche.vnv.cocktail.jpa.UserJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);
    private static final String WELCOME_MESSAGE = "Welcome back!";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Performs data loading while startup
     *
     * @param userRepository a central location in which user data is stored and managed
     * @return status of current loading
     */
    @Bean
    public CommandLineRunner insertUsers(final UserJpaRepository userRepository) {
        return args -> {
            // save demo users
            userRepository.save(new User(0, "Bauer", WELCOME_MESSAGE));
            userRepository.save(new User(1, "O'Brian", WELCOME_MESSAGE));
            userRepository.save(new User(2, "Javi", WELCOME_MESSAGE));
            userRepository.save(new User(3, "Palmer", WELCOME_MESSAGE));
            userRepository.save(new User(4, "Dessler", WELCOME_MESSAGE));

            // fetch all users
            LOG.info("Users found with findAll(): ");
            LOG.info("-------------------------------");
            userRepository.findAll().forEach(user -> LOG.info(user.toString()));
        };
    }

}

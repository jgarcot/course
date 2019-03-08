package com.roche.vnv.cocktail.rest.controller;

import com.roche.vnv.cocktail.domain.model.User;
import com.roche.vnv.cocktail.jpa.UserJpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {  //TODO: Discuss class naming - is this correct?

    private final AtomicLong counter;
    private final UserJpaRepository userJpaRepository;

    public HelloWorldController(UserJpaRepository userJpaRepository) {
        counter = new AtomicLong();
        this.userJpaRepository = userJpaRepository;
    }


    @GetMapping("/hello")
    public User sayHello(@RequestParam(value="name"/*, defaultValue = "Javi"*/) String name) { //We don't need default values to retrieve user info
        Optional<User> foundUser = userJpaRepository.findByName(name);

        return foundUser
                .map(user -> new User(user.getId(), user.getName(), "Welcome back!"))
                .orElse(new User(counter.decrementAndGet(), name, "Who are you? " + name));
    }
}

package com.roche.vnv.cocktail.jpa;

import com.roche.vnv.cocktail.domain.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends CrudRepository<User, Long> {
/**
 * Spring Boot offers a fully functional CRUD repository with findOne(..), findBy..(..) save(..), update(..) and delete(..) methods.
 */

    Optional<User> findByName(String name); //TODO: Why am I returning Optional<User> instead of User?
}

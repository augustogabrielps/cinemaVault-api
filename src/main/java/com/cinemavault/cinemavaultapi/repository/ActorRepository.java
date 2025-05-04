package com.cinemavault.cinemavaultapi.repository;

import com.cinemavault.cinemavaultapi.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findByFirstName(String firstName);
    List<Actor> findByFirstNameAndLastName(String firstName, String lastName);
    List<Actor> findByFirstNameContainingIgnoreCase(String firstName);

}

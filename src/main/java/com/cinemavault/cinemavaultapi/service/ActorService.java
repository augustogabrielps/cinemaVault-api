package com.cinemavault.cinemavaultapi.service;

import com.cinemavault.cinemavaultapi.model.Actor;
import com.cinemavault.cinemavaultapi.repository.ActorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActorService {

   private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public Page<Actor> getAllActors(Pageable pageable) {
        return actorRepository.findAll(pageable);
    }

    public Actor getActorsById(Long id) {
        return actorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Actor not found with ID: " + id));
    }

    public List<Actor> getActorByFirstName(String firstName){
        return actorRepository.findByFirstName(firstName);
    }

    public List<Actor> getActorByFirstAndLastNames(String firstName, String lastName){
        return actorRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public List<Actor> findByFirstNameContainingIgnoreCase(String firstName){
        return actorRepository.findByFirstNameContainingIgnoreCase(firstName);
    }


}

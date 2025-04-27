package com.cinemavault.cinemavaultapi.service;

import com.cinemavault.cinemavaultapi.model.Actor;
import com.cinemavault.cinemavaultapi.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

   private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
}

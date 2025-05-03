package com.cinemavault.cinemavaultapi.controller;

import com.cinemavault.cinemavaultapi.model.Actor;
import com.cinemavault.cinemavaultapi.service.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ActorController {

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/actors")
    public List<Actor> getAllActors() {

        return actorService.getAllActors();
    }

    @GetMapping("/actors/{id}")
    public Actor getActorsById(@PathVariable Long id) {
        return actorService.getActorsById(id);
    }

    @GetMapping("/actors/search")
        public List<Actor> getActorByFirstName(@RequestParam String firstName) {
            return actorService.getActorByFirstName(firstName);
        }
    }


package com.cinemavault.cinemavaultapi.controller;

import com.cinemavault.cinemavaultapi.model.Actor;
import com.cinemavault.cinemavaultapi.service.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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

    @GetMapping("/actors/search/fullname")
    public List<Actor> getActorByFirstAndLastNames(
            @RequestParam String firstName,
            @RequestParam String lastName
    ) {
        var result = actorService.getActorByFirstAndLastNames(firstName, lastName);
        if (result.isEmpty()) {
            System.out.println("Name was not found");
        }
        return result;
    }

    @GetMapping("/actors/search/firstname")
    public List<Actor> getActorsByFirstNameContaining(
            @RequestParam String firstName
    ) {
        var result = actorService.findByFirstNameContainingIgnoreCase(firstName);
        return result;
    }
}

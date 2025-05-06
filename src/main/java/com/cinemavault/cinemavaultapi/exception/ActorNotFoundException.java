package com.cinemavault.cinemavaultapi.exception;

public class ActorNotFoundException extends RuntimeException {

    public ActorNotFoundException(Long id){
        super("Actor not found with ID: " + id);
    }
}

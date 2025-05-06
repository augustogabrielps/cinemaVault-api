package com.cinemavault.cinemavaultapi.exception.handler;

import com.cinemavault.cinemavaultapi.exception.ActorNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//This class will catch and handle exceptions thrown by any controller in the whole application
@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> handleActorNotFound(ActorNotFoundException ex){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }
}

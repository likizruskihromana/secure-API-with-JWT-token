package com.tarik.security.handler;

import com.tarik.security.exceptions.ObjectNotValidException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> handleException(IllegalStateException exception){
        return ResponseEntity
                .badRequest()
                .body(exception.getMessage());
    }
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleException(){
        return ResponseEntity
                .notFound()
                .build();
    }
    @ExceptionHandler(ObjectNotValidException.class)
    public ResponseEntity<?> handleException(ObjectNotValidException exception){
        return ResponseEntity
                .badRequest()
                .body(exception.getMessage());
    }
    /*
    * Add more exceptions for handlers
    * */
}

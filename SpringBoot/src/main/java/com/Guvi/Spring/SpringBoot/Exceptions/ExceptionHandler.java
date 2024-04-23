package com.Guvi.Spring.SpringBoot.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

// Do Not Undestand it but copied it so i can understand it later.

@ControllerAdvice
public class ExceptionHandler {
 public ResponseEntity<Object> handleException(ProductNotFound exception){
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
         body(exception.getMessage());
 }
}

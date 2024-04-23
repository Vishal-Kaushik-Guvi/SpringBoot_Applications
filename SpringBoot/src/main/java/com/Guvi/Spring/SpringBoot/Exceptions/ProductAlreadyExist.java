package com.Guvi.Spring.SpringBoot.Exceptions;

public class ProductAlreadyExist extends RuntimeException {
    
    ProductAlreadyExist(String message){
        super(message);
    }
}

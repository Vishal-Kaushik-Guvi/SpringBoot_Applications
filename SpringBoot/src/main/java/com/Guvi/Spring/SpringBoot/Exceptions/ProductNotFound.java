package com.Guvi.Spring.SpringBoot.Exceptions;

public class ProductNotFound extends RuntimeException {

	public ProductNotFound(String message) {
		super(message);
	}
   
}

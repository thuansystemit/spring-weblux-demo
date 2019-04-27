package com.pvthuan.exceptions;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(final String message) {
        super(String.format("product[%s].notFound", message));
    }

}
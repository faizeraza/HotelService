package com.microservices.hotel.exception;

public class NoRecordFoundException extends Exception {

    public NoRecordFoundException() {
        super("No Record Found");
    }

    public NoRecordFoundException(String message) {
        super(message);
    }

}
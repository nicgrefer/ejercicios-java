package com.exceptions;

public class PasswordLengthException extends Exception {
    public PasswordLengthException(String message) {
        super(message);
    }
}
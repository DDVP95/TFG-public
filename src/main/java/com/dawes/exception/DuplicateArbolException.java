package com.dawes.exception;

public class DuplicateArbolException extends RuntimeException {

    public DuplicateArbolException() {
        super();
    }

    public DuplicateArbolException(String message) {
        super(message);
    }

    public DuplicateArbolException(String message, Throwable cause) {
        super(message, cause);
    }
}

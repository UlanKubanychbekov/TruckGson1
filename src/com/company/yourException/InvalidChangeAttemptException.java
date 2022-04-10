package com.company.yourException;

public class InvalidChangeAttemptException extends RuntimeException{
    public InvalidChangeAttemptException() {
    }

    public InvalidChangeAttemptException(Throwable cause) {
        super(cause);
    }
}

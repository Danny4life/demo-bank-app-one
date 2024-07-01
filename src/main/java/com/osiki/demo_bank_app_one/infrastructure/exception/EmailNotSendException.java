package com.osiki.demo_bank_app_one.infrastructure.exception;

public class EmailNotSendException extends RuntimeException{
    public EmailNotSendException(String message) {
        super(message);
    }
}

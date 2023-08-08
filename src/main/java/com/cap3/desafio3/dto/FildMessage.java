package com.cap3.desafio3.dto;

public class FildMessage {
    private String fieldName;
    private String message;

    public FildMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}

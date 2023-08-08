package com.cap3.desafio3.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{

    private List<FildMessage> errors = new ArrayList<>();
    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FildMessage> getErrors() {
        return errors;
    }
    public void addMsgError(String fildName, String message){
        errors.add(new FildMessage(fildName, message));
    }
}




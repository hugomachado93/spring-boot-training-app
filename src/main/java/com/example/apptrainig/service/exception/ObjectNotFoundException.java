package com.example.apptrainig.service.exception;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String s, String msg){
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }

;

}

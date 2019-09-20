package com.pgadmin4.demo.postgresqlsemo.user;

public class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);
    }

    public CustomException(String message, Throwable clause){
        super(message, clause);
    }
}

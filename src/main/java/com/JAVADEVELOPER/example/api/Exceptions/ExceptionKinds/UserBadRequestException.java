package com.JAVADEVELOPER.example.api.Exceptions.ExceptionKinds;

public class UserBadRequestException extends RuntimeException{
    public UserBadRequestException(String message){ super(message); }
}
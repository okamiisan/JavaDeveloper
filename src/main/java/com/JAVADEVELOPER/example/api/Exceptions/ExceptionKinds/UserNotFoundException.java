package com.JAVADEVELOPER.example.api.Exceptions.ExceptionKinds;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){ super(message); }
}
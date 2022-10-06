package com.stechlabs.BankRestAPIs.models;

public class Error {

    private String message;

    public Error(String msg){
        message=msg;
    }

    public String getErrorMessage(){
        return message;
    }
}

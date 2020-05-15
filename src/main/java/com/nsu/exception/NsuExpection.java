package com.nsu.exception;

public class NsuExpection extends RuntimeException{

    private String e;

    public NsuExpection(String e){
        this.e=e;
    }

    public String gerMessage(){
        return e;
    }




}

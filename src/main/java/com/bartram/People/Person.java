package com.bartram.People;

public abstract class Person {
//    can make person class abstract as not instance of this class is needed
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}



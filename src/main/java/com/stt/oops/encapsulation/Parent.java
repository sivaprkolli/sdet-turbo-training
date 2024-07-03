package com.stt.oops.encapsulation;

public class Parent {

    private int  id = 50;
    private String name = "Siva";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getData(){
        System.out.println(id);
        System.out.println(name);
    }

}

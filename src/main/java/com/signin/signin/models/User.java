package com.signin.signin.models;

public class User {
    private String name;
    private String passwd;
    private int num;

    private int id;

    public User(String name, String passwd, int num){
        this.name = name;
        this.passwd = passwd;
        this.num = num;
    }

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
}

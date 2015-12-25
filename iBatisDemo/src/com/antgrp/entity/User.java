package com.antgrp.entity;

import java.sql.Date;

public class User {
    private int id;
    private String name;
    private Date birth;
    private float score;
    private String email;
    
    public User(){}
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    public void setEmail(String email){
    	this.email = email;
    }
    public String getEmail(){
    	return email;
    }
    @Override
    public String toString(){
        return "id="+id+", name="+name+", birth="+birth+", score="+score+", email="+email+"\n";
    }
    
}
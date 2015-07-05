package com.intropro.blablacar;

import java.util.Date;

public class Comment {

    private Profile owner;
    private String body;
    private Date date;


    public Profile getOwner() {
        return owner;
    }

    public void setOwner(Profile owner) {
        this.owner = owner;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void createComment(){

    }

    public void viewListOfComments(){

    }


}

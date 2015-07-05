package com.intropro.blablacar;

import java.util.Date;

public class Message {

    private Profile from;
    private Profile to;
    private Date date;
    private String body;

    public Profile getFrom() {
        return from;
    }

    public void setFrom(Profile from) {
        this.from = from;
    }

    public Profile getTo() {
        return to;
    }

    public void setTo(Profile to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void sendMessage() {

    }

    public void notyfyRecivier() {

    }
}

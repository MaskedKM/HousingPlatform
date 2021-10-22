package com.football.housingplatform.dao.domain;

import java.sql.Date;

public class Content {
    private int id;
    private String message;
    private Date time;
    private int vote;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public Content(int id, String message, Date date, int vote) {
        this.id = id;
        this.message = message;
        this. time = date;
        this.vote = vote;
    }

    public Content()
    {

    }

    @Override
    public String toString() {
        return "Content{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", time=" + time +
                ", vote=" + vote +
                '}';
    }
}

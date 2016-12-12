package com.ibook.app.adapter.item;

/**
 * Created by Monarchy on 12/12/2016.
 */

public class Questions {
    private String id;
    private String question;
    private String elapsedTime;
    private int votes;
    private User user;


    public Questions(String id, String question, String elapsedTime, int votes, User user) {
        this.id = id;
        this.question = question;
        this.elapsedTime = elapsedTime;
        this.votes = votes;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

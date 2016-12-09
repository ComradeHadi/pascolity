package com.ibook.app.adapter.item;

/**
 * Created by Monarchy on 08/12/2016.
 */

public class Book {
    private String id;
    private String title;
    private String caption;
    private String cover;
    private String datePublished;
    private User owner;

    public Book(String id, String title, String caption, String cover, String datePublished, User owner) {
        this.id = id;
        this.title = title;
        this.caption = caption;
        this.cover = cover;
        this.datePublished = datePublished;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}

package com.ibook.app.adapter.item;

/**
 * Created by Monarchy on 08/12/2016.
 */

public class User {
    private String id;
    private String name;
    private String company;
    private String profile;

    public User(String id, String name, String company, String profile) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

package com.ibook.app.adapter.item;

/**
 * Created by Monarchy on 08/12/2016.
 */

public class ExamsYear {
    private String id;
    private String year;
    private String typeOfExams;

    public ExamsYear(String id, String year, String typeOfExams) {
        this.id = id;
        this.year = year;
        this.typeOfExams = typeOfExams;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTypeOfExams() {
        return typeOfExams;
    }

    public void setTypeOfExams(String typeOfExams) {
        this.typeOfExams = typeOfExams;
    }
}

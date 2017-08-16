package com.mw.model;


import java.util.Date;

public class QuestionEntity {
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private String keyword;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    private String date;
}

package com.example.richardsondeleon.quizlet;

public class Subjects {
    private String title;
    private String info;


    Subjects(String title, String info) {
        this.title = title;
        this.info = info;
    }


    public  String getTitle() {
        return title;
    }

    public  String getInfo() {
        return info;
    }
}


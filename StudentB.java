package com.example.main;

public class StudentB extends Student {

    public StudentB(String fullname, int scoreActivities, int scoreQuizes, int scoreExams) {
        super(fullname,scoreActivities,scoreQuizes,scoreExams);
        this.scoreActivities = scoreActivities;
        this.scoreQuizes = scoreQuizes;
        this.scoreExams = scoreExams;
    }

}


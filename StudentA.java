package com.example.main;

public class StudentA extends Student{

    public StudentA(String fullname, int scoreActivities, int scoreQuizes, int scoreExams) {
        super(fullname,scoreActivities,scoreQuizes,scoreExams);
        this.scoreActivities = scoreActivities;
        this.scoreQuizes = scoreQuizes;
        this.scoreExams = scoreExams;
    }

    @Override
    public int average (){return (this.scoreActivities + this.scoreQuizes + this.scoreExams)/3;
    }
}
}

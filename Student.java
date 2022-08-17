package com.example.main;

public class Student {

    String fullName;
    String email;
    int phoneNumber;
    String nick;
    char [] type = {'a', 'b'};
    int scoreExams;
    int scoreQuizes;
    int scoreActivities;
    int scoreP1;
    int scoreP2;
    int scoreP3;

    public Student(String fullName, String email, int phoneNumber, String nick, char[] type, int scoreExams, int scoreQuizes, int scoreActivities, int scoreP1, int scoreP2, int scoreP3) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nick = nick;
        this.type = type;
        this.scoreExams = scoreExams;
        this.scoreQuizes = scoreQuizes;
        this.scoreActivities = scoreActivities;
        this.scoreP1 = scoreP1;
        this.scoreP2 = scoreP2;
        this.scoreP3 = scoreP3;


    }
    public void call(){
        System.out.println("Hola" + this.fullName);
    }
}

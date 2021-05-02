package com.company;

public class Course {
    int id;
    String courseName;
    String instructor;
    Category category;

    public Course(){

    }

    public Course(int id,String courseName,String instructor,Category category){
        this.id=id;
        this.courseName=courseName;
        this.instructor=instructor;
        this.category=category;
    }

}

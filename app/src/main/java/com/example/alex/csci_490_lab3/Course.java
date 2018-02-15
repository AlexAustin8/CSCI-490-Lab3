package com.example.alex.csci_490_lab3;

/**
 * Created by alex on 2/15/18.
 */

public class Course {
    private String name;
    private String number;
    private String professor;

    public String getCourseName(){
        return name;
    }

    public void setCourseName(String newName){
        name = newName;
    }

    public String getCourseNumber(){
        return number;
    }

    public void setCourseNumber(String newNumber){
        number = newNumber;
    }

    public String getCourseProfessor(){
        return professor;
    }

    public void setCourseProfessor(String newProfessor){
        number = newProfessor;
    }
}
}

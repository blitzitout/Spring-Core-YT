package com.practice.dil;

public class Student {
    private String studentName;
    private int id;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }

    public void displayStudentInfo(){
        System.out.println("Student name: " + studentName + "\nStudent ID: " + id);
    }
}

package com.example;

import com.example.enums.Grade;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> marks1 = new ArrayList<>();
        marks1.add(20);
        marks1.add(75);
        marks1.add(85);
          Student student = new Student("John", 1,marks1 );
       fetchGrade(student);
        List<Integer> marks2 = new ArrayList<>();
        marks2.add(75);
        marks2.add(96);
        marks2.add(92);
        Student student1 = new Student("Bill", 2,marks2 );

        fetchGrade(student1);
        List<Integer> marks3 = new ArrayList<>();
        marks3.add(40);
        marks3.add(89);
        marks3.add(65);
        Student student3 = new Student("Kreg", 3,marks3 );

        fetchGrade(student3);
        List<Integer> marks4 = new ArrayList<>();
        marks4.add(50);
        marks4.add(96);
        marks4.add(77);
        Student student4 = new Student("Tom", 4,marks4 );

        fetchGrade(student4);

        List<Integer> marks5 = new ArrayList<>();
        marks5.add(78);
        marks5.add(50);
        marks5.add(93);
        Student student5 = new Student("Jim", 5,marks5 );

        fetchGrade(student5);
    }

    private static void fetchGrade(Student student) {
       double average = GradeCalculator.calculateAverage(student.getMarks());
     Grade grade =GradeCalculator.calculateGrade(average);
     System.out.printf(" student %s (roll %s): average (%s) -> grade=%s%n", student.getName(), student.getRollNo(), average,grade);
    }
}
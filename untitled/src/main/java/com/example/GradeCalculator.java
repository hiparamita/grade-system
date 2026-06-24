package com.example;

import com.example.enums.Grade;

import java.util.List;

public  class GradeCalculator {
    public static double calculateAverage(List<Integer> marks) {
        if(marks == null || marks.isEmpty()){
            throw new IllegalArgumentException("Marks list cannot be null or empty");

        }
        double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0);
        return average;
    }
    public static Grade calculateGradeFromAverage(int average){
       if(average >= 90){
           return Grade.A;
       }
        if(average >= 80) return Grade.B;
        if(average >=70) return Grade.C;
        else{
            return Grade.F;
        }
    }
    public static Grade calculateGrade(double average) {
      int avg = (int)Math.round(average);
       return calculateGradeFromAverage(avg);

    }
}
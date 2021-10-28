package com.cw6;

public class Student2 {
    String name;
    double avgGrade;

    public Student2(String name, double avgGrade) {
        this.name = name;
        this.avgGrade = avgGrade;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

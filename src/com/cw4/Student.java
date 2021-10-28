package com.cw4;

public class Student<T extends Comparable<T>> implements Comparable<Student<T>> {
    protected String nazwisko;
    protected T grupa;

    public Student(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setGrupa(T grupa) {
        this.grupa = grupa;
    }

    public Student ustalGrupe(T grupa){
        setGrupa(grupa);
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nazwisko='" + nazwisko + '\'' +
                ", grupa='" + grupa + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student<T> o) {
        return this.grupa.compareTo(o.grupa)*-1;
    }
}

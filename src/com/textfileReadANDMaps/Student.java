package com.textfileReadANDMaps;

public class Student<T extends Comparable<T>> implements Comparable<Student<T>> {
    protected String surname;
    protected T group;

    public Student(String surname) {
        this.surname = surname;
    }

    public void setGroup(T group) {
        this.group = group;
    }

    @SuppressWarnings("rawtypes")
    public Student determineGroup(T group){
        setGroup(group);
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student<T> o) {//ORDER BY group DESC
        return this.group.compareTo(o.group)*-1;
    }
}

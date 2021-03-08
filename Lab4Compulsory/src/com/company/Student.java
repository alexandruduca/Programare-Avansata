package com.company;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    List<Student> studentList = new ArrayList<>();
    Map<Student, School> cost = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }


    public void sortList() {
        Collections.sort(studentList);
    }

    public Map<Student, School> getCost() {
        return cost;
    }

    public void setCost(Map<Student, School> cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}

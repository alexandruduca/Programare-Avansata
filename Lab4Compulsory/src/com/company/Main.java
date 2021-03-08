package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        Student s0 = new Student("S0");
        Student s1 = new Student("S1");
        Student s2 = new Student("S2");
        Student s3 = new Student("S3");
//        var students = IntStream.rangeClosed(0,3)
//                .mapToObj(i -> new Student("S" + i))
//                .toArray(Student[]::new);
        stud.add(s0);
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);

        s0.setStudentList(stud);
        System.out.println(s0.getStudentList());

        School h0 = new School("H0");
        School h1 = new School("H1");
        School h2 = new School("H2");
        TreeSet<String> tree = new TreeSet<>();
        h0.setCapacity(1);
        h1.setCapacity(2);
        h2.setCapacity(2);
        tree.add(h0.getName());
        tree.add(h1.getName());
        tree.add(h2.getName());
        h0.setTreeSet(tree);
        System.out.println(h0.getTreeSet());




    }
}

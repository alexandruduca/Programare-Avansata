package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class School implements Comparable<School> {
    private String name;
    private int capacity;
    TreeSet<String> schoolList = new TreeSet<String>();
    Map<School, Student> cost = new HashMap<>();

    public School(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTreeSet(TreeSet<String> treeSet) {
        this.schoolList = treeSet;
    }

    public TreeSet<String> getTreeSet() {
        return schoolList;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


    public Map<School, Student> getCost() {
        return cost;
    }

    public void setCost(Map<School, Student> cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(School o) {
        return this.getName().compareTo(o.getName());
    }
}

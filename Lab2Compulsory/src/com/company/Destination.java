package com.company;

public class Destination {
    private String name;
    private int capacity;

    Destination() {
        name = null;
        capacity = 0;
    }

    Destination(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

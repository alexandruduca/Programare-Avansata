package com.company;

public class Source {
    private String name;
    private String type;
    private int capacity;

    Source() {
        name = null;
        type = null;
        capacity = 0;
    }

    Source(String name, String type, int capacity) {
        setName(name);
        setType(type);
        setCapacity(capacity);
    }

    public enum SourceType {
        WAREHOUSE, FACTORY;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        int ok = 0;
        for (SourceType s : SourceType.values()) {
            if (s.name().equals(type) == true) {
                this.type = type;
                ok = 1;
            }
        }
        if (ok == 0)
            System.out.println(getName() + " - Invalid type");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

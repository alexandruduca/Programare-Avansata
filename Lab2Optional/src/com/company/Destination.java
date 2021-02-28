package com.company;

import java.util.Objects;

/**
 * The definition of the abstract class Destination
 */
public class Destination {
    /**
     * The attributes of the class
     */
    private String name;
    private int capacity;

    /**
     * The contructor of the class
     *
     * @param name
     * @param capacity
     */
    public Destination(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Setter for the name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for the capacity
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Getter for the name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the capacity
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return capacity == that.capacity && Objects.equals(name, that.name);
    }

}

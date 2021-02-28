package com.company;

import java.util.Objects;

/**
 * The definition of the abstract class Source
 */
abstract class Source {
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
    public Source(String name, int capacity) {
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
        Source source = (Source) o;
        return capacity == source.capacity && Objects.equals(name, source.name);
    }


}

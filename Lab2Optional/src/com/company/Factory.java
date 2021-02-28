package com.company;

/**
 * The derived class Factory to set the type of the source
 */
public class Factory extends Source {
    /**
     * The attribute of the class
     */
    private String type;

    /**
     * The constructor of the derived class
     *
     * @param name
     * @param capacity
     */
    public Factory(String name, int capacity) {
        super(name, capacity);
        this.type = "FACTORY";
    }
}

package com.company;

/**
 * The derived class Warehouse to set the type of the source
 */
public class Warehouse extends Source {
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
    public Warehouse(String name, int capacity) {
        super(name, capacity);
        this.type = "WAREHOUSE";
    }
}

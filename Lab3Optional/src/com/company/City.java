package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
    private List<Location> nodes = new ArrayList<>();

    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    public List<Location> getNodes() {
        return nodes;
    }

    public void addLocation(Location node) {
        nodes.add(node);
    }

    public void printCosts() {
        for (int i = 0; i < nodes.size(); i++)
            System.out.println(nodes.get(i).getCost());
    }

    @Override
    public String toString() {
        return "City{" +
                "nodes=" + nodes +
                '}';
    }


    public void visitableNotPayable() {
        Collections.sort(nodes);
        for (int i = 0; i < nodes.size(); i++)
            if (nodes.get(i) instanceof Visitable && !(nodes.get(i) instanceof Payable))
                System.out.println(nodes.get(i).getName());
    }
}

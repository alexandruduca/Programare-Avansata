package com.company;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        Class cls = null;
        try {
            cls = Class.forName("com.company.TestAdnotat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        File f = new File("C:\\Users\\Alex\\IdeaProjects\\Lab12\\out\\production\\Lab12\\com\\company");
        URL urls[] = new URL[1];
        urls[0]= f.toURI().toURL();
        ClassLoader cl = new URLClassLoader(urls);
        cl.loadClass("com.company.TestAdnotat");


        for (Method m : cls.getMethods()) {
            System.out.println(m.getName());
        }

    }
}

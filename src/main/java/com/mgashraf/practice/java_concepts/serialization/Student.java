package com.mgashraf.practice.java_concepts.serialization;

import java.io.Serializable;

/**
 * Created by mgash on 11/10/2016.
 */
public class Student implements Serializable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

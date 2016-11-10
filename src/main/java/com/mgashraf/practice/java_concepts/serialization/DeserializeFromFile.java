package com.mgashraf.practice.java_concepts.serialization;

import java.io.*;

/**
 * Created by mgash on 11/10/2016.
 */
public class DeserializeFromFile {

    private static final String filePath = "classpath:student.ser";

    public static void main(String[] args) {

        try (
                InputStream bufferInput = new BufferedInputStream(new FileInputStream(filePath));
                ObjectInput input = new ObjectInputStream(bufferInput)
                ) {
            Student deserializedStudentObj = (Student) input.readObject();
            System.out.println(deserializedStudentObj.getName());
        } catch(IOException | ClassNotFoundException e ) {
            throw new RuntimeException(e);
        }
    }
}

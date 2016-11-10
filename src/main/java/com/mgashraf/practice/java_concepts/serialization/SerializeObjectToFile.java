package com.mgashraf.practice.java_concepts.serialization;

import java.io.*;

/**
 * Created by mgash on 11/10/2016.
 */
public class SerializeObjectToFile {

  private static final String filePath = "classpath:student.ser";

  public static void main(String[] args) {

    try (
            OutputStream buffer = new BufferedOutputStream(new FileOutputStream(filePath));
            ObjectOutput output = new ObjectOutputStream(buffer);
    ) {
      Student student = new Student("Ashraf");
      output.writeObject(student);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}

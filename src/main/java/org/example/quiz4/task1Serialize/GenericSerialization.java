package org.example.quiz4.task1Serialize;

import java.io.*;
import java.util.List;

public class GenericSerialization {
    public static void serialize(List<Person> persons, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(persons);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Person> deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Person>) ois.readObject();
        }
    }
}

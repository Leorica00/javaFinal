package org.example.quiz4.task1Serialize;

import java.io.IOException;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Shalva", "Lomtadze", 21, List.of("Task1", "Task2")),
                new Person("Shavleg", "Lomtayani", 20, List.of("Task3", "Task4")),
                new Person("Shakiki", "Lomkiki", 23, List.of("Task7", "Task9"))
        );

        try {
            GenericSerialization.serialize(persons, "persons.ser");
            System.out.println("Serialization was successful.");
        } catch (IOException e) {
            System.err.println("Error occured during serialization: " + e.getMessage());
        }

        try {
            List<Person> deserializedPersons = GenericSerialization.deserialize("persons.ser");
            for (Person person : deserializedPersons) {
                System.out.println("Name: " + person.name() + " " + person.lastName());
                System.out.println("Age: " + person.age());
                System.out.println("Tasks: " + person.tasks());
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}

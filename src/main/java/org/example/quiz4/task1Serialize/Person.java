package org.example.quiz4.task1Serialize;

import java.io.Serializable;
import java.util.List;

public record Person(
        String name,
        String lastName,
        int age,
        List<String> tasks
) implements Serializable { }

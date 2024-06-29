package org.example.quiz3.task2hashmap;

import java.util.*;

public class StudentsDatabase {
    private HashMap<String, Student> studentMap;

    public StudentsDatabase() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String id, Student student) {
        studentMap.put(id, student);
    }

    public Student getStudent(String id) {
        return studentMap.get(id);
    }

    public Student removeStudent(String id) {
        return studentMap.remove(id);
    }

    public LinkedList<Student> getTopThreeStudents() {
        List<Student> students = new ArrayList<>(studentMap.values());
        Collections.sort(students);
        return new LinkedList<>(students.subList(0, Math.min(3, students.size())));
    }

}

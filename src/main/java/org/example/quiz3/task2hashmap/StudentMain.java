package org.example.quiz3.task2hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentMain {
    public static void main(String[] args) {
        StudentsDatabase studentDatabase = new StudentsDatabase();

        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(70);
        grades1.add(80);
        grades1.add(65);
        grades1.add(74);


        ArrayList<Integer> grades2 = new ArrayList<>();
        grades2.add(81);
        grades2.add(93);
        grades2.add(80);
        grades2.add(85);

        ArrayList<Integer> grades3 = new ArrayList<>();
        grades3.add(100);
        grades3.add(89);
        grades3.add(99);
        grades3.add(97);

        ArrayList<Integer> grades4 = new ArrayList<>();
        grades4.add(99);
        grades4.add(100);
        grades4.add(88);
        grades4.add(92);


        Student student1 = new Student("Nick", "Computer Science", "CS104", grades1);
        Student student2 = new Student("Jeremy", "Mathematics", "MATH207", grades2);
        Student student3 = new Student("Anna", "Physics", "PHY302", grades3);
        Student student4 = new Student("Mary", "Chemistry", "CHEM403", grades4);

        studentDatabase.addStudent("S001", student1);
        studentDatabase.addStudent("S002", student2);
        studentDatabase.addStudent("S003", student3);
        studentDatabase.addStudent("S004", student4);

        System.out.println(studentDatabase.getStudent("S002"));

        LinkedList<Student> topStudents = studentDatabase.getTopThreeStudents();
        System.out.println("Top 3 Students:");
        for (Student student : topStudents) {
            System.out.println(student.getName() + ": " + student.calculateAverageGrade());

        }

        studentDatabase.removeStudent("S003");
    }
}

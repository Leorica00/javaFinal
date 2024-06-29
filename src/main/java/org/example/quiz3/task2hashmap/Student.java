package org.example.quiz3.task2hashmap;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String group;
    private final ArrayList<Integer> grades;

    public Student(String name, String surname, String group, ArrayList<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "name - " + name + "\nsurname - " + surname + "\ngroup - " + group + "\naverage Grade - " + calculateAverageGrade();
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.size() > 0 ? (double) sum / grades.size() : 0.0;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.calculateAverageGrade(), other.calculateAverageGrade());
    }
}

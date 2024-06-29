package org.example.quiz5;

import org.example.Student;
import org.example.StudentDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:h2:./studentsDB";

        try (Connection connection = DriverManager.getConnection(jdbcUrl)) {
            StudentDAO studentDAO = new StudentDAO(connection);

            Student student1 = new Student();
            student1.setName("Shako");
            student1.setAge(21);

            Student student2 = new Student();
            student2.setName("Nika");
            student2.setAge(24);

            studentDAO.insertStudent(student1);
            studentDAO.insertStudent(student2);

            System.out.println("All Students:");
            List<Student> allStudents = studentDAO.getAllStudents();
            for (Student student : allStudents) {
                System.out.println(
                        "ID: " + student.getId() +
                        ", Name: " + student.getName() +
                        ", Age: " + student.getAge()
                );
            }

            int studentIdToRetrieve = 2;
            Student retrievedStudent = studentDAO.getStudentById(studentIdToRetrieve);
            if (retrievedStudent != null) {
                System.out.println("\nRetrieved Student:");
                System.out.println(
                        "ID: " + retrievedStudent.getId() +
                        ", Name: " + retrievedStudent.getName() +
                        ", Age: " + retrievedStudent.getAge()
                );
            } else {
                System.out.println("\nStudent not found!");
            }

            Student student5 = new Student(1, "hello", 12);
            studentDAO.updateStudentsById(studentIdToRetrieve,student5);
            Student retrievedStudent2 = studentDAO.getStudentById(studentIdToRetrieve);
            if (retrievedStudent2 != null) {
                System.out.println("\nRetrieved Student:");
                System.out.println(
                                "ID: " + retrievedStudent2.getId() +
                                ", Name: " + retrievedStudent2.getName() +
                                ", Age: " + retrievedStudent2.getAge()
                );
            } else {
                System.out.println("\nStudent not found!");
            }

            studentDAO.deleteStudentById(studentIdToRetrieve);
            Student retrievedStudent3 = studentDAO.getStudentById(studentIdToRetrieve);
            if (retrievedStudent3 != null) {
                System.out.println("\nRetrieved Student:");
                System.out.println(
                        "ID: " + retrievedStudent3.getId() +
                                ", Name: " + retrievedStudent3.getName() +
                                ", Age: " + retrievedStudent3.getAge()
                );
            } else {
                System.out.println("\nStudent not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

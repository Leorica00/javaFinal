package org.example.quiz5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSetup {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:h2:./studentsDB";
        try (Connection connection = DriverManager.getConnection(jdbcUrl);
             Statement statement = connection.createStatement()) {

            String createDatabase = "CREATE SCHEMA IF NOT EXISTS studentsDB";

            // Execute SQL script to create database
            statement.execute(createDatabase);
            System.out.println("Database studentsDB created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

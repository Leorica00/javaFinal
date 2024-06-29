package org.example.quiz5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabaseTable {
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:h2:./studentsDB;AUTO_SERVER=TRUE";
        Connection connection = DriverManager.getConnection(jdbcURL);
        try (connection) {
            Statement statement = connection.createStatement();

            String createTableSQL = """
                create table if not exists students (
                ID IDENTITY not null primary key,
                name varchar(50),
                age INT
                )
            """;


            statement.executeUpdate(createTableSQL);

            System.out.println("Table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

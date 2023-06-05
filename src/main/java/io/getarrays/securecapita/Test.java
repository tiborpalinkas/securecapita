package io.getarrays.securecapita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/securecapita";
        String username = "root";
        String password = "letmein";

        System.out.println("Connecting database...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (Exception e) {
            e.printStackTrace();
        }


        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}

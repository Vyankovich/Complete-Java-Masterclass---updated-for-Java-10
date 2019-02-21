package com.yankovich;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:E:\\JAVA\\localProjects\\TestDB\\testjava.db");
//             Statement statement = connection.createStatement()) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:E:\\JAVA\\localProjects\\TestDB\\testjava.db");
//            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name text, phone integer, email text)");
//            statement.execute("insert into contacts values ('Joe', 234571, 'joe@mail.com')");
//            statement.execute("insert into contacts values ('Jane', 087211, 'jane@mail.com')");
//            statement.execute("insert into contacts values ('Fido', 3872192, 'dog@mail.com')");

//            statement.execute("update contacts set phone = 342564 where name = 'Tim'");
//            statement.execute("delete from contacts where name = 'Tim'");

            statement.execute("select * from contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();
            
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

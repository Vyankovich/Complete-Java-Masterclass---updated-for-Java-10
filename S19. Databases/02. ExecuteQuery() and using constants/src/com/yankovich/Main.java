package com.yankovich;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:d:\\Java\\LocalProjects\\TestDB\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text " + ")");

            insertContacts(statement, "Tim", 654765, "tim@mail.com");
            insertContacts(statement, "Joe", 45362, "joe@mail.com");
            insertContacts(statement, "Jane", 654765, "jane@mail.com");
            insertContacts(statement, "Fido", 324621, "fid@mail.com");


            statement.execute("update " + TABLE_CONTACTS + " set " +
                    COLUMN_PHONE + " = 555555" +
                    " where " + COLUMN_NAME + " = 'Jane'");

            statement.execute("delete from " + TABLE_CONTACTS +
                    " where " + COLUMN_NAME + " = 'Joe'");


            ResultSet results = statement.executeQuery("select * from " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

            results.close();

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static void insertContacts(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("insert into " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +
                "values ('" + name + "'," + phone + ", '" + email + "')");
    }

}

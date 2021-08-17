package com.hendisantika.adminlte.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {

    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://10.46.37.174;databaseName=TEST";
            String user = "sa";
            String pass = "sa1112";

            Connection connection = DriverManager.getConnection(dbURL, user, pass);

            System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());

            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}

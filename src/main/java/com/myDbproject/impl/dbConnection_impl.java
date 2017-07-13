package com.myDbproject.impl;

import com.myDbproject.inte.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Chaitanya.Alavandi on 12-07-2017.
 */
import java.sql.*;


public class dbConnection_impl implements dbConnection {
    String JDBC_DRIVER;
    String dbURL;
    String userName;
    String passWord;
    Connection connectionObj;

    dbConnection_impl() {
        JDBC_DRIVER = "com.mysql.jdbc.Driver";
        dbURL = "jdbc:mysql://trainingdb.c4hhsbxtkfor.ap-south-1.rds.amazonaws.com:3306/trainingTable";
        userName = "root";
        passWord = "mypassword";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnn() {
        connectionObj = null;
        try {
            connectionObj = DriverManager.getConnection(dbURL, userName, passWord);
        } catch (SQLException se) {
            return null;
        } catch (Exception e) {
            return null;
        }
        return connectionObj;
    }
}


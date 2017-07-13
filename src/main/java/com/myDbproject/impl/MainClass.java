package com.myDbproject.impl;

/**
 * Created by Chaitanya.Alavandi on 12-07-2017.
 */
public class MainClass {

    public static void main(String args[]){
        tableOperations dbOp = new tableOperations();
        String insertQuery;

        String dropQuery="DROP TABLE Chaitanya;";
        dbOp.insert(dropQuery);

        String createQuery;
        createQuery = "CREATE TABLE Chaitanya " +
                "(id INTEGER not NULL, " +
                " name VARCHAR(50), " +
                " PRIMARY KEY ( id ));";
        dbOp.create(createQuery);

        insertQuery = "INSERT INTO Chaitanya " +
                "VALUES (100, 'Chaitanya');";
        dbOp.insert(insertQuery);
        insertQuery = "INSERT INTO Chaitanya " +
                "VALUES (101, 'Samith');";
        dbOp.insert(insertQuery);
        insertQuery = "INSERT INTO Chaitanya " +
                "VALUES (102, 'Shrey');";
        dbOp.insert(insertQuery);
        insertQuery = "INSERT INTO Chaitanya " +
                "VALUES (103, 'Varsha');";
        dbOp.insert(insertQuery);
        try {
            dbOp.selectvalues();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

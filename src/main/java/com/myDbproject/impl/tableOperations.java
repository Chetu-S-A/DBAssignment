package com.myDbproject.impl;

import com.myDbproject.inte.Operations;
import java.sql.*;
/**
 * Created by Chaitanya.Alavandi on 12-07-2017.
 */
public class tableOperations implements Operations {
    dbConnection_impl db;
    Connection connectionObj;
    Statement queryStatement;

    tableOperations(){
        db = new dbConnection_impl();
    }

    public void create(String query){

        connectionObj = db.getConnn();
        if(connectionObj!=null){
            try {
                queryStatement=connectionObj.createStatement();
                queryStatement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                try {
                    connectionObj.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void insert(String query){
        connectionObj = db.getConnn();
        if(connectionObj!=null){
            try {
                queryStatement=connectionObj.createStatement();
                queryStatement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                try {
                    connectionObj.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void delete(String query){
        connectionObj = db.getConnn();
        if(connectionObj!=null){
            try {
                queryStatement=connectionObj.createStatement();
                queryStatement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally{
                try {
                    connectionObj.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void selectvalues() throws ClassNotFoundException {

        connectionObj = db.getConnn();
        if(connectionObj!=null){
            try{
                queryStatement = connectionObj.createStatement();

                String sql = "SELECT * FROM Chaitanya" ;
                ResultSet rs = queryStatement.executeQuery(sql);

                while(rs.next()){
                    //Retrieve by column name
                    int id  = rs.getInt("id");

                    String name = rs.getString("name");


                    //Display values
                    System.out.print("ID: " + id);

                    System.out.print(" Name: " + name);
                    System.out.println();

                }

            }
            catch(SQLException se){

                se.printStackTrace();
            }
            finally{
                try {
                    connectionObj.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}


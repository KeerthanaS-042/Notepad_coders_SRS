package com.example.login;

import java.sql.Driver;
import java.lang.Class;
import java.sql.Connection;
import java.sql.DriverManager;

    public class DatabaseConnection {
        public  Connection databaselink;
        public  Connection getConnection() throws ClassNotFoundException {
            String databaseName="logindb";
            String databaseUser ="root";
            String databasePassword ="arun2005";
            String url= "jdbc:mysql://localhost/logindb" ;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaselink= DriverManager.getConnection(url,databaseUser,databasePassword);
                System.out.println("DB connection success");

            }
            catch (Exception e){
                e.printStackTrace();
            }
            return databaselink;
        }
    }


package com.foodtruck.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String host = "127.0.0.1"; //localhost
    private String dbName = "tpjavafoodtruck";
    private int port = 3306;
    private String URL = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useSSL=false";
    private String username = "root";
    private String password = "root";
    private static Connection connection;

    // Etape 1
    private static Database instance;

    // Etape 2
    private Database(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println(URL);
            System.out.println(username);
            System.out.println(password);

            connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Connexion faite");

        }
        catch (ClassNotFoundException | SQLException ex){
            System.out.println("Probleme connection");
            System.out.println(ex.getMessage());
        }
    }

    // Etape 3
    public static Connection getInstance(){

        if(instance == null)
            instance = new Database();


        return connection;
    }
}

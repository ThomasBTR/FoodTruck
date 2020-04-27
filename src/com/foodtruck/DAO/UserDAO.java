package com.foodtruck.DAO;

import com.foodtruck.config.Database;
import com.foodtruck.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends DAO<User>{
    private Connection connection;

    public UserDAO() {
        this.connection = Database.getInstance();
    }

    @Override
    public boolean create(User obj) {
        boolean result = false;
        try {
            //String query = "delete from employe where id =" + obj.getId();
            String query = "INSERT INTO employe (nom,prenom,email,password,role) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement prepare = connection.prepareStatement(query);

            prepare.setString(1, obj.getNom());
            prepare.setString(2, obj.getPrenom());
            prepare.setString(3, obj.getEmail());
            prepare.setDate(4, new java.sql.Date(obj.getDateDeNaissance().getTime()));
            prepare.setString(5, obj.getAdresse());
            prepare.setString(6, obj.getPassword());
            prepare.setString(6, obj.getEmail());
            prepare.setString(6, obj.getSociete());

            System.out.println(prepare.toString());

            prepare.executeUpdate();

            prepare.close();

            result= true;
        }
        catch (SQLException ex){
            System.out.println("Error SQL " + ex.getMessage());
        }
        finally {
            return result;
        }
    }

    @Override
    public boolean delete(User obj) {
        // TODO
        return false;
    }

    @Override
    public boolean update(User obj) {
        // TODO
        return false;
    }

    @Override
    public User findById(int id) {
        // TODO
        User emp = null;
        return emp;
    }

    @Override
    public List<User> findAll() {
        // TODO
        List<User> lisEmp = new ArrayList<>();
        return lisEmp;
    }
}

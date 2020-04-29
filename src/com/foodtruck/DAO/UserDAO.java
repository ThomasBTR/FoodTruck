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

    public boolean checkId ( int id, String password){
        User user = null;
        boolean response = false;

        try {

            Statement state = connection.createStatement();
            String query = "SELECT * FROM tpjavafoodtruck.utilisateur where id" +id;

            ResultSet result = state.executeQuery(query);

            while(result.next()){
                user = new User(
                        result.getInt("id"),
                        result.getString("nom"),
                        result.getString("prenom"),
                        result.getString("dateDeNaissance"),
                        result.getString("adresse"),
                        result.getString("email"),
                        result.getString("societe"),
                        result.getString("password")
                );

            }

            result.close();
            state.close();
        }
        catch (SQLException ex){
            System.out.println("Error SQL " + ex.getMessage());
        }
        finally {
            if (user.getPassword() == password){
                response = true;
            }
            return response;
        }


    }




///////// OverRide /////////

    @Override
    public boolean create(User obj) {
        boolean result = false;
        try {
            //String query = "delete from employe where id =" + obj.getId();
            String query = "INSERT INTO tpjavafoodtruck.utilisateur (nom,prenom,datedDeNaissance,adresse,password,email, societe) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement prepare = connection.prepareStatement(query);

            prepare.setString(1, obj.getNom());
            prepare.setString(2, obj.getPrenom());
            prepare.setDate(3,  new java.sql.Date(obj.getLongDate(obj.getDateDeNaissanceFrom1970(obj.getDateDeNaissance()))));
            prepare.setString(4, obj.getAdresse());
            prepare.setString(5, obj.getPassword());
            prepare.setString(6, obj.getEmail());
            prepare.setString(7, obj.getEmail());
            prepare.setString(8, obj.getSociete());

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
        User user = null;

        try {

            Statement state = connection.createStatement();
            String query = "SELECT * FROM tpjavafoodtruck.utilisateur where id =" + id;

            ResultSet result = state.executeQuery(query);

            while(result.next()){
                user = new User(
                        result.getInt("id"),
                        result.getString("nom"),
                        result.getString("prenom"),
                        result.getString("dateDeNaissance"),
                        result.getString("adresse"),
                        result.getString("email"),
                        result.getString("societe"),
                        result.getString("password")
                );

            }

            result.close();
            state.close();
        }
        catch (SQLException ex){
            System.out.println("Error SQL " + ex.getMessage());
        }
        finally {
            return user;
        }
        // TODO
        //User user = null ;
        //return user;
    }

    @Override
    public List<User> findAll() {
        // TODO
        List<User> lisEmp = new ArrayList<>();
        return lisEmp;
    }
}

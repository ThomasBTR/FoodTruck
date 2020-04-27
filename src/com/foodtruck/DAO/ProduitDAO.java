package com.foodtruck.DAO;

import com.foodtruck.config.Database;
import com.foodtruck.models.Produit;
import com.foodtruck.models.User;

import java.sql.*;
import java.util.*;

public class ProduitDAO extends DAO<Produit> {
    private Connection connection;
    ArrayList<User> tp = new ArrayList<User>();

    public ProduitDAO() {
        this.connection = Database.getInstance();
    }

    @Override
    public boolean create(Produit obj) {
        boolean result = false;
        return result;
    }

    @Override
    public boolean delete(Produit obj) {
        // TODO
        return false;
    }

    @Override
    public boolean update(Produit obj) {
        // TODO
        return false;
    }

    @Override
    public Produit findById(int id) {
        // TODO
        Produit emp = null;
        return emp;
    }

    public Produit findByName(String name) {
        // TODO
        Produit prod = null;
//
//        try {
//
//            Statement state = connection.createStatement();
//            String query = "SELECT * FROM employe where id =" + id;
//
//            ResultSet result = state.executeQuery(query);
//
//            while(result.next()){
//                prod = new Produit(
//                        result.getInt("id"),
//                        result.getString("nom"),
//                        result.getString("description"),
//                        result.getString("image"),
//                        result.getDouble("prix"),
//                        result.getString("nom"),
//                        result.getString("nbProduitAchete")
//                );
//            }
//
//            result.close();
//            state.close();
//        }
//        catch (SQLException ex){
//            System.out.println("Error SQL " + ex.getMessage());
//        }
//        finally {
//            return prod;
//        }
        return prod;
    }

    @Override
    public List<Produit> findAll() {
        // TODO
        List<Produit> lisEmp = new ArrayList<>();
        return lisEmp;
    }
}

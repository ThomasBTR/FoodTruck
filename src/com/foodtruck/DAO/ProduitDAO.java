package com.foodtruck.DAO;

import com.foodtruck.config.Database;
import com.foodtruck.models.FamilleProduits;
import com.foodtruck.models.Produit;
import com.foodtruck.models.TypeRepas;
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
            Produit produit = null;

            try {

                Statement state = connection.createStatement();
                String query = "SELECT * FROM tpjavafoodtruck.Produits where id =" + id;

                ResultSet result = state.executeQuery(query);

                while(result.next()){
                    produit = new Produit(
                            result.getInt("id"),
                            result.getString("nom"),
                            result.getString("description"),
                            result.getString("image"),
                            result.getDouble("prix"),
                            TypeRepas.values()[result.getInt("TypeRepas_id") - 1],
                            FamilleProduits.values()[result.getInt("FamillesProduit_id") -1]
                    );

                }

                result.close();
                state.close();
            }
            catch (SQLException ex){
                System.out.println("Error SQL " + ex.getMessage());
            }
            finally {
                return produit;
            }
        }

    public List<Produit> findByName(String produitName) {
        List<Produit> lisEmp = new ArrayList<>();
        // write your code here
        try {

            Statement state = connection.createStatement();
            String query = "SELECT * FROM tpjavafoodtruck.Produits where Produits.nom = \"" + produitName + "\"";

            ResultSet result = state.executeQuery(query);

            while(result.next()){
                lisEmp.add(
                        new Produit(
                                result.getInt("id"),
                                result.getString("nom"),
                                result.getString("description"),
                                result.getString("image"),
                                result.getDouble("prix"),
                                TypeRepas.values()[result.getInt("TypeRepas_id") - 1],
                                FamilleProduits.values()[result.getInt("FamillesProduit_id") -1]
                        )
                );
            }

            result.close();
            state.close();
        }
        catch (SQLException ex){
            System.out.println("Error ded chargement du driver " + ex.getMessage());
        }

        return lisEmp;
    }

    @Override
    public List<Produit> findAll() {
        List<Produit> lisEmp = new ArrayList<Produit>();
        // write your code here
        try {

            Statement state = connection.createStatement();
            String query = "SELECT * FROM tpjavafoodtruck.Produits";

            ResultSet result = state.executeQuery(query);

            while(result.next()){
                lisEmp.add(
                        new Produit(
                                result.getInt("id"),
                                result.getString("nom"),
                                result.getString("description"),
                                result.getString("image"),
                                result.getDouble("prix"),
                                TypeRepas.values()[result.getInt("TypeRepas_id") - 1],
                                FamilleProduits.values()[result.getInt("FamillesProduit_id") -1]
                        )
                );
            }

            result.close();
            state.close();
        }
        catch (SQLException ex){
            System.out.println("Error ded chargement du driver " + ex.getMessage());
        }

        return lisEmp;
    }
}

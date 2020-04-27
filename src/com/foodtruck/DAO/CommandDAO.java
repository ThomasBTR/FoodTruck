package com.foodtruck.DAO;

import com.foodtruck.config.Database;
import com.foodtruck.models.Commande;
import com.foodtruck.models.Produit;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class CommandDAO extends DAO<Commande> {
    private Connection connection;

    public CommandDAO() {
        this.connection = Database.getInstance();
    }

    @Override
    public boolean create(Commande obj) {
        boolean result = false;
        return result;
    }

    @Override
    public boolean delete(Commande obj) {
        // TODO
        return false;
    }

    @Override
    public boolean update(Commande obj) {
        // TODO
        return false;
    }

    @Override
    public Commande findById(int id) {
        // TODO
        Commande emp = null;
        return emp;
    }

    @Override
    public List<Commande> findAll() {
        // TODO
        List<Commande> lisEmp = new ArrayList<>();
        return lisEmp;
    }

}

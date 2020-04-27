package com.foodtruck.DAO;

import java.util.List;

public abstract class DAO<T> {
    abstract boolean create( T obj);
    abstract boolean delete(T obj);
    abstract boolean update(T obj);
    abstract T findById(int id);
    abstract List<T> findAll();
}

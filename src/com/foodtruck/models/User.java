package com.foodtruck.models;


import sun.java2d.pipe.SpanShapeRenderer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private int id;
    private static int instance;
    private String nom;
    private String prenom;
    private Genre genre;
    private String dateDeNaissance;
    private String adresse;
    private String email;
    private String societe;
    private String password;


//////////// Constructeur ////////////
    public User(int id, String nom, String prenom, String dateDeNaissance, String adresse, String email, String societe, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.email = email;
        this.societe = societe;
        this.genre = Genre.HOMME;
        this.password = password;
    }

    public User(String nom, String prenom, String dateDeNaissance, String adresse, String email, String societe, String password) {
        this.id = ++instance;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.email = email;
        this.societe = societe;
        this.password = password;
    }

    ////// GETTER - SETTER ////////////////


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public Date getDateDeNaissanceFrom1970(String dateDeNaissanceInString) {
        SimpleDateFormat formater = new SimpleDateFormat();
        Date date = new Date();
        try{
            date = (Date)formater.parse(dateDeNaissanceInString);


        }
        catch (ParseException e) {e.printStackTrace();}

        return date;
    }
    public long getLongDate(Date date) {
        SimpleDateFormat formater = new SimpleDateFormat();
        long longDate;
        longDate = date.getTime();

        return longDate;
    }


    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void createUser(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

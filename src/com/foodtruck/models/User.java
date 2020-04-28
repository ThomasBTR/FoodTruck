package com.foodtruck.models;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private int id;
    private static int instance;
    private String nom;
    private String prenom;
    private Genre genre;
    private String dateDeNaissanceString;
    private Date dateDeNaissance;
    private String adresse;
    private String email;
    private String societe;
    private String password;


//////////// Constructeur ////////////
    public User(int id, String nom, String prenom, String dateDeNaissanceString, Date dateDeNaissance, String adresse, String email, String societe, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissanceString = dateDeNaissanceString;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.email = email;
        this.societe = societe;
        this.genre = Genre.HOMME;
        this.password = password;
    }

    public User(String nom, String prenom, String dateDeNaissanceString, Date dateDeNaissance, String adresse, String email, String societe, String password) {
        this.dateDeNaissance = dateDeNaissance;
        this.id = ++instance;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissanceString = dateDeNaissanceString;
        this.adresse = adresse;
        this.email = email;
        this.societe = societe;
        this.password = password;
    }

    ////// GETTER - SETTER ////////////////


    public static int getInstance() {
        return instance;
    }

    public static void setInstance(int instance) {
        User.instance = instance;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

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

    public String getDateDeNaissanceString() {
        return dateDeNaissanceString;
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


    public void setDateDeNaissanceString(String dateDeNaissanceString) {
        this.dateDeNaissanceString = dateDeNaissanceString;
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

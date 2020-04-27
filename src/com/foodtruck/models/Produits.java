package com.foodtruck.models;

public class Produits {
    private String nom;
    private String description;
    private String URLImage;
    private double prix;
    private TypeRepas typeRepas;
    private FamilleProduits familleProduits;


//////// CONSTRUCTEUR ///////////////

    public Produits(String nom, String description, String URLImage, double prix, TypeRepas typeRepas, FamilleProduits familleProduits) {
        this.nom = nom;
        this.description = description;
        this.URLImage = URLImage;
        this.prix = prix;
        this.typeRepas = typeRepas;
        this.familleProduits = familleProduits;
    }


/////// GETTER - SETTER ///////////


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getURLImage() {
        return URLImage;
    }

    public void setURLImage(String URLImage) {
        this.URLImage = URLImage;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public TypeRepas getTypeRepas() {
        return typeRepas;
    }

    public void setTypeRepas(TypeRepas typeRepas) {
        this.typeRepas = typeRepas;
    }

    public FamilleProduits getFamilleProduits() {
        return familleProduits;
    }

    public void setFamilleProduits(FamilleProduits familleProduits) {
        this.familleProduits = familleProduits;
    }
}

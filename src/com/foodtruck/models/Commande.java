package com.foodtruck.models;

import java.util.Date;

public class Commande {
    private int idCommande;
    private Date dateLivraison;
    private TypeRepas typeRepas;
    private FamilleProduits familleProduits;
    private int quantiteProduit;
    private String adresseLivraison;

////////// CONSTRUCTEUR ////////////////

    public Commande(int idCommande, Date dateLivraison, TypeRepas typeRepas, FamilleProduits familleProduits, int quantiteProduit, String adresseLivraison) {
        this.idCommande = idCommande;
        this.dateLivraison = dateLivraison;
        this.typeRepas = typeRepas;
        this.familleProduits = familleProduits;
        this.quantiteProduit = quantiteProduit;
        this.adresseLivraison = adresseLivraison;
    }


//////////GETTER - SETTER ////////////////


    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
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

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }
}

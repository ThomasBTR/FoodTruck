package com.foodtruck;

import com.foodtruck.models.Genre;
import com.foodtruck.models.User;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++++++Bienvenue dans notre Truck Food ! +++++++++++" +
                            "\n Veuillez entrer le chiffre correspondant à l'action souhaitée : "+
                            "\n1 ~ Création d'un compte"+
                            "\n2 ~ Connexion");
        int num = scanner.nextInt();


        switch (num) {
            case 1:
                System.out.println("Entrez votre nom : ");
                String nom = scanner.next();
                System.out.println("Entrez votre prenom : ");
                String prenom = scanner.next();
                System.out.println("Entrez votre genre (0~HOMME | 1~FEMME | 2~NON_GENRE) : ");
                int genre = scanner.nextInt();
                System.out.println("Entrez votre date de naissance : ");
                String dateDeNaissance = scanner.next();
                System.out.println("Entrez votre adresse : ");
                String adresse = scanner.next();
                System.out.println("Entrez votre email : ");
                String email = scanner.next();
                System.out.println("Entrez votre société : ");
                String societe = scanner.next();
                System.out.println("Entrez votre mot de passe : ");
                String password = scanner.next();

                User nouveauClient = new User(nom, prenom, dateDeNaissance, adresse, email, societe, password);
                nouveauClient.setGenre(Genre.values()[genre]);

                break;
            case 2:
                break;
            default:
                System.out.println("Vous n'avez pas rentré l'une des valeurs demandée (1 ou 2).");
                break;
            }

            System.out.println("Veuillez entrer le chiffre correspondant à l'action souhaitée :");
            System.out.println("3 ~ Liste des produits");
            System.out.println("4 ~ Rechercher un produit par nom");
            System.out.println("5 ~ Ajouter un article au panier par Id");
            System.out.println("6 ~ Afficher le panier");
            System.out.println("7 ~ Supprimer un article du panier");
            System.out.println("8 ~ Valider le panier");
            System.out.println("9 ~ Afficher l'historique des commandes");
            System.out.println("10 ~ Renseigner l'adresse de livraison");
            System.out.println("11 ~ Déconnexion");
        
    }
}

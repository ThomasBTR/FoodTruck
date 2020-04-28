package com.foodtruck;

import com.foodtruck.DAO.ProduitDAO;
import com.foodtruck.DAO.UserDAO;
import com.foodtruck.models.Genre;
import com.foodtruck.models.Produit;
import com.foodtruck.models.User;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Program {

    UserDAO userDAO = new UserDAO();
    Scanner scanner = new Scanner(System.in);

    public void openMenu() {

        boolean exit = false;
        do {

            System.out.println("+++++++++Bienvenue dans notre Truck Food ! +++++++++++" +
                    "\n Veuillez entrer le chiffre correspondant à l'action souhaitée : " +
                    "\n1 ~ Création d'un compte" +
                    "\n2 ~ Connexion" +
                    "\n12 ~ Quitter");
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

                    User newUser = new User(nom, prenom, dateDeNaissance, adresse, email, societe, password);
                    newUser.setGenre(Genre.values()[genre]);
                    userDAO.create(newUser);
                    System.out.println("Bienvenue " + prenom + " !");
                    foodTruckMainMenu(userDAO);
                    break;
                case 2:
                    System.out.println("Entrez votre Id :");
                    int userId = scanner.nextInt();
                    System.out.println("Entrez votre mot de passe :");
                    String userPassword = scanner.next();
                    boolean idConfirmation = userDAO.checkId(userId, userPassword);
                    if (idConfirmation == true) {
                        System.out.println("Identité confirmé. Bienvenue !");
                        foodTruckMainMenu(userDAO);
                    } else {
                        System.out.println("Le couple Id / Mot de passe n'est pas correct, merci de reesayer");
                    }
                    break;
                case 12:
                    exit = true;
                    break;

                default:
                    System.out.println("Vous n'avez pas rentré l'une des valeurs demandée (1 | 2 | 12) .");
                    break;
            }





        } while (exit != true);
        System.out.println("Au revoir !");

    }

    public void foodTruckMainMenu(UserDAO userDAO){
        int x = 0;
        do {
            x = 0;
            ProduitDAO produitDAO = new ProduitDAO();


            System.out.println("Veuillez entrer le chiffre correspondant à l'action souhaitée :");
            System.out.println("3 ~ Liste des produits");
            System.out.println("4 ~ Rechercher un produit par nom");
            System.out.println("5 ~ Ajouter un Produit au panier par Id");
            System.out.println("6 ~ Afficher le panier");
            System.out.println("7 ~ Supprimer un Produit du panier");
            System.out.println("8 ~ Valider le panier");
            System.out.println("9 ~ Afficher l'historique des commandes");
            System.out.println("10 ~ Renseigner l'adresse de livraison");
            System.out.println("11 ~ Déconnexion");

            x = scanner.nextInt();

            switch (x){
                case 3:
                    produitDAO.findAll().stream().forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Taper les premières lettres d'un article :");
                    String debutNomProduit = scanner.next();
                    produitDAO.findByName(debutNomProduit).stream().forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Taper les premières lettres d'un article :");
                    int idadded= scanner.nextInt();
                    produitDAO.findById(idadded);

                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8 :
                    break;

                case 9 :
                    break;

                case 10:
                    break;
                default :
                    System.out.println("Entrez une valeur entre 3 et 11");
                    break;
            }

        } while (x != 11);
        System.out.println("Vous avez été déconnecté");
    }

    private boolean connectionSuccess (int id, UserDAO user){



        return true;
    }


}

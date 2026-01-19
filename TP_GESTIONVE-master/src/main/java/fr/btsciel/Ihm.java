package fr.btsciel;

import clavier.In;
import java.sql.SQLException;

public class Ihm {
    private GestionDesVE gestion;

    public Ihm() {
        try {
            gestion = new GestionDesVE();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Impossible de se connecter à la base. Le programme va quitter.");
            System.exit(1);
        }
    }

    private void afficherMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("1  - Afficher toutes les voitures");
        System.out.println("2  - Classement par nombre de ventes");
        System.out.println("3  - Modeles commencant par une lettre");
        System.out.println("4  - Voitures avec plus de 10 000 ventes");
        System.out.println("5  - Tri par marque et modele");
        System.out.println("6  - Nombre total de vehicules vendus");
        System.out.println("7  - Nombre total de lignes");
        System.out.println("8  - Ventes entre 10 000 et 15 000");
        System.out.println("9  - Marques contenant une lettre");
        System.out.println("10 - Liste des marques (sans doublons)");
        System.out.println("11 - Voiture la plus vendue");
        System.out.println("12 - Podium des ventes (Top 3)");
        System.out.println("0  - Quitter");
        System.out.print("Votre choix : ");
    }

    private void traiterChoix(int choix) throws SQLException {
        switch (choix) {

            case 1 -> gestion.afficherToutesLesVoitures();
            case 2 -> gestion.classementParVentes();

            case 3 -> {
                System.out.print("Lettre : ");
                char l = In.readChar();
                gestion.modelesParLettre(l);
            }

            case 4 -> gestion.voituresPlusDe10000Ventes();
            case 5 -> gestion.triParMarqueEtModele();
            case 6 -> gestion.nombreTotalVentes();
            case 7 -> gestion.nombreTotalLignes();
            case 8 -> gestion.ventesEntre10000Et15000();

            case 9 -> {
                System.out.print("Lettre : ");
                char l = In.readChar();
                gestion.marquesContenantLettre(l);
            }

            case 10 -> gestion.listeMarquesSansDoublons();
            case 11 -> gestion.voitureLaPlusVendue();
            case 12 -> gestion.top3Ventes();

            case 0 -> System.out.println("Fin du programme");
            default -> System.out.println("Choix invalide");
        }
    }

    public void lancer() throws SQLException {
        int choix;
        do {
            afficherMenu();
            choix = In.readInteger();
            traiterChoix(choix);
        } while (choix != 0);
    }

    public static void main(String[] args) throws SQLException {
        new Ihm().lancer();
    }
}
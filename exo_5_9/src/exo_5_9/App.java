package exo_5_9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int somme = 0, prix, paye, remise;
        int nb10Euros, nb5Euros, nb1Euro;

        // Lecture des prix d'achat
        do {
            System.out.print("Entrez un prix (0 pour terminer la saisie) : ");
            prix = sc.nextInt();
            somme += prix;
        } while (prix != 0);

        // Lecture de la somme payée
        do {
            System.out.print("Entrez la somme payée : ");
            paye = sc.nextInt();
        } while (paye < somme);

        // Calcul de la remise
        remise = paye - somme;

        // Calcul du nombre de coupures de chaque sorte à rendre
        nb10Euros = remise / 10;
        remise %= 10;

        nb5Euros = remise / 5;
        remise %= 5;

        nb1Euro = remise;

        // Affichage des coupures à rendre
        System.out.println("Voici les coupures à rendre : ");
        for (int i = 0; i < nb10Euros; i++) {
            System.out.println("10 Euros");
        }
        for (int i = 0; i < nb5Euros; i++) {
            System.out.println("5 Euros");
        }
        for (int i = 0; i < nb1Euro; i++) {
            System.out.println("1 Euro");
        }

	}

}

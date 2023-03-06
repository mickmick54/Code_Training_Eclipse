package exo_6_9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Demander la taille du tableau à l'utilisateur
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Créer le tableau avec la taille saisie par l'utilisateur
        int[] tableau = new int[taille];

        // Demander à l'utilisateur de saisir les valeurs du tableau
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrez la valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Calculer la somme des valeurs du tableau
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }

        // Afficher la somme des valeurs du tableau
        System.out.println("La somme des valeurs du tableau est : " + somme);

        // Fermer le scanner
        scanner.close();

	}

}

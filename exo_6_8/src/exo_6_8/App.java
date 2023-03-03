package exo_6_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur le nombre de valeurs qu'il souhaite entrer
        System.out.print("Entrez le nombre de valeurs : ");
        int n = input.nextInt();

        // Créer un tableau de taille n pour stocker les valeurs saisies
        int[] tableau = new int[n];

        // Demander à l'utilisateur de saisir les valeurs
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez la valeur numéro " + (i+1) + " : ");
            tableau[i] = input.nextInt();
        }

        // Initialiser les compteurs pour les valeurs négatives et positives
        int nbNegatifs = 0;
        int nbPositifs = 0;

        // Parcourir le tableau pour compter les valeurs négatives et positives
        for (int i = 0; i < n; i++) {
            if (tableau[i] < 0) {
                nbNegatifs++;
            } else {
                nbPositifs++;
            }
        }

        // Afficher le nombre de valeurs négatives et positives
        System.out.println("Il y a " + nbNegatifs + " valeurs négatives.");
        System.out.println("Il y a " + nbPositifs + " valeurs positives.");

        // Fermer le Scanner
        input.close();

	}

}

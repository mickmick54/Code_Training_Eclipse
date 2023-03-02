package exo_6_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double[] notes = new double[9];

        // Saisie des notes
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez la note numéro " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
        }

        // Affichage des notes saisies
        System.out.print("Les notes saisies sont : ");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i] + " ");
        }

	}

}

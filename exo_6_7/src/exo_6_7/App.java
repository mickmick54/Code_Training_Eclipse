package exo_6_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double[] notes = new double[9];
        double somme = 0.0;

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez la note numéro " + (i+1) + " : ");
            notes[i] = scanner.nextDouble();
            somme += notes[i];
        }

        double moyenne = somme / notes.length;
        System.out.println("La moyenne des notes est : " + moyenne);

	}

}

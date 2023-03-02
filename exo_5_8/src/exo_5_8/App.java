package exo_5_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Initialisation du maximum à la plus petite valeur possible
        int count = 0; // Initialisation du compteur
        int num;

        do {
            System.out.print("Entrez un nombre (ou 0 pour arrêter la saisie) : ");
            num = sc.nextInt();
            count++;

            if (num > max) {
                max = num;
            }

        } while (num != 0);

        System.out.println("Le plus grand de ces nombres est : " + max);
        System.out.println("C'était le nombre numéro " + (count - 1));

	}

}

package exo_6_11;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Saisie du premier tableau
        System.out.print("Nombre d'éléments du premier tableau : ");
        int taille1 = sc.nextInt();
        int[] tab1 = new int[taille1];
        System.out.println("Saisie des éléments du premier tableau :");
        for (int i = 0; i < taille1; i++) {
            System.out.print("Element " + (i+1) + " : ");
            tab1[i] = sc.nextInt();
        }

        // Saisie du deuxième tableau
        System.out.print("Nombre d'éléments du deuxième tableau : ");
        int taille2 = sc.nextInt();
        int[] tab2 = new int[taille2];
        System.out.println("Saisie des éléments du deuxième tableau :");
        for (int i = 0; i < taille2; i++) {
            System.out.print("Element " + (i+1) + " : ");
            tab2[i] = sc.nextInt();
        }

        // Calcul du schtroumpf
        int schtroumpf = 0;
        for (int i = 0; i < taille1; i++) {
            for (int j = 0; j < taille2; j++) {
                schtroumpf += tab1[i] * tab2[j];
            }
        }

        // Affichage du résultat
        System.out.println("Le schtroumpf est : " + schtroumpf);

        sc.close();

	}

}

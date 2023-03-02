package exo_4_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int jour, mois, annee;

        System.out.print("Entrez le jour : ");
        jour = sc.nextInt();

        System.out.print("Entrez le mois : ");
        mois = sc.nextInt();

        System.out.print("Entrez l'année : ");
        annee = sc.nextInt();

        boolean bissextile = ((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0);

        if (mois < 1 || mois > 12 || jour < 1 || jour > 31) {
            System.out.println("Date invalide !");
        } else if (mois == 2) {
            if ((bissextile && jour > 29) || (!bissextile && jour > 28)) {
                System.out.println("Date invalide !");
            } else {
                System.out.println("Date valide !");
            }
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            if (jour > 30) {
                System.out.println("Date invalide !");
            } else {
                System.out.println("Date valide !");
            }
        } else {
            System.out.println("Date valide !");
        }
        sc.close();

	}

}

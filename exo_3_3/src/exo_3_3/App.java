package exo_3_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nom : ");
        String nom1 = scanner.nextLine();
        System.out.print("Entrez le deuxième nom : ");
        String nom2 = scanner.nextLine();
        System.out.print("Entrez le troisième nom : ");
        String nom3 = scanner.nextLine();
        if ((nom1.compareToIgnoreCase(nom2) <= 0) && (nom2.compareToIgnoreCase(nom3) <= 0)) {
            System.out.println("Les noms sont rangés dans l'ordre alphabétique.");
        } else {
            System.out.println("Les noms ne sont pas rangés dans l'ordre alphabétique.");
        }

	}

}

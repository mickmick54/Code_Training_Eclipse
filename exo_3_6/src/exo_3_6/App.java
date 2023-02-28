package exo_3_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'âge de l'enfant : ");
        int age = scanner.nextInt();
        if (age >= 6 && age <= 7) {
            System.out.println("Catégorie : Poussin");
        } else if (age >= 8 && age <= 9) {
            System.out.println("Catégorie : Pupille");
        } else if (age >= 10 && age <= 11) {
            System.out.println("Catégorie : Minime");
        } else if (age >= 12) {
            System.out.println("Catégorie : Cadet");
        } else {
            System.out.println("L'âge entré n'est pas valide.");
        }
	}

}

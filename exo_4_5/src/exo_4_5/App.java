package exo_4_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int age;
        char sexe;
        boolean estImposable = false;
        System.out.print("Quel est l'âge de l'habitant ? ");
        age = scanner.nextInt();
        System.out.print("Quel est le sexe de l'habitant (M ou F) ? ");
        sexe = scanner.next().charAt(0);
        if ((sexe == 'M' && age > 20) || (sexe == 'F' && age >= 18 && age <= 35)) {
            estImposable = true;
        }
        if (estImposable) {
            System.out.println("L'habitant est imposable.");
        } else {
            System.out.println("L'habitant n'est pas imposable.");
        }
	}

}

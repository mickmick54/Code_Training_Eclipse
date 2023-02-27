package exo_3_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        double nombre = scanner.nextDouble();
        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        } else {
            System.out.println("Le nombre est négatif.");
        }
	}

}

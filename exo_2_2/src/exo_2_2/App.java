package exo_2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        int carre = nombre * nombre;
        System.out.println("Le carré de " + nombre + " est " + carre + ".");
	}

}

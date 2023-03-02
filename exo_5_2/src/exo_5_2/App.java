package exo_5_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int nombre = 0;

        while (nombre < 10 || nombre > 20) {
            System.out.print("Entrez un nombre compris entre 10 et 20 : ");
            nombre = input.nextInt();

            if (nombre > 20) {
                System.out.println("Plus petit !");
            } else if (nombre < 10) {
                System.out.println("Plus grand !");
            }
        }

        System.out.println("Le nombre " + nombre + " convient.");

	}

}

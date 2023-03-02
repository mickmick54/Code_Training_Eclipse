package exo_5_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = clavier.nextInt();

        System.out.println("Table de " + nombre + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }
        clavier.close();

	}

}

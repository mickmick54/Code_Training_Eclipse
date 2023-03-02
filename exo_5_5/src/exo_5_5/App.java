package exo_5_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
        int nombre, somme = 0;
        
        System.out.print("Entrez un nombre : ");
        nombre = clavier.nextInt();
        
        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }
        
        System.out.println("La somme des entiers jusqu'à " + nombre + " est : " + somme);

	}

}

package exo_5_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
	    int max = Integer.MIN_VALUE; // initialisation de la variable max
	    int position = 0; // initialisation de la variable position
	    for (int i = 1; i <= 20; i++) {
	      System.out.print("Entrez le nombre numéro " + i + " : ");
	      int nombre = clavier.nextInt();
	      if (nombre > max) { // si le nombre saisi est plus grand que max
	        max = nombre; // max prend la valeur du nombre saisi
	        position = i; // on mémorise la position
	      }
	    }
	    System.out.println("Le plus grand de ces nombres est : " + max);
	    System.out.println("C'était le nombre numéro " + position);
	    clavier.close(); // fermeture du scanner

	}

}

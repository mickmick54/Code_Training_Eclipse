package exo_5_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Entrez un nombre : ");
	    int nombre = sc.nextInt();

	    for(int i = 1; i <= 10; i++) {
	      System.out.println(nombre + i);
	    }

	}

}

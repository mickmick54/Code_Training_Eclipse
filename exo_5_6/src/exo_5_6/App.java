package exo_5_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int n, i, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Erreur : le nombre doit être positif.");
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("La factorielle de " + n + " est " + fact);
        }
        sc.close();

	}

}

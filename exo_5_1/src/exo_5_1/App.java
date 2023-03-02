package exo_5_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choix = 0;
        
        while (choix < 1 || choix > 3) {
            System.out.print("Veuillez entrer un nombre entre 1 et 3 : ");
            choix = sc.nextInt();
        }
        
        System.out.println("Vous avez choisi le nombre " + choix);

	}

}

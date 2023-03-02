package exo_5_10;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // Demander le nombre de chevaux partants
        System.out.print("Nombre de chevaux partants : ");
        int n = sc.nextInt();
        
        // Demander le nombre de chevaux joués
        System.out.print("Nombre de chevaux joués : ");
        int p = sc.nextInt();
        
        // Calculer les chances de gagner dans l'ordre
        int chancesDansLordre = factorielle(n) / factorielle(n - p);
        System.out.println("Dans l'ordre : une chance sur " + chancesDansLordre + " de gagner");
        
        // Calculer les chances de gagner dans le désordre
        int chancesDansLeDesordre = factorielle(n) / (factorielle(p) * factorielle(n - p));
        System.out.println("Dans le désordre : une chance sur " + chancesDansLeDesordre + " de gagner");
    }
    
    // Méthode pour calculer la factorielle d'un entier
    public static int factorielle(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;

	}

}

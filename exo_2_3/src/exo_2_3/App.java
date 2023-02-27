package exo_2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le prix HT de l'article : ");
        double prixHT = scanner.nextDouble();
        System.out.print("Entrez le nombre d'articles : ");
        int nombreArticles = scanner.nextInt();
        System.out.print("Entrez le taux de TVA en pourcentage : ");
        double tauxTVA = scanner.nextDouble();
        double prixTTC = (prixHT * nombreArticles) * (1 + tauxTVA/100);
        System.out.println("Prix TTC pour " + nombreArticles + " articles : " + prixTTC + " euros.");
	}

}

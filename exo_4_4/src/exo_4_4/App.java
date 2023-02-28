package exo_4_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int nbPhotocopies;
        double facture = 0.0;
        System.out.print("Combien de photocopies avez-vous faites ? ");
        nbPhotocopies = scanner.nextInt();
        if (nbPhotocopies <= 10) {
            facture = nbPhotocopies * 0.1;
        } else if (nbPhotocopies <= 30) {
            facture = 10 * 0.1 + (nbPhotocopies - 10) * 0.09;
        } else {
            facture = 10 * 0.1 + 20 * 0.09 + (nbPhotocopies - 30) * 0.08;
        }
        System.out.println("La facture s'élève à " + facture + " euros.");
	}

}

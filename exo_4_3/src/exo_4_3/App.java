package exo_4_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int heures, minutes, secondes;
        System.out.print("Entrez l'heure : ");
        heures = scanner.nextInt();
        System.out.print("Entrez les minutes : ");
        minutes = scanner.nextInt();
        System.out.print("Entrez les secondes : ");
        secondes = scanner.nextInt();
        secondes++;
        if (secondes == 60) {
            minutes++;
            secondes = 0;
        }
        if (minutes == 60) {
            heures++;
            minutes = 0;
        }
        if (heures == 24) {
            heures = 0;
        }
        System.out.println("Dans une seconde, il sera " + heures + " heure(s), " + minutes + " minute(s) et " + secondes + " seconde(s)");
	}

}

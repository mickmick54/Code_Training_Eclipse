package exo_4_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int heures, minutes;
        System.out.print("Entrez l'heure : ");
        heures = scanner.nextInt();
        System.out.print("Entrez les minutes : ");
        minutes = scanner.nextInt();
        minutes++;
        if (minutes == 60) {
            heures++;
            minutes = 0;
        }
        if (heures == 24) {
            heures = 0;
        }
        System.out.println("Dans une minute, il sera " + heures + " heure(s) " + minutes);
	}

}

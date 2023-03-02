package exo_4_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double[] scores = new double[4];
        double totalVotes = 0;

        // Saisie des scores des candidats
        for (int i = 0; i < 4; i++) {
            System.out.print("Score du candidat " + (i+1) + " : ");
            scores[i] = sc.nextDouble();
            totalVotes += scores[i];
        }

        // Calcul du pourcentage de voix du candidat numéro 1
        double pourcentageCandidat1 = (scores[0] / totalVotes) * 100;

        // Traitement du candidat numéro 1
        if (pourcentageCandidat1 > 50) {
            System.out.println("Le candidat numéro 1 est élu dès le premier tour !");
        } else {
            // Calcul du pourcentage de voix nécessaire pour participer au second tour
            double pourcentageSecondTour = 12.5;

            // Vérification si le candidat numéro 1 participe au second tour
            boolean participeSecondTour = false;
            for (int i = 1; i < 4; i++) {
                if (scores[i] / totalVotes >= pourcentageSecondTour / 100) {
                    participeSecondTour = true;
                    break;
                }
            }

            if (!participeSecondTour) {
                System.out.println("Le candidat numéro 1 est battu dès le premier tour !");
            } else if (scores[0] / totalVotes > scores[1] / totalVotes) {
                System.out.println("Le candidat numéro 1 est en ballottage favorable !");
            } else {
                System.out.println("Le candidat numéro 1 est en ballottage défavorable !");
            }
        }

        sc.close();

	}

}

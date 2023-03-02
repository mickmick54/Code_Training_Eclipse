package exo_4_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        System.out.print("Âge du conducteur : ");
        int age = sc.nextInt();
        
        System.out.print("Nombre d'années de permis : ");
        int anneesPermis = sc.nextInt();
        
        System.out.print("Nombre d'accidents responsables : ");
        int accidentsResponsables = sc.nextInt();
        
        System.out.print("Durée d'adhésion (en années) : ");
        int dureeAdhesion = sc.nextInt();
        
        String tarif = "";
        
        if (age < 25 && anneesPermis < 2) {
            if (accidentsResponsables == 0) {
                tarif = "rouge";
            } else {
                tarif = "refusé";
            }
        } else if ((age < 25 && anneesPermis >= 2) || (age >= 25 && anneesPermis < 2)) {
            if (accidentsResponsables == 0) {
                tarif = "orange";
            } else if (accidentsResponsables == 1) {
                tarif = "rouge";
            } else {
                tarif = "refusé";
            }
        } else if (age >= 25 && anneesPermis >= 2) {
            if (accidentsResponsables == 0) {
                tarif = "vert";
            } else if (accidentsResponsables == 1) {
                tarif = "orange";
            } else if (accidentsResponsables == 2) {
                tarif = "rouge";
            } else {
                tarif = "refusé";
            }
        }
        
        if (dureeAdhesion > 1) {
            switch (tarif) {
                case "rouge":
                    tarif = "orange";
                    break;
                case "orange":
                    tarif = "vert";
                    break;
                case "vert":
                    tarif = "bleu";
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("Le tarif de l'assurance automobile est : " + tarif);
        
        sc.close();
	}

}

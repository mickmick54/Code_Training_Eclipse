package exo_4_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int Tutu, Toto;
        String Tata;
        System.out.print("Entrez la valeur de Tutu : ");
        Tutu = scanner.nextInt();
        System.out.print("Entrez la valeur de Toto : ");
        Toto = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Entrez la valeur de Tata : ");
        Tata = scanner.nextLine();
        if (Tutu > Toto + 4 || Tata.equals("OK")) {
            Tutu++;
        } else {
            Tutu--;
        }
        System.out.println("La nouvelle valeur de Tutu est : " + Tutu);

	}

}

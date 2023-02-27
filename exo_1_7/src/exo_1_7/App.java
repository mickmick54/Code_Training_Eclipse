package exo_1_7;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 7; // Exemple de valeur pour A
        int B = 3; // Exemple de valeur pour B
        int C = 9; // Exemple de valeur pour C
        System.out.println("Avant échange :");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        
        // Échange des valeurs de A, B et C
        int temp = A;
        A = C;
        C = B;
        B = temp;
        
        System.out.println("Après échange :");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
	}

}

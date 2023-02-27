package exo_1_6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 7; // Exemple de valeur pour A
        int B = 3; // Exemple de valeur pour B
        System.out.println("Avant échange :");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        // Échange des valeurs de A et B
        int temp = A;
        A = B;
        B = temp;
        
        System.out.println("Après échange :");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
	}

}

package exo_6_5;

public class App {

	public static void main(String[] args) {
		int[] N = new int[7];
        N[0] = 1;
        for (int k = 1; k <= 6; k++) {
            N[k] = N[k-1] + 2;
        }
        for (int i = 0; i <= 6; i++) {
            System.out.println(N[i]);
        }

	}

}

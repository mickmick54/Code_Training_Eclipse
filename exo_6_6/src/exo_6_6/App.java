package exo_6_6;

public class App {

	public static void main(String[] args) {
		int[] suite = new int[7];
        suite[0] = 1;
        suite[1] = 1;
        for (int i = 2; i < 7; i++) {
            suite[i] = suite[i-1] + suite[i-2];
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(suite[i]);
        }

	}

}

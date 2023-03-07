package exo_6_10;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] tab1 = {4, 8, 7, 9, 1, 5, 4, 6};
	    int[] tab2 = {7, 6, 5, 2, 1, 3, 7, 4};
	    int[] tabResult = new int[tab1.length];

	    for (int i = 0; i < tab1.length; i++) {
	      tabResult[i] = tab1[i] + tab2[i];
	    }

	    System.out.println("Tableau 1 : " + Arrays.toString(tab1));
	    System.out.println("Tableau 2 : " + Arrays.toString(tab2));
	    System.out.println("Tableau résultat : " + Arrays.toString(tabResult));

	}

}

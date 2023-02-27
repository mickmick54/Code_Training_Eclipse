package exo_2_4;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom = "belle marquise";
        String pronom = "vos";
        String adjectif = "beaux";
        String partie1 = nom + ", " + pronom + " " + adjectif + " yeux me font mourir d'amour.";
        String partie2 = nom + ", " + pronom + " yeux " + adjectif + " me font mourir d'amour.";
        String partie3 = "Belle " + nom + ", " + pronom + " " + adjectif + " yeux me font mourir d'amour.";
        String partie4 = "Belle " + nom + ", " + pronom + " yeux " + adjectif + " me font mourir d'amour.";
        System.out.println(partie1);
        System.out.println(partie2);
        System.out.println(partie3);
        System.out.println(partie4);
        
        String t1 = "belle Marquise";
        String t2 = "vos beaux yeux";
        String t3 = "me font mourir";
        String t4 = "d’amour";
        System.out.println(t1 + " " + t2 + " " + t3 + " " + t4);
        System.out.println(t3 + " " + t2 + " " + t4 + " " + t1);
        System.out.println(t2 + " " + t3 + " " + t1 + " " + t4);
        System.out.println(t4 + " " + t1 + " " + t2 + " " + t3);
	}

}

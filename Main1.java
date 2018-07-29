import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Robot r = new Robot(null);
		Robot r1 = new Robot ("r1",0,1,"Nord");
		Robot r2 = new Robot ("r2",1,0,"Est");
		RoboNG rn1 = new RoboNG ("rng1",0,-2,"Sud");
		RoboNG rn2 = new RoboNG ("rng2",-5,0,"Ouest");
		Scanner sc = new Scanner(System.in);
		r1.affiche1();
		r2.affiche1();
		rn1.affiche();
		rn2.affiche();
		
		r1.avance();
		r2.avance();
		rn1.avance(5);
		rn2.avance(2);
		
		r1.affiche1();
		r2.affiche1();
		rn1.affiche();
		rn2.affiche();
		// TODO Auto-generated method stub

	}

}

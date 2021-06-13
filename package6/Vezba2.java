package package6;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati funkciju koja prima broj i vraca text 
		//da li je broj pozitivan negativan ili nula. Resenje ispisati iz main metode
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj: ");
		int broj = s.nextInt();
		String predznakBroja = predznakBroja(broj);
		
		System.out.println("Broj " + broj + " je " + predznakBroja);
		

	}
	
	public static String predznakBroja (int broj) {
		String predznakBroja;
		if (broj > 0) {
			predznakBroja = "pozitivan";
		} else if (broj < 0) {
			predznakBroja = "negativan";
		} else {
			predznakBroja = "nula";
		}
		return predznakBroja;
	}

}

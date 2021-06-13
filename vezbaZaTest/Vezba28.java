package vezbaZaTest;

import java.util.Scanner;

public class Vezba28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati funkciju koja prima broj i vraca text 
		//da li je broj pozitivan negativan ili nula. Resenje ispisati iz main metode
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj: ");
		int broj =  s.nextInt();
		
		System.out.println(pozitivnostBroja(broj));

	}
	public static String pozitivnostBroja (int unetiBroj) {
		String pozitivnost = "";
		
		if (unetiBroj < 0) {
			pozitivnost = "Uneti broj je negativan";
		} else if (unetiBroj > 0) {
			pozitivnost = "Uneti broj je pozitivan";
		} else {
			pozitivnost = "Uneti broj je nula";
		}
		
		return pozitivnost;
	}
	

}

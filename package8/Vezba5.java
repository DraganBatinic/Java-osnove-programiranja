package package8;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NAPISATI FUNKCIJU koja unetu vrednost distance prebacuje u metre
				// 1 Yard = 0.9144 metara
				// 1 Foot = 0.3048 metara
				// 1 Inch = 0.0254 metara
				// Korisnik unosi distancu i mernu jedinicu
				// Ispis u konzoli se vrsi iz main funkcije
				// Primer resenja:
				// Molim vas unesite distancu:
				// 150
				// Molim vas unesite mernu jedinicu (Yard, Foot ili Inch):
				// Yard
				// 150 Yard je isto sto i 137.16 metara

		Scanner s = new Scanner (System.in);
		
		System.out.println("Molim Vas, unesite distancu:");
		int distanca = s.nextInt();
		System.out.println("Molim Vas, unesite mernu jedinicu (Yard, Foot ili Inch)");
		String mernaJedinica = s.next();
		
		double distancaIzKonvertora = konvertorDistance(distanca, mernaJedinica);
		System.out.println(distanca + " " + mernaJedinica + " je isto sto i " + distancaIzKonvertora + " metara");
		
		
	}
	public static double konvertorDistance(int distanca, String mernaJedinica) {
		
		double konvertovanaDistanca = 0.0;
		
		if (mernaJedinica.equals("Yard")) {
			konvertovanaDistanca = distanca * 0.9144;
		} else if (mernaJedinica.equals("Foot")) {
			konvertovanaDistanca = distanca * 0.3048;
		} else if (mernaJedinica.equals("Inch")) {
			konvertovanaDistanca = distanca * 0.0254;
		} 
		
		return konvertovanaDistanca;
	}
	
	

}

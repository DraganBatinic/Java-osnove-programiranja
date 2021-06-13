package package7;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisti funkciju koja za broj n,
//		vraca poslednju cifru.
//		Primer:
//		Ako se prosledi n=3290329, ona vrati 9
//      bonus zadatak: funkcija koja vraca pretposlednji broj
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj n = ");
		int broj = s.nextInt();
		
		System.out.println("Poslednja cifra unetog broja n je: " + poslednjaCifra(broj));
		
		System.out.println("Pretposlednja cifra unetog broja n je: " + pretposlednjaCifra(broj));

	}
	public static int poslednjaCifra (int n) {
		
		int poslednjaCifra = n % 10;
		
		return poslednjaCifra;
	}
	public static int pretposlednjaCifra (int n) {
		
		int pretposlednjaCifra = (n / 10) % 10;
		
		return pretposlednjaCifra;
	

	}
	
}

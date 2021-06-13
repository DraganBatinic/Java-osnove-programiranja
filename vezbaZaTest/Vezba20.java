package vezbaZaTest;

import java.util.Scanner;

public class Vezba20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji sabira brojeve od korisnika sve dok
//		korisnik ne unese dva ista broja zaredom. Smatrati da korisnik unosi
//		brojeve vece od nule.
//		Primer:
//		Unesite broj: 1
//		Unesite broj: 3
//		Unesite broj: 5
//		Unesite broj: 7
//		Unesite broj: 2
//		Unesite broj: 2
//		Suma je 20
		Scanner s = new Scanner (System.in);
		
		int broj = 0;
		int suma = 0;
		int kontrolniBroj = -1;		
		
		while (broj != kontrolniBroj) {
			kontrolniBroj = broj;
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			suma += broj;			
		}
		
		System.out.println("Suma unetih brojeva je: " + suma);
		
		

	}

}

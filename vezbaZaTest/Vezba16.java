package vezbaZaTest;

import java.util.Scanner;

public class Vezba16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji sabira N brojeva.
//		Korisnik unosi N i unosi brojeve.
//		Primer:
//		Unesite koliko brojeva zelimo da saberemo: 5
//		Unesite 1. broj: 1
//		Unesite 2. broj: 3
//		Unesite 3. broj: 4
//		Unesite 4. broj: 2
//		Unesite 5. broj: 6
//		Suma unetih brojeva je 16
		Scanner s = new Scanner (System.in);
		
		System.out.print("Koliko brojeva zelite da saberete: ");
		int n = s.nextInt();
		int suma = 0;
		int broj = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			broj = s.nextInt();
			suma += broj;			
		}
		
		System.out.println("Suma unetih brojeva je: " + suma);

	}

}

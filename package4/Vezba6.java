package package4;

import java.util.Scanner;

public class Vezba6 {

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
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite koliko brojeva zelimo da saberemo: ");
		int N = s.nextInt();

		int suma = 0;
		int unetiBroj;

		for (int i = 1; i <= N; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			unetiBroj = s.nextInt();
			suma += unetiBroj;
		}

		System.out.println("Suma unetih brojeva je " + suma);

	}

}

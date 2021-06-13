package package4;

import java.util.Scanner;

public class Domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji unosi i sabira brojeve
		// dokle god nije unesen negativan broj, ispisuje njihov zbir (zbir pozitivnih
		// brojeva).
		// primer: ako korisnik unese 1 2 5 3 -1, program treba da ispise 11
		/*Scanner s = new Scanner(System.in);

		System.out.println("Unesite brojeve: ");
		int unetiBroj;

		int sum = 0;

		do {
			unetiBroj = s.nextInt();
			if (unetiBroj > 0) {
				sum += unetiBroj;
			}
		} while (unetiBroj >= 0);

		System.out.println(" ");
		System.out.println("Zbir unetih brojeva je: " + sum);*/
		
		//Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih)
		//deljivih brojem 3.
		
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		
		for (int i = 9; i <= 250; i++) {
			if (i % 3 == 0) {
				count++;				
			}
		}
		
		System.out.println("U skupu brojeva od 9 do 250 ima " + count + " brojeva deljivih sa 3.");
		
	}

}

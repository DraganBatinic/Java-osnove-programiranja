package vezbaZaTest;

import java.util.Scanner;

public class Vezba19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati zadatak koji za uneti dvocifreni broj napise koja je prva cifra, a koja druga
		// primer ispisa:
		//uneli ste 35
		//prvi broj je 3
		//drugi broj je 5
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite dvocifren broj: ");
		int dvocifrenBroj = s.nextInt();
		
		int prvaCifra = dvocifrenBroj / 10;
		int drugaCifra = dvocifrenBroj % 10;
		
		if (prvaCifra < 1 || prvaCifra >= 10) {
			System.out.println("Pogresan unos. Unesite dvocifren broj!");
		} else {		
			System.out.println("Uneli ste broj: " + dvocifrenBroj);
			System.out.println("Prva cifra je: " + prvaCifra);
			System.out.println("druga cifra je: " + drugaCifra);
		}

	}

}

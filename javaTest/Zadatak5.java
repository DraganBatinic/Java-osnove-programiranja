package javaTest;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
		//Proizvoljno napravite niz od 10 brojeva
		//korisnik unosi broj koji zeli da prebroji u nizu
		        
		//Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
		//Primeri ispisa u konzoli
		        
		//Unesite broj koji zelite da prbrojimo u nizu brojeva:
		//2
		//Broj 2 se pojavljuje 3. puta u nasem nizu brojeva
		//Primer ispisa kad se unese broj koji ne postoji u nizu brojeva
		        
		//Unesite broj koji zelite da prbrojimo u nizu brojeva:
		//8
		//Broj 8 se ne pojavljuje u nasem nizu
		Scanner s = new Scanner (System.in);
		
		int[] nizBrojeva = {3, 45, 12, 16, 3, 12, 90, 3, 23, 3};
		
		System.out.println("Unesite broj koji zelite da prbrojimo u nizu brojeva:");
		int brojZaProveru = s.nextInt();
		
		int brojacIzFunkcije = ponavljanjeBroja(nizBrojeva, brojZaProveru);
		
		if (brojacIzFunkcije > 1) {
			System.out.println("Broj " + brojZaProveru + " se pojavljuje " + brojacIzFunkcije + " puta u nasem nizu brojeva");			
		} else if (brojacIzFunkcije == 1) {
			System.out.println("Broj " + brojZaProveru + " se pojavljuje " + brojacIzFunkcije + " put u nasem nizu brojeva");
		} else if (brojacIzFunkcije == 0) {
			System.out.println("Broj " + brojZaProveru + " se ne pojavljuje u nasem nizu");
		}

	}
	public static int ponavljanjeBroja (int[] nizBrojeva, int broj) {
		int brojac = 0;
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			if (nizBrojeva[i] == broj) {
				brojac++;
			}
		}
		
		return brojac;
		
	}

}

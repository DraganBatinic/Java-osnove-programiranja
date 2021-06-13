package vezbaZaTest;

import java.util.Scanner;

public class Vezba30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program gde korisnik unese ime, prezime i pol (preko void metode) 
		//a main metoda stampa i vraca "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.print("Unesite pol: ");
		String pol = s.next();
		
		System.out.println("");
		dobrodoslica(pol);

	}
	public static void dobrodoslica (String pol) {
		if (pol.equals("muski")) {
			System.out.println("Dobrodosao u IT");
		} else if (pol.equals("zenski")) {
			System.out.println("Dobrodosla u IT");
		} else {
			System.out.println("Pogresan unos. Unesite muski/zenski pol!");
		}
	}

}

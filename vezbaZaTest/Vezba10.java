package vezbaZaTest;

import java.util.Scanner;

public class Vezba10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji od korisnika trazi unos broja dana u jednom mesecu 
		//i da za rezultat ispise koliko meseci u godini ima toliko dana.
		//Primer. korisnik unese 31 a program vrati rezultat "7 meseci u godini ima 31 dan"
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj dana u mesecu: ");
		int brojDana = s.nextInt();
		
		switch (brojDana) {
		case 31: {
			System.out.println("7 meseci u godini ima najvise 31 dan");
		}			
			break;
		case 30: {
			System.out.println("4 meseca u godini ima najvise 30 dana (a zapravo 11 meseci imaju 30 dana) ");
		}			
			break;
		case 28: {
			System.out.println("1 mesec u godini ima najvise 28 dana (a zapravo svih 12 meseci imaju 28 dana)");
		}			
			break;
		case 29: {
			System.out.println("1 mesec u godini ima najvise 29 dana (a zapravo svih 12 meseci imaju 29 dana)");
		}			
			break;

		default: {
			System.out.println("Pogresan unos!");
		}
			break;
		}

	}

}

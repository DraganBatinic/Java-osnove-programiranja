package vezbaZaTest;

import java.util.Scanner;

public class Vezba6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sa tastature uneti redni broj od 1 do 7 
		//i u zavisnosti od toga ispisati: "Radni dan" (1-5), a za "Vikend" za unose 6 i 7
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite redni broj dana: ");
		int redniBrojDana = s.nextInt();
		
		switch (redniBrojDana) {
		case 1: {
			System.out.println("Radni dan");
		}			
			break;
		case 2: {
			System.out.println("Radni dan");
		}			
			break;
		case 3: {
			System.out.println("Radni dan");
		}			
			break;
		case 4: {
			System.out.println("Radni dan");
		}			
			break;
		case 5: {
			System.out.println("Radni dan");
		}			
			break;
		case 6: {
			System.out.println("Vikend");
		}			
			break;
		case 7: {
			System.out.println("Vikend");
		}			
			break;

		default: {
			System.out.println("Pogesan unos, unesite redni broj dana od 1 do 7!");
		}
			break;
		}

	}

}

package package8;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program gde korisnik unese redni broj dana u godini (1-365) 
		//i program vrati odgovor koji je to dan u nedelji. 
		//Podjimo od pretpostavke da je 1. januar ponedeljak.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Molimo Vas, unesite redni broj dana u godini (1-365): ");
		
		int redniBrojDanaUGodini = s.nextInt();
		int redniBrojDanaUNedelji = 1;
		
		for (int i = redniBrojDanaUGodini; i >= -6; i-=7) {
			if (redniBrojDanaUGodini < 1 || redniBrojDanaUGodini > 365) {
				System.out.println("Pogresan unos, pokusajte ponovo!");
				break;
			}
			redniBrojDanaUNedelji = i;
		}
		
		
		switch (redniBrojDanaUNedelji) {
		case -6: {
			System.out.println("Dan pod rednim brojem " + redniBrojDanaUGodini + " je ponedeljak.");
		}			
			break;
		case -5: {
			System.out.println("Dan pod rednim brojem " + redniBrojDanaUGodini + " je utorak.");
		}			
			break;
		case -4: {
			System.out.println("Dan pod rednim brojem " + redniBrojDanaUGodini + " je sreda.");
		}			
			break;
		case -3: {
			System.out.println("Dan pod rednim brojem " + redniBrojDanaUGodini + " je cetvrtak.");
		}			
			break;
		case -2: {
			System.out.println("Dan pod rednim brojem " + redniBrojDanaUGodini + " je petak.");
		}			
			break;
		case -1: {
			System.out.println("Dan pod rednim brojem " + redniBrojDanaUGodini + " je subota.");
		}			
			break;
		case 0: {
			System.out.println("Dan pod rednim brojem " + redniBrojDanaUGodini + " je nedelja.");
		}			
			break;
		default:
			break;
		}		
			
	}		

}



package package5;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program gde korisnik unese datum rodjenja i 
		//program vrati koji je to horoskopski znak
		Scanner s = new Scanner (System.in);
		
		int dan;
		int mesec;
		String[] meseciUGodini = {"januar", "februar", "mart", "april", "maj", "jun", "jul", "avgust", "septembar", "oktobar", "novembar", "decembar"};
				
		System.out.println("Unesite Vas datum rodjena u formatu DD/MM: ");
		
		dan = s.nextInt();		
		mesec = s.nextInt();
		System.out.println();
		System.out.println("Vas datum rodjenja je: " + dan + ". " + meseciUGodini[mesec - 1] + ".");
		System.out.println();
		
		switch (mesec) {
		case 1: {
			if (dan <= 20) {
				System.out.println("Vas horoskopski znak je jarac.");
			} else if (dan >= 21) {
				System.out.println("Vas horoskopski znak je vodolija.");
			}
		}
		
		break;
		
		case 2: {
			if (dan <= 19) {
				System.out.println("Vas horoskopski znak je vodolija.");
			} else if (dan >= 20) {
				System.out.println("Vas horoskopski znak je ribe.");
			}
		}
			
			break;
			
		case 3: {
			if (dan <= 20) {
				System.out.println("Vas horoskopski znak je ribe.");
			} else if (dan >= 21) {
				System.out.println("Vas horoskopski znak je ovan.");
			}
		}
			
			break;
			
		case 4: {
			if (dan <= 20) {
				System.out.println("Vas horoskopski znak je ovan.");
			} else if (dan >= 21) {
				System.out.println("Vas horoskopski znak je bik.");
			}
		}
			
			break;
			
		case 5: {
			if (dan <= 21) {
				System.out.println("Vas horoskopski znak je bik.");
			} else if (dan >= 22) {
				System.out.println("Vas horoskopski znak je blizanci.");
			}
		}
			
			break;
			
		case 6: {
			if (dan <= 21) {
				System.out.println("Vas horoskopski znak je blizanci.");
			} else if (dan >= 22) {
				System.out.println("Vas horoskopski znak je rak.");
			}
		}
			
			break;
			
		case 7: {
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je rak.");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je lav.");
			}
		}
			
			break;
			
		case 8: {
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je lav.");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je devica.");
			}
		}
			
			break;
			
		case 9: {
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je devica.");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je vaga.");
			}
		}
			
			break;
			
		case 10: {
			if (dan <= 23) {
				System.out.println("Vas horoskopski znak je vaga.");
			} else if (dan >= 24) {
				System.out.println("Vas horoskopski znak je skorpija.");
			}
		}
			
			break;
			
		case 11: {
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je skorpija.");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je strelac.");
			}
		}
			
			break;
			
		case 12: {
			if (dan <= 21) {
				System.out.println("Vas horoskopski znak je strelac.");
			} else if (dan >= 22) {
				System.out.println("Vas horoskopski znak je jarac.");
			}
		}
			
			break;

		default: {
			System.out.println("Pogresan unos, pokusajte ponovo!");
		}
			break;
		}		
				

	}

}

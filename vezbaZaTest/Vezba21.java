package vezbaZaTest;

import java.util.Scanner;

public class Vezba21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prvi dan u mesecu je ponedeljak, a mesec ima 31 dan
		// korisnik unosi dan u nedelji, a program treba da kaze
		// na koje dane u mesecu pada taj dan
		// primer ispisa:
		// utorak pada na
		// 2
		// 9
		// 16
		// 23
		// 30
		// dan u mesecu
		//Bonus deo: Zelim da mi ispis izgleda ovako
		//Utorak pada na:
		//2, 9, 16, 23, 30 dan u mesecu
		//Obratite paznju da nema zaraza nakon poslednjeg broja...znaci nije ovako
		//Utorak pada na:
		//2, 9, 16, 23, 30, dan u mesecu
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite dan u nedelji: ");
		String danUNedelji = s.next();
		
		switch (danUNedelji) {
		case "ponedeljak": {
			System.out.println("Ponedeljak pada na: ");
			for (int i = 1; i <= 31; i+=7) {
				if (31 - i < 6) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + ", ");
				}
			}
			System.out.println("dan u mesecu.");
		}			
			break;
		case "utorak": {
			System.out.println("Utorak pada na: ");
			for (int i = 2; i <= 31; i+=7) {
				if (31 - i < 6) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + ", ");
				}
			}
			System.out.println("dan u mesecu.");
		}			
			break;
		case "sreda": {
			System.out.println("Sreda pada na: ");
			for (int i = 3; i <= 31; i+=7) {
				if (31 - i < 6) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + ", ");
				}
			}
			System.out.println("dan u mesecu.");
		}			
			break;
		case "cetvrtak": {
			System.out.println("Cetvrtak pada na: ");
			for (int i = 4; i <= 31; i+=7) {
				if (31 - i < 6) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + ", ");
				}
			}
			System.out.println("dan u mesecu.");
		}			
			break;
		case "petak": {
			System.out.println("Petak pada na: ");
			for (int i = 5; i <= 31; i+=7) {
				if (31 - i < 6) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + ", ");
				}
			}
			System.out.println("dan u mesecu.");
		}			
			break;
		case "subota": {
			System.out.println("Subota pada na: ");
			for (int i = 6; i <= 31; i+=7) {
				if (31 - i < 6) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + ", ");
				}
			}
			System.out.println("dan u mesecu.");
		}			
			break;
		case "nedelja": {
			System.out.println("Nedelja pada na: ");
			for (int i = 7; i <= 31; i+=7) {
				if (31 - i < 6) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + ", ");
				}
			}
			System.out.println("dan u mesecu.");
		}			
			break;

		default: {
			System.out.println("Pogresan unos!");
		}
			break;
		}

	}

}

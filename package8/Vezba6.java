package package8;

import java.util.Scanner;

public class Vezba6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NAPISATI FUNKCIJU koja racuna broj bodova nekog tima
				//Pobeda nosi 4 boda
				//Nereseno nosi 2 boda
				//Poraz nosi 1 bod
				//Ispise izvrsiti iz main metode
				
				//Primer resenja
				//Unesite broj pobeda:
				//3
				//Unesite broj neresenih utakmica:
				//4
				//Unesite broj poraza:
				//2
				//Ekipa ima 22 bodova
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj pobeda: ");
		int brojPobeda = s.nextInt();
		System.out.print("Unesite broj neresenih utakmica: ");
		int brojNeresenih = s.nextInt();
		System.out.print("Unesite broj poraza: ");
		int brojPoraza = s.nextInt();
		
		int bodovi = brojBodova(brojPobeda, brojNeresenih, brojPoraza);
		
		System.out.println("Ekipa ima " + bodovi + " bodova.");
		
		

	}
	public static int brojBodova (int pobede, int nereseno, int porazi) {
		
		int brojBodova = (pobede*4) + (nereseno*2) + (porazi*1);
		
		return brojBodova;
		
		
	}

}

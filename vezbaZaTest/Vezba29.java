package vezbaZaTest;

import java.util.Scanner;

public class Vezba29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati kalkulator. Korisnik unosi dva broja i operaciju koju zeli da odradi s njima, 
		//a mi ispisujemo rezultat. Operacije su +,-,*,/,%
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite prvi broj: ");
		int prviBroj = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int drugiBroj = s.nextInt();
		System.out.print("Unesite operaciju: ");
		String operacija = s.next();
		
		double rezultat = kalkulator(prviBroj, drugiBroj, operacija);
		
		System.out.println("");
		System.out.println(prviBroj + " " + operacija + " " + drugiBroj + " = " + rezultat);

	}
	
	public static double kalkulator (int prviBroj, int drugiBroj, String operacija) {
		double rezultat = 0;
		
		switch (operacija) {
		case "+": {
			rezultat = prviBroj + drugiBroj;
		}			
			break;
		case "-": {
			rezultat = prviBroj - drugiBroj;
		}			
			break;
		case "*": {
			rezultat = prviBroj * drugiBroj;
		}			
			break;
		case "/": {
			rezultat = (double)prviBroj / drugiBroj;
		}			
			break;
		case "%": {
			rezultat = prviBroj % drugiBroj;
		}			
			break;

		
		}
		
		return rezultat;
	}

}

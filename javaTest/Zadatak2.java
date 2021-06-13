package javaTest;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji racuna potrosnju goriva
		//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
		//Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara na 100 kilometara,
		//kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km
		        
		//Primeri ispisa u konzoli:
		        
		//Molim vas unesite distancu u kilometrima:
		//134
		//Molim vas unesite tip vozila: 
		//Kombi
		//Kombi na 134.0 km potrosi 14.74 litara goriva
		//Primer ispisa kad se unese pogresno vozilo
		        
		//Molim vas unesite distancu u kilometrima:
		//133
		//Molim vas unesite tip vozila: 
		//Tenk
		//Uneli ste pogresan tip vozila
		Scanner s = new Scanner (System.in);
		
		System.out.println("Molim Vas unesite distancu u kilometrima: ");
		double distanca = s.nextDouble();
		System.out.println("Molim Vas unesite tip vozila: ");
		String tipVozila = s.next();
		double potrosnja = 0.0;
		
		switch (tipVozila) {
		case "Motor": {
			potrosnja = (distanca / 100) * 5;			
			System.out.println("Motor na " + distanca + "km potrosi " + potrosnja + " litara goriva.");
		}			
			break;
		case "Automobil": {
			potrosnja = (distanca / 100) * 7;			
			System.out.println("Automobil na " + distanca + "km potrosi " + potrosnja + " litara goriva.");
		}			
			break;
		case "Kombi": {
			potrosnja = (distanca / 100) * 11;			
			System.out.println("Kombi na " + distanca + "km potrosi " + potrosnja + " litara goriva.");
		}			
			break;
		case "Kamion": {
			potrosnja = (distanca / 100) * 15;			
			System.out.println("Kamion na " + distanca + "km potrosi " + potrosnja + " litara goriva.");
		}			
			break;

		default: {
			System.out.println("Uneli ste pogresan tip vozila.");
		}
			break;
		}		
		

	}

}

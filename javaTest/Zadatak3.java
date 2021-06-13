package javaTest;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisite program koji, koristeci petlju, 
		//racuna zbir unetih brojeva, sve dok korisnik ne unese 0
		//Primer ispisa resenja:
		//Molim vas unesite 1. broj
		//4
		//Trenutni zbir je 4
		//Molim vas unesite 2. broj
		//5
		//Trenutni zbir je 9
		//Molim vas unesite 3. broj
		//0
		//Uneli ste 0 Kraj programa
		Scanner s = new Scanner (System.in);
		
		int broj = 1;
		int redniBroj = 1;
		int suma = 0;
		
		while (broj != 0) {
			System.out.println("Molim Vas unesite " + redniBroj + ". broj");
			broj = s.nextInt();
			suma += broj;
			if (broj != 0) {
				System.out.println("Trenutni zbir je " + suma);
				redniBroj++;
			} else if (broj == 0) {
				System.out.println("Uneli ste 0. Kraj programa");
			}
		}

	}

}

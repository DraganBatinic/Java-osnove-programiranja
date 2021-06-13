package vezbaZaTest;

import java.util.Scanner;

public class Vezba26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati niz brojeva i prikazati aritmeticku sredinu niza
		Scanner s = new Scanner (System.in);
		
		System.out.print("Od koliko clanova zelite da formirate niz? ");
		int brojClanova = s.nextInt();
		int[] nizBrojeva = new int[brojClanova];
		int suma = 0;
		double avg = 0;
		
		for (int i = 0; i < brojClanova; i++) {
			System.out.print("Unesite " + (i+1) + ". clan niza: ");
			nizBrojeva[i] = s.nextInt();
		}
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			suma += nizBrojeva[i];
		}
		
		avg = (double)suma / nizBrojeva.length;
		
		System.out.println("Aritmeticka sredina unetog niza brojeva je: " + avg);
		
		

	}

}

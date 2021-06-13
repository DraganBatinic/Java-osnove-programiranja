package package7;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//napisati funkciju koja prima niz brojeva i vraca sumu svih brojeva niza
		//bonus zadatak: napisati dodatnu funkciju koja prima dva niza 
		//i vraca sumu svih elemenata iz oba niza
		Scanner s = new Scanner (System.in);
		
		System.out.print("Od koliko clanova zelite da kreirate prvi niz brojeva? ");
		int brojClanovaPrvogNiza = s.nextInt();
		int[] prviNizBrojeva = new int [brojClanovaPrvogNiza];
		
		System.out.println("Unesite brojeve prvog niza: ");
		for (int i = 0; i < prviNizBrojeva.length; i++) {			
			prviNizBrojeva[i] = s.nextInt();
		}
		
		int zbirBrojevaNiza = zbirClanovaNiza(prviNizBrojeva);
		System.out.println("");
		System.out.println("Zbir brojeva prvog niza iznosi: " + zbirBrojevaNiza);
		
		System.out.println("");
		System.out.print("Od koliko clanova zelite da kreirate drugi niz brojeva? ");
		int brojClanovaDrugogNiza = s.nextInt();
		int[] drugiNizBrojeva = new int [brojClanovaDrugogNiza];
		
		System.out.println("Unesite brojeve drugog niza: ");
		for (int i = 0; i < drugiNizBrojeva.length; i++) {			
			drugiNizBrojeva[i] = s.nextInt();
		}
		
		int zbirBrojevaObaNiza = zbirClanovaObaNiza(prviNizBrojeva, drugiNizBrojeva);
		System.out.println("");
		System.out.print("Zbir brojeva oba niza iznosi: " + zbirBrojevaObaNiza);		

	}
	
	public static int zbirClanovaNiza (int[] nizBrojeva) {
		int suma = 0;
		for (int i = 0; i < nizBrojeva.length; i++) {
			suma += nizBrojeva[i];
		}
		
		return suma;
	}
	
	public static int zbirClanovaObaNiza (int[] prviNizBrojeva, int[] drugiNizBrojeva) {
		int suma = 0;
		for (int i = 0; i < prviNizBrojeva.length; i++) {
			suma += prviNizBrojeva[i];
		}
		for (int i = 0;  i < drugiNizBrojeva.length; i++) {
			suma += drugiNizBrojeva[i];
		}
		
		return suma;
		
	}

}

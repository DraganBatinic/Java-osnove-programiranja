package package7;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Funkcija kao parametre prima osnovu i stepen, a za rezultat
//		vraca sracunatu vrednost.
	//
//		Primer: stepen(10, 4) ima za rezultat 10000
//		Primer: stepen(2, 3) ima za rezultat 8
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite osnovu: ");
		int osnova = s.nextInt();
		System.out.print("Unesite stepen: ");
		int stepen = s.nextInt();
		
		int rezultat = stepenovanje (osnova, stepen);
		
		System.out.println("Stepen (" + osnova + "," + stepen + ") ima za rezultat " + rezultat);
		
		

	}
	
	public static int stepenovanje (int osnova, int stepen) {
		
		int stepenovanaVrednost = 1;
		
		for (int i = 0; i < stepen; i++) {
			
			if (stepen < 1 && stepen >=0) {
				stepenovanaVrednost = stepenovanaVrednost;
				break;
			} else if (stepen > 0) {
			stepenovanaVrednost *= osnova;
			}
				
		}
		
		return stepenovanaVrednost;

	}

}
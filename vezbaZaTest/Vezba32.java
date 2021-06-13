package vezbaZaTest;

import java.util.Scanner;

public class Vezba32 {

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
		
		int stepenovanaVrednost = stepenovanje(osnova, stepen);
		
		System.out.println("Stepen (" + osnova + ", " + stepen + ") ima za rezultat " + stepenovanaVrednost);
		
		
		
				

	}
	public static int stepenovanje (int osnova, int stepen) {
		int rezultat = 1;
		
		for (int i = 0; i <= stepen; i++) {
			if (stepen == 0) {
				break;
			} else if (i < stepen) {
				rezultat *= osnova;
			}			
		}
		
		return rezultat;
		
	}

}

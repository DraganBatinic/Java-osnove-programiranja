package vezbaZaTest;

import java.util.Scanner;

public class Vezba18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Napisati program koji ucitava N brojeva
//		od korisnika i proverava da li se u
//		unetim brojevima nalazi broj K
//		(K takodje unosi korisnik)
	//  Kad korisnik unese broj K program ispise "Zeljeni broj je pronadjen"
	//  ako se ne nadje zeljeni broj ispise se poruka da "Zeljeni broj nije pronadjen"
		Scanner s = new Scanner (System.in);
		
		System.out.print("Koliko brojeva zelite da unesete? ");
		int n = s.nextInt();
		
		System.out.print("Unesite broj za proveru: ");
		int k = s.nextInt();
		
		int broj = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			broj = s.nextInt();
			if (broj == k) {
				System.out.println("Zeljeni broj je pronadjen.");
				break;
			} else if (i == n) {
				System.out.println("Zeljeni broj nije pronadjen.");
			}
		}		

	}

}

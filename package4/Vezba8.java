package package4;

import java.util.Scanner;

public class Vezba8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Napisati program koji ucitava N brojeva
        //  od korisnika i proverava da li se u
		//  unetim brojevima nalazi broj K
		//  (K takodje unosi korisnik)
		//  Kad korisnik unese broj K program ispise "Zeljeni broj je pronadjen"
		//  ako se ne nadje zeljeni broj ispise se poruka da "Zeljeni broj nije pronadjen"
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite koliko brojeva zelimo da unesemo: ");
		int N = s.nextInt();		
		int K = (int)(Math.random() * 101);		
		int unetiBroj;
		
		System.out.println(" ");
		
		for (int i = 1; i <= N; i++) {
			System.out.print("Unesite " + i + ". broj (1-100): ");
			unetiBroj = s.nextInt();
			if (unetiBroj == K) {
				System.out.println("Zeljeni broj je pronadjen.");
				break;
			} else if (i == N) {
				System.out.println(" ");
				System.out.println("Zeljeni broj nije pronadjen");
			}			

		}		
		
	}

}

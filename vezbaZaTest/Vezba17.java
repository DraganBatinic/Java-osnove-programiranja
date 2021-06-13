package vezbaZaTest;

import java.util.Scanner;

public class Vezba17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji ucitava N brojeva od korisnika
//		i ispisuje koliko je pozitivnih brojeva uneo. (edited) 
		Scanner s = new Scanner (System.in);
		
		System.out.print("Koliko brojeva zelite da unesete? ");
		int n = s.nextInt();
		int broj = 0;
		int brojac = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			broj = s.nextInt();
			if (broj > 0) {
				brojac ++;
			}
		}
		
		System.out.println("Uneto je " + brojac + " pozitivnih brojeva.");

	}

}

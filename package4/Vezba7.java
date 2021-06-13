package package4;

import java.util.Scanner;

public class Vezba7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji ucitava N broja od korisnika
		// i ispisuje koliko je pozitivnih brojeva uneo.
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite koliko brojeva zelimo da unesemo: ");
		int N = s.nextInt();
		int unetiBroj;
		int count = 0;

		for (int i = 1; i <= N; i++) {
			System.out.print("Unesite " + i + ". broj: ");
			unetiBroj = s.nextInt();
			if (unetiBroj > 0) {
				count += 1;
			}

		}
		if (count % 10 == 1 && (count < 10 || count > 20)) {
			System.out.println("Unet je " + count + " pozitivan broj.");
		} else if ((count % 10 == 2 || count % 10 == 3 || count % 10 == 4) && (count < 10 || count > 20)) {
			System.out.println("Uneto je " + count + " pozitivna broja.");
		} else {
			System.out.println("Uneto je " + count + " pozitivih brojeva.");
		}

	}

}

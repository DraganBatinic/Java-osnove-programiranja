package vezbaZaTest;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji racuna povrsinu kvadrata stranice a,
//		i povrsinu kruga poluprecnika r.
//		Povrsina kvadrata se racuna kao P = a x a
//		Povrsina kruga se racuna kao P = r x r x 3.14
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite duzinu stranice kvadrata a: ");
		int stranicaKvadrata = s.nextInt();
		
		System.out.println("");
		System.out.println("Povrsina kvadrata je: P = " + stranicaKvadrata + " x " + stranicaKvadrata + " = " + (stranicaKvadrata*stranicaKvadrata));
		
		System.out.println("");
		System.out.print("Unesite duzinu poluprecnika kruga r: ");
		int poluprecnikKruga = s.nextInt();
		
		System.out.println("");
		System.out.println("Povrsina kruga je: P = " + poluprecnikKruga + " x " + poluprecnikKruga + " x 3.14 = " + (poluprecnikKruga*poluprecnikKruga*3.14));

	}

}

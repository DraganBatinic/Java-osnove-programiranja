package package2;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji ucitava vrednosti a i b
//		sa tastature i pronalazi njihovu srednju vrednosti
//		I na kraju ispistuje tu vrednost.
		Scanner s = new Scanner (System.in);
		
		System.out.print("Uneti broj a: ");
		double a = s.nextDouble();
		System.out.print("Uneti broj b: ");
		double b = s.nextDouble();
		
		double avg = (a+b)/2;
		
		System.out.println("Srednja vrednost brojeva a i b iznosi: " + avg);

	}

}

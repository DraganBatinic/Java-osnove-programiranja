package package2;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uneti broj sa tastature i ispisati da li je pozitivan, negativan ili jednak nulu
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesi broj: ");
		double broj = s.nextDouble();
		
		if (broj > 0) {
			System.out.println("Broj je pozitivan.");
		} else if (broj < 0) {
			System.out.println("Broj je negativan.");
		} else {
			System.out.println("Broj je jednak nuli.");
		}

	}

}

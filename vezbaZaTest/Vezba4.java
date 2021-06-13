package vezbaZaTest;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unesite broj sa tastature, a program treba da ispise 
		//da li je broj jednocifren, dvocifren, cetvorocifren i veci
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj: ");
		int broj = s.nextInt();
		
		if (((broj / 10) == 0) && (broj != 0)) {
			System.out.println("Uneti broj " + broj + " je jednocifren.");
		} else if (((broj / 10) > 0 && (broj / 10) < 10) || ((broj / 10) < 0 && (broj / 10) > -10)) {
			System.out.println("Uneti broj " + broj + " je dvocifren.");
		} else if (((broj / 10) >= 10 && (broj / 10) < 100) || ((broj / 10) <= -10 && (broj / 10) > -100)) {
			System.out.println("Uneti broj " + broj + " je trocifren.");
		} else if (((broj / 10) >= 100) || ((broj / 10) <= -100) ) {
			System.out.println("Uneti broj " + broj + " je cetvorocifren ili veci.");
		} else {
			System.out.println("Uneti broj je 0");
		}
		

	}

}

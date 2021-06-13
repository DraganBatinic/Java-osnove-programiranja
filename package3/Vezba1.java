package package3;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sa tastature uneti redni broj od 1 do 7 
		//i u zavisnosti od toga ispisati: "Radni dan" (1-5), a za "Vikend" za unose 6 i 7
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj od 1 do 7: ");
		
		int broj = s.nextInt();
		
		if (broj >= 1 && broj <= 5) {
			System.out.println("Radni dan");
		} else if (broj == 6 || broj == 7) {
			System.out.println("Vikend");
		} else {
			System.out.println("Pogresan unos!");
		}
		
			

	}

}

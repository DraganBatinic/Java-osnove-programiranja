package package7;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Napisati funkciju koja od dva ulazna Stringa
		//		formira rezultujuci string.
		//		Parametri funkcije su
		//		firstStr, secondStr i swap(boolean)
		//		Ako se unesu vrednosti:
		//		firstStr = "xxx"
		//		secondStr = "zzz"
		//		swap = false
		//		Vraca string:
		//		"xxxzzz"
		//
		//		Ako se unesu vrednosti:
		//		firstStr = "xxx"
		//		secondStr = "zzz"
		//		swap = true
		//		Vraca string:
		//		"zzzxxx"
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite prvi string: ");
		String firstStr = s.next();
		System.out.print("Unesite drugi string: ");
		String secondStr = s.next();
		System.out.print("Da li zameniti mesto stringovima (Da/Ne)? ");
		String zamena = s.next();
		String kombinovaniString = "";
		boolean swap = true;
		if (zamena.equals("Da")) {
			swap = true;
		} else if (zamena.equals("Ne")) {
			swap = false;
		}
		
		kombinovaniString = rezultujuciString (firstStr, secondStr, swap);
		
		System.out.println(kombinovaniString);
	}
	
	public static String rezultujuciString (String firstStr, String secondStr, boolean swap) {
		
		String kombinovaniString = "";
		
		if (swap == true) {
			kombinovaniString = (secondStr + firstStr);
		} else if (swap == false) {
			kombinovaniString = (firstStr + secondStr);
		}
		
		return kombinovaniString;

	}
	
	

}

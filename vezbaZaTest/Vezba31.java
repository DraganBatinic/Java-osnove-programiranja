package vezbaZaTest;

import java.util.Scanner;

public class Vezba31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati funkciju koja od dva ulazna Stringa
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
		String prviString = s.next();
		System.out.print("Unesite drugi string: ");
		String drugiString = s.next();
		System.out.print("Da li zelite da stringovi zamene mesta u rezultujucem stringu? (Da/Ne) ");
		String zamena = s.next();
		boolean swap = true;
		
		if (zamena.equals("Da")) {
			swap = true;
		} else if (zamena.equals("Ne")) {
			swap = false;
		}
		
		String noviString = zamenaMesta(prviString, drugiString, swap);
		
		System.out.println("");
		System.out.println(noviString);
		

	}
	public static String zamenaMesta (String firstStr, String secondStr, boolean swap) {
		String rezultujuciString = " ";
		
		if (swap == true) {
			rezultujuciString = secondStr+firstStr;
		}
		if (swap == false) {
			rezultujuciString = firstStr+secondStr;
		}
		
		return rezultujuciString;
	}

}

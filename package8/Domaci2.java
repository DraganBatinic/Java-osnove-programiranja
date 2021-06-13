package package8;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati funkciju koja za parametre prima tri broja num1, num2 i num3 
		//i proverava da li je zbir num1 i num2 jednak num3.
		//Primer:
		//Ako se unese num1 = 2, num2 = 4, i num3 = 99 vraca false
		//Ako se unese num1 = 2, num2 = 4, i num3 = 6 vraca true
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite prvi broj: ");
		int prviBroj = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int drugiBroj = s.nextInt();
		System.out.print("Unesite treci broj: ");
		int treciBroj = s.nextInt();
		
		boolean zbirPrvogIDrugogJednakTrecem = zbirPrvogIDrugogBrojaJednakTrecem(prviBroj, drugiBroj, treciBroj);
		
		if (zbirPrvogIDrugogJednakTrecem == true) {
			System.out.println("Zbir prvog i drugog broja je jednak trecem.");
		} else {
			System.out.println("Zbir prvog i drugog broja nije jednak trecem.");
		}

	}
	public static boolean zbirPrvogIDrugogBrojaJednakTrecem (int num1, int num2, int num3) {
		boolean jednakost;
		if ((num1 + num2) == num3) {
			jednakost = true;
		} else {
			jednakost = false;
		}
		
		return jednakost;
	}

}

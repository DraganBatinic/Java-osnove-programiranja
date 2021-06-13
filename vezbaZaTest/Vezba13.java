package vezbaZaTest;

import java.util.Scanner;

public class Vezba13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji sabira
//		brojeve od 0 do broja koji ste uneli na tastaturi
//		i prikazuje sumu (ne u svakom koraku vec samo na na kraju)
//		Zbir svih brojeva od 0 do 3 je 6
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite jedan ceo broj: ");
		int broj = s.nextInt();
		int suma = 0;
		
		if (broj >= 0) {
			for (int i = 0; i <= broj; i++) {
				suma += i;
			}
		} else {
			for (int i = 0; i >= broj; i--) {
				suma += i;
			}
		}
		
		System.out.println("Zbir brojeva je " + suma);

	}

}

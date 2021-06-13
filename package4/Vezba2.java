package package4;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji sabira
//		brojeve od 0 do broja koji ste uneli na tastaturi
//		i prikazuje sumu (ne u svakom koraku vec samo na na kraju)
//		Zbir svih brojeva od 0 do 3 je 6
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite jedan broj: ");
		int broj = s.nextInt();
		
		int i = 0;
		int zbir = 0;
		
		if (broj > 0) {
			while (i <= broj) {
			zbir = zbir + i;
			i++;
			}
		System.out.println("Zbir svih brojeva od 0 do " + broj + " je " + zbir + ".");
		}
		
		if (broj < 0) {
			while (i >= broj) {
				zbir = zbir + i;
				i--;
			}
			System.out.println("Zbir svih brojeva od 0 do " + broj + " je " + zbir + ".");
		}
		
		if (broj == 0) {
			System.out.println("Zbir je 0");
		}
		

	}

}

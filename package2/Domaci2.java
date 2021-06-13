package package2;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		/*System.out.print("Unesite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.print("Unesite broj godina: ");
		int brojGodina = s.nextInt();
		
		int godiste = 2021 - brojGodina;
		
		System.out.println(" ");
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Godina rodjenja: " + godiste);*/
		
		System.out.print("Unesite broj godina: ");
		int brojGodina = s.nextInt();
		
		System.out.println(" ");
		
		if(brojGodina > 0 && brojGodina < 18) {
			System.out.println("Samo osobe starije od 18 godina mogu imati vozacku dozvolu.");
		} else if (brojGodina >= 18 && brojGodina <= 65) {
			System.out.println("Vasa prijava je prihvacena.");
		} else if (brojGodina > 65) {
			System.out.println("Korisnici stariji od 65 godina ne mogu polagati za vozacku dozvolu.");
		} else {
			System.out.println("Neispravan unos, pokusajte ponovo!");
		}
		
		
	}

}

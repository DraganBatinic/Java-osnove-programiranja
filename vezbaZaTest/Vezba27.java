package vezbaZaTest;

import java.util.Scanner;

public class Vezba27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//napisati funkciju koja stampa podatke o osobi. 
		//salju joj se ime, prezime i br godina, a funkcija to odstampa
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.print("Unesite broj godina: ");
		int brojGodina = s.nextInt();
		
		generalije(ime, prezime, brojGodina);
	

	}
	public static void generalije (String ime, String prezime, int brojGodina) {
		System.out.println(" ");
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Broj godina: " + brojGodina);
	}

}

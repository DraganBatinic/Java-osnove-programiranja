package vezbaZaTest;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program gde korisnik unese kroz skener 
		//neko ime, prezime i broj godina, a program stampa 
		//ime, prezime i godinu u kojoj je korisnik rodjen (godiste).
		Scanner s = new Scanner (System.in);
		
		String ime = s.next();
		String prezime = s.next();
		int brojGodina = s.nextInt();
		int trenutnaGodina = s.nextInt();
		
		int godinaRodjenja = trenutnaGodina - brojGodina;
		
		System.out.println(ime + " " + prezime + " " + godinaRodjenja);
		
		

	}

}

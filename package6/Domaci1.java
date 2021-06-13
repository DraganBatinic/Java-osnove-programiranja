package package6;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program gde korisnik unese ime, prezime i pol 
		//(preko void metode) a main metoda stampa i 
		//vraca "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.print("Unesite pol (muski / zenski): ");
		String pol = s.next();
		
		String pozdravnaPoruka = generalije(pol);
		System.out.println(pozdravnaPoruka);

	}
	
	public static String generalije (String polKorisnika) {
		String pozdravnaPoruka;		
		if (polKorisnika.equals("muski")) {
			pozdravnaPoruka = "Dobrodosao u IT!";			
		} else if (polKorisnika.equals("zenski")) {
			pozdravnaPoruka = "Dobrodosla u IT!";			
		} else {
			pozdravnaPoruka = "Pogresan unos, pokusajte ponovo!";
		}
		
		return pozdravnaPoruka;
	}

}

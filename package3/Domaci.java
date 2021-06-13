package package3;

import java.util.Scanner;

public class Domaci {

	public static void main(String[] args) {
		
	    /*//Napisati program koji od korisnika trazi 
		  //unos broja dana u jednom mesecu i da za rezultat ispise koliko meseci 
		  //u godini ima toliko dana.
		  //Primer. korisnik unese 31 a program vrati rezultat "7 meseci u godini ima 31 dan"

		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj dana u mesecu: ");
		
		int brojDanaUMesecu = s.nextInt();
		
		switch (brojDanaUMesecu) {
		case 28 : {
			System.out.println("Jedan mesec u godini ima " + brojDanaUMesecu + " dana");
		}			
			break;
		case 29 : {
			System.out.println("Jedan mesec u godini ima " + brojDanaUMesecu + " dana");
		}			
			break;
		case 30 : {
			System.out.println("Cetiri meseca u godini ima " + brojDanaUMesecu + " dana");
		}			
			break;
		case 31 : {
			System.out.println("Sedam meseci u godini ima " + brojDanaUMesecu + " dan");
		}			
			break;

		default: {
			System.out.println("Pogresan unos, pokusajte ponovo!");
		}
			break;
		}*/
		
		
		
		
		// TODO Auto-generated method stub
		//Napisati program koji od korisnika trazi da unese dan u celoj godini 
		//a da za rezultat dobije kojoj nedelja pripada taj dan u godini.
		//Primer. korisnik unese 75 a program kao rezultat vrati "11. nedelja u godini"
		//Napomena: Racunajte da je prvi dan u godini ponedeljak.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite redni broj dana u godini: ");
		int redniBrojDana= s.nextInt();
		
				
		int i = 1;		
		int nedelja = 1;
		int pomocna = 0;
		
		if (redniBrojDana < 1 || redniBrojDana > 366) {
			System.out.println("Pogresan unos, pokusajte ponovo!");
		}
		
		while (i <= redniBrojDana) {					
			pomocna++;
			i++;
			if (pomocna > 7) {
				nedelja++;
				pomocna = 1;
			}			
						    						
		}
		
		if (i > redniBrojDana && i > 1 && i < 368) {
			System.out.println(redniBrojDana + " pripada " + nedelja + ". nedelji u godini.");
		}
	}	
}
	



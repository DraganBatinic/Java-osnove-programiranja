package vezbaZaTest;

import java.util.Scanner;

public class Vezba11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji od korisnika trazi da unese dan u celoj godini 
		//a da za rezultat dobije kojoj nedelja pripada taj dan u godini.
		//Primer. korisnik unese 75 a program kao rezultat vrati "11. nedelja u godini"
		//Napomena: Racunajte da je prvi dan u godini ponedeljak.
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite redni broj dana u godini: ");
		int redniBrojDana = s.nextInt();
		
		int nedeljaUGodini = 1;
		int brojac = 0;
		
		for (int i = 1; i <= 366; i++) {
			brojac++;			
			if (brojac == 8) {
				nedeljaUGodini++;
				brojac = 1;				
			}
			if (i == redniBrojDana) {
				break;
			}
		}
		
		if ((redniBrojDana < 1) || (redniBrojDana > 366)) {
			System.out.println("Pogresan unos!");
		} else {
			System.out.println(redniBrojDana + ". dan u godini pripada " + nedeljaUGodini + ". nedelji.");
		}

	}

}

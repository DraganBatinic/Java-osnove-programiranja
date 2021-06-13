package package6;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program gde korisnik preko skenera unese 
		//brojeve od 1 do 10 (ukljucujuci 1 i 10) i program 
		//mu vrati odgovor da li je broj prost ili ne. 
		//(Prost broj je onaj koji je deljiv samo sa brojem 1 i sa sobom)
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj od 1 do 10: "); 
		// Ogranicio sam deklarativno unos brojeva na brojeve od 1 do 10, u skladu sa zahtevom zadatka
		//ali, program radi za bilo koji broj
		int broj = s.nextInt();
		
		String prostBrojTest = prostBroj(broj);
		
		System.out.println("");
		System.out.print("Uneli ste broj " + broj + ". ");
		System.out.println(prostBrojTest);		

	}
	
	public static String prostBroj (int broj) {
		 
		String prostBr = " ";
		
		if (broj <= 0) {
			prostBr = "Pogresan unos, unesite pozitivan ceo broj!";
		}
		
		for (int i = broj-1; i >= 0; i--) {			
			
			if (i >= 10) {
				prostBr = "Pogresan unos, Unesite broj od 1 do 10!";
				break;
			}
			//ako se zakomentarise if statement, od linije 38 do 41, program radi za bilo koji pozitivan broj
			if ((i > 1) && (broj % i == 0)) {
				prostBr = "Uneti broj nije prost.";
				break;			
			} else if ((i > 1) && (broj % i != 0)){
				prostBr = "Uneti broj je prost.";				
			} else if (i == 1 || i == 0 ) {
				prostBr = "Uneti broj je prost.";				
			}
			
		}
		
		 return prostBr;
		 
	}

}

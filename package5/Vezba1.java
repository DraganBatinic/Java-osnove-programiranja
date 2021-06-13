package package5;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati zadatak koji za uneti dvocifreni broj napise koja je prva cifra, a koja druga
		// primer ispisa:
		//uneli ste 35
		//prvi broj je 3
		//drugi broj je 5
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite jedan dvocifreni broj: ");
		int dvocifreniBroj = s.nextInt();
		
		int prvaCifra = dvocifreniBroj / 10;
		int drugaCifra = dvocifreniBroj % 10;
		
		if (dvocifreniBroj < 10 || dvocifreniBroj > 99) {
			System.out.println("Pogresan unos, pokusajte ponovo!");
		} else {
			System.out.println("Unetom dvocifrenom broju " + dvocifreniBroj + " prva cifra je " + prvaCifra + ", a druga cifra je " + drugaCifra);
		}
		
		

	}

}

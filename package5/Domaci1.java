package package5;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati niz brojeva i prikazati aritmeticku sredinu niza
		
		/*double[] nizBrojeva = {1.5, 45, -36.84, 72.01, -325, 222.89, -85, 101.3251};
		double suma = 0;
				
		for (int i = 0; i < nizBrojeva.length; i++) {
			suma += nizBrojeva[i];
		}
		double prosecnaVrednost = suma / nizBrojeva.length;
		
		System.out.println("Prosecna vrednost elemenata niza brojeva je: " + prosecnaVrednost);*/
		
		// Odlucio sam se za double niz brojeva, jer smo komotniji u nekoj eventualnoj izmeni 
		//dalje u programu, jer mozemo upisivati i cele i decimalne brojeve	
		Scanner s = new Scanner (System.in);
		
		double[] nizBrojeva = new double[8];
		double suma = 0;
		
		System.out.println("Unesite niz od 8 brojeva: ");
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = s.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("Uneli ste sledeci niz brojeva: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			suma += nizBrojeva[i];
			if (i == (nizBrojeva.length - 1)) {
				System.out.println(nizBrojeva[i] + ".");
			} else {
				System.out.print(nizBrojeva[i] + ", ");
			}
		}
		double prosecnaVrednost = suma / nizBrojeva.length;
		
		System.out.println();
		
		System.out.println("Prosecna vrednost elemenata unetog niza brojeva je: " + prosecnaVrednost);

	}

}

package package5;

public class Vezba6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji svaki element niza
//		povecava za vrednost pozicije na kojoj se
//		element nalazi. Vrednosti i broj elemenata niza su proizvoljni
//		Primer izvrsenja:
//		niz = {1, 5, 7, -1, 4}
//		Nakon izvrsenja programa:
//		niz = {1, 6, 9, 2, 8}
//		Kako je ovaj niz dobijen?
//		niz = {1+0, 5+1, 6+2, -1+3, 4+4}
		
		int[] nizBrojeva = {12, 1, 3, -8, 90, -14};
		
		System.out.print("Elementi niza pre promene su: ");
		for (int i = 0; i < nizBrojeva.length; i++) {				
			if (i == (nizBrojeva.length - 1)) {
				System.out.println(nizBrojeva[i] + ".");
			} else {
				System.out.print(nizBrojeva[i] + ", ");
			}
		}
		
		System.out.print("Elementi niza posle promene su: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = nizBrojeva[i] + i;
			if (i == (nizBrojeva.length - 1)) {
				System.out.println(nizBrojeva[i] + ".");
			} else {
				System.out.print(nizBrojeva[i] + ", ");
			}
		}
				

	}

}

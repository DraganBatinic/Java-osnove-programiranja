package vezbaZaTest;

public class Vezba25 {

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
		
		int[] nizBrojeva = {1, 34, 56, 3, 14, 12};
		int[] izmenjeniNizBrojeva = new int[nizBrojeva.length];
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			izmenjeniNizBrojeva[i] = nizBrojeva[i] + i;
		}
		
		System.out.println("Niz brojeva je: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.println(nizBrojeva[i]);
		}
		
		System.out.println("Izmenjeni niz brojeva je: ");
		for (int i = 0; i < izmenjeniNizBrojeva.length; i++) {
			System.out.println(izmenjeniNizBrojeva[i]);
		}

	}

}

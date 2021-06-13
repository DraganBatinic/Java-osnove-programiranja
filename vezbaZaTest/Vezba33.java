package vezbaZaTest;

public class Vezba33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//napisati funkciju koja prima niz brojeva i vraca sumu svih brojeva niza
		//bonus zadatak: napisati dodatnu funkciju koja prima dva niza 
		//i vraca sumu svih elemenata iz oba niza
		
		int[] prviNizBrojeva = {23, 13, 1, 23, 45, 0, 3};
		int[] drugiNizBrojeva = {12, 56, 9, 44, 21, 78};
		
		int zbir = zbirClanovaNiza(prviNizBrojeva);
		int zbirDvaNiza = zbirClanovaDvaNiza(prviNizBrojeva, drugiNizBrojeva);
		
		System.out.println(zbir);
		System.out.println("");
		System.out.println(zbirDvaNiza);
		
	}
	public static int zbirClanovaNiza (int[] niz) {
		int suma = 0;
		
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		
		return suma;
	}
	public static int zbirClanovaDvaNiza (int[] prviNiz, int [] drugiNiz) {
		int suma = 0;
		
		for (int i = 0; i < prviNiz.length; i++) {
			suma += prviNiz[i];
		}
		for (int i = 0; i < drugiNiz.length; i++) {
			suma += drugiNiz[i];
		}
		
		return suma;
		
	}

}

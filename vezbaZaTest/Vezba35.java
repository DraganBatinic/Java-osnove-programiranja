package vezbaZaTest;

public class Vezba35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napraviti niz od 10 brojeva
				//Napraviti petlju koja ce ispisati elemete niza koji su deljivi sa 3
				
				//Primer niza: {9,11,15,23,25,43,78,87,92,3}
				//Primer ispisa resenja:
				//Elementiu niza koji su deljivi sa 3 su:
				//9
				//15
				//78
				//87
				//3
		//bonus zadatak, napravite funkciju koja prima niz, 
		//a vraca niz koji sacinjavaju samo element prosledjenog niza koji su deljivi sa 3
		
		int[] nizBrojeva = {9,11,15,23,25,43,78,87,92,3};
		
		int[] clanoviNizaDeljiviSaTri = nizBrojevaDeljivihSaTri(nizBrojeva);
		
		System.out.print("Clanovi niza koji su deljivi sa tri: ");
		
		for (int i = 0; i < clanoviNizaDeljiviSaTri.length; i++) {
			System.out.print(clanoviNizaDeljiviSaTri[i] + " ");
		}

	}
	public static int[] nizBrojevaDeljivihSaTri (int[] nizBrojeva) {
		int index = 0;
		int brojac = 0;
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			if (nizBrojeva[i] % 3 == 0) {
				brojac++;
			}
		}
		
		int[] deljiviSaTri = new int[brojac];
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			if (nizBrojeva[i] % 3 == 0) {				
				deljiviSaTri[index] = nizBrojeva[i];				
				index++;
			}
		}
		
		return deljiviSaTri;
	}

}

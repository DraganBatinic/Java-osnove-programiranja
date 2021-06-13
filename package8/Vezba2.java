package package8;

public class Vezba2 {

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
		//bonus zadatak, napravite funkciju koja prima niz, a vraca niz 
		//koji sacinjavaju samo element prosledjenog niza koji su deljivi sa 3
		
		int[] nizBrojeva = {23, 33, 45, 56, 87, 99, 3, 5, 41, 75};
		
		System.out.println("Elementi niza koji su deljivi sa 3 su: ");
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			if (nizBrojeva[i] % 3 == 0) {
				System.out.println(nizBrojeva[i]);
			}
		}
		
		int [] brojeviNizaDeljiviSaTri = nizBrojevaDeljivihSaTri(nizBrojeva);
		
		System.out.println("Elementi niza iz funkcije su: ");
		for (int i = 0; i < brojeviNizaDeljiviSaTri.length; i++) {
			System.out.println( brojeviNizaDeljiviSaTri[i]);
		}
		
		

	}
	
	public static int[] nizBrojevaDeljivihSaTri (int[] primljenNiz) {
		int [] deljiviSaTri;
		int brojac = 0;
		for (int i = 0; i < primljenNiz.length; i++) {
			if (primljenNiz[i] % 3 == 0) {
				brojac +=1;
			}
		}
		
		deljiviSaTri = new int [brojac];
		
		int index = 0;
		for (int i = 0; i < primljenNiz.length; i++) {
			if (primljenNiz[i] % 3 == 0) {
				deljiviSaTri[index] = primljenNiz[i];
				index+=1;
			}
		}
		
		return deljiviSaTri;
			
	}

}

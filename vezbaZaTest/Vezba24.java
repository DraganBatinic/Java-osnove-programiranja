package vezbaZaTest;

public class Vezba24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//u ovom nizu brojeva ispisite koji je najmanji broj 
		//(koristite niz iz primera sto sam vam poslao) (edited) 
		//int[] nizBrojeva = {3, 34, 8, 1,5,67};
		
		int[] nizBrojeva = {3, 34, 8, 15,5,-67};
		
		int najmanjiBroj = nizBrojeva[0];
		
		for (int i = 0; i < nizBrojeva.length; i++) {
			if (nizBrojeva[i] < najmanjiBroj) {
				najmanjiBroj = nizBrojeva[i];
			}
		}
		
		System.out.println("Najmanji broj u nizu je :" + najmanjiBroj);

	}

}

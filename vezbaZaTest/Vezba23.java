package vezbaZaTest;

public class Vezba23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dane u nedelji stavite u niz, a zatim ih sve ispisite
		
		String[] daniUNedelji = {"ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja"};
		
		System.out.print("Dani u nedelji su: ");
		for (int i = 0; i < daniUNedelji.length; i++) {
			if (i == daniUNedelji.length - 1) {
				System.out.println(daniUNedelji[i] + ".");
			} else {
				System.out.print(daniUNedelji[i] + ", ");
			}
		}

	}

}

package package5;

public class Vezba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dane u nedelji stavite u niz, a zatim ih sve ispisite
		
		/*String[] daniUNedelji = new String[7];
		
		daniUNedelji[0] = "ponedeljak";
		daniUNedelji[1] = "utorak";
		daniUNedelji[2] = "sreda";
		daniUNedelji[3] = "cetvrtak";
		daniUNedelji[4] = "petak";
		daniUNedelji[5] = "subota";
		daniUNedelji[6] = "nedelja";
		
		System.out.print("Dani u nedelji su: ");
		for (int i = 0; i < daniUNedelji.length; i++) {
			if(i == (daniUNedelji.length - 1)) {
				System.out.print(daniUNedelji[i] + ". ");
			} else {
			System.out.print(daniUNedelji[i] + ", ");	
			}
		}*/
		
		String[] daniUNedelji = {"ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja"};
		
		System.out.print("Dani u nedelji su: ");
		for (int i = 0; i < daniUNedelji.length; i++) {
			if(i == (daniUNedelji.length - 1)) {
				System.out.print(daniUNedelji[i] + ". ");
			} else {
			System.out.print(daniUNedelji[i] + ", ");	
			}
		}
		
		

	}

}

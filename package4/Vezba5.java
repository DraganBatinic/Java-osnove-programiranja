package package4;

public class Vezba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji stampa sve parne
//		brojeve u opsegu od 3 do 33
		
		int brojac = 1;
		
		for (int i = 3; i <= 33; i++) {
			if (i % 2 == 0) {
				System.out.println(brojac + ". paran broj je " + i);
				brojac++;
			}
			
		}

	}

}

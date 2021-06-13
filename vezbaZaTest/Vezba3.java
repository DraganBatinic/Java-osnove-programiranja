package vezbaZaTest;

public class Vezba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ako jedna stranica trougla iznosi 5 cm, druga iznosi 10 cm, koliko iznosi treca stranica?
		//(za ovo ce vam trebati mozda malo guglanja ali nema mnogo pisanja, 
		//koristi se Pitagorina teorema. Funkcija za koren 
		//je "math.sqrt(promenljiva)" ili "sqrt(promenljiva)"
		
		int a = 5;
		int b = 10;
		double c = Math.hypot(a, b);
		
		System.out.println("Ako je u pravouglom trouglu stranica a = " + a + 
							"cm, stranica b = " + b + "cm, onda je stranica c = " + c + "cm.");

	}

}

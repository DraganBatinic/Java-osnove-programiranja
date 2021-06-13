package vezbaZaTest;

public class Vezba9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sabrati svaki 5. broj od 10 do 50, ukljucujuci i 10 i 50
		
		int broj = 10;
		int suma = 0;
		
		while (broj <= 50) {
			suma+=broj;
			broj+=5;
		}
		
		System.out.println("zbir brojeva je " + suma);
		

	}

}

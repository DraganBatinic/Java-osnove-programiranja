
public class Vezba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sabrati svaki 5. broj od 10 do 50, ukljucujuci i 10 i 50
		
		int i = 10;
		int zbir = 0;
		
		while (i <= 50) {
			zbir = zbir + i;
			System.out.println("i je " + i + " , a trenutni zbir je " + zbir);
			i+=5;
		}
		

	}

}

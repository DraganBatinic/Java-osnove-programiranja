package package3;

public class Vezba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//napisati program koji ispisuje svaki peti broj izmedju 10 i 50
		//(takodje ispisuje koji put ste usli u petlju)
		// primer resenja je:
		//vrednost promenljive je 10 usao sam u petlju 1.put
		// vrednost promenljive je 15 usao sam u petlju 2.put
		//...sve tako do 50 (ukljucujuci i 50)
		
		int n = 10;
		int i = 1;
		
		while (n <=50) {
			System.out.println("Vrednost promenljive je " + n + " i usao sam u petlju " + i +". put.");
			n+=5;
			i++;
		}
		
		System.out.println(" ");
		System.out.println("Kraj programa.");

	}

}

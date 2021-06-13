package vezbaZaTest;

public class Vezba8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//napisati program koji ispisuje svaki peti broj izmedju 10 i 50
		//(takodje ispisuje koji put ste usli u petlju)
		// primer resenja je:
		//vrednost promenljive je 10 usao sam u petlju 1.put
		// vrednost promenljive je 15 usao sam u petlju 2.put
		//...sve tako do 50 (ukljucujuci i 50)
		
		/*int broj = 10;
		int i = 1;
		
		while (broj <= 50) {
			System.out.println("Vrednost promenljive je " + broj + ", usao sam u petlju " + i + ". put.");
			broj+=5;
			i++;
		}*/
		
		int n = 1;
		
		for (int i =10; i <= 50; i+=5) {
			System.out.println("Vrednost promenljive je " + i + ", usao sam u petlju " + n + ". put.");
			n++;
		}

	}

}

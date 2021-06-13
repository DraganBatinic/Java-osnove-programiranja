package package1;

public class Vezba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji racuna povrsinu kvadrata stranice a,
//		i povrsinu kruga poluprecnika r.
//		Povrsina kvadrata se racuna kao P = a x a
//		Povrsina kruga se racuna kao P = r x r x 3.14
		
		//Prvi nacin
		int a = 5;
		int r = 6;
		
		System.out.println("Povrsina kvadrata cija je stranica " + a + " iznosi " + (a*a));
		System.out.println("Povrsina kruga ciji je poluprecnik "+ r + " iznosi " + (r*r*3.14));
		
		//Drugi nacin
		int povrsinaKvadrata = a*a;
		double povrsinaKruga = r*r*3.14;
		
		System.out.println("Povrsina kvadrata cija je stranica " + a + " iznosi " + povrsinaKvadrata);
		System.out.println("Povrsina kruga ciji je poluprecnik "+ r + " iznosi " + povrsinaKruga);
	}

}

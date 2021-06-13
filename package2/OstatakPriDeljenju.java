package package2;

import java.util.Scanner;

public class OstatakPriDeljenju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesi broj: ");
		double broj = s.nextDouble();
		
		
		
		if (broj == 0) {
			System.out.println("Broj je nula");
		} else if ((broj % 2) != 0) {
			System.out.println("Broj je neparan");
		} else if ((broj % 2) == 0) {
			System.out.println("Broj je paran");
		}
		

	}

}

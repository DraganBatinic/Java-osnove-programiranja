package vezbaZaTest;

import java.util.Scanner;

public class Vezba7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji na osnovu vaseg unosa stringa opisuje godisnje doba
		//Primer: uneli ste Zima a program je ispisao Zima je hladna i tada uglavnom pada sneg
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite godisnje doba: ");
		String godisnjeDoba = s.next();
		
		switch (godisnjeDoba) {
		case "Zima": {
			System.out.println(godisnjeDoba + " je hladna");
		}			
			break;
		case "Prolece": {
			System.out.println(godisnjeDoba + " je toplije.");
		}			
			break;
		case "Leto": {
			System.out.println(godisnjeDoba + " je vrelo.");
		}			
			break;
		case "Jesen": {
			System.out.println(godisnjeDoba + " je kisovita.");
		}			
			break;

		default: {
			System.out.println("Pogresan unos!");
		}
			break;
		}

	}

}

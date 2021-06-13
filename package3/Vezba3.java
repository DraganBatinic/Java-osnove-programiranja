package package3;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji na osnovu vaseg unosa stringa opisuje godisnje doba
		//Primer: uneli ste Zima a program je ispisao Zima je hladna i tada uglavnom pada sneg
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite godisnje doba (prvo slovo veliko): ");
		String godisnjeDoba = s.next();
		
		switch (godisnjeDoba) {
		case "Zima": {
			System.out.println(godisnjeDoba + " je hladna i tada uglavnom pada sneg.");
		}			
			break;
		case "Prolece": {
			System.out.println(godisnjeDoba + " je toplije i tada sve cveta.");
		}			
			break;
		case "Leto": {
			System.out.println(godisnjeDoba + " je veoma toplo i tada se ide na more.");
		}			
			break;
		case "Jesen": {
			System.out.println(godisnjeDoba + " je hladnija, pocinju da padaju kise i opada lisce.");
		}			
			break;

		default: {
			System.out.println("Pogresan unos, pokusajte ponovo!");
		}
			break;
		}

	}

}

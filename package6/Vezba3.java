package package6;

import java.util.Scanner;

public class Vezba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati kalkulator. Korisnik unosi dva broj i operaciju 
		//koju zeli da odradi s njima, a mi ispisujemo rezultat. Operacije su +,-,*,/,%
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite prvi broj: ");
		double prviBroj = s.nextDouble();
		System.out.print("Unesite racunsku operaciju (+, -, *, /, %): ");
		String operator = s.next();
		System.out.print("Unesite drugi broj: ");
		double drugiBroj = s.nextDouble();
		
		double rezultat = kalkulator(operator, prviBroj, drugiBroj) ;
		System.out.println("Rezultat je: " + rezultat ); 

	}
	public static double kalkulator (String operator, double prviBroj, double drugiBroj) {
		double operacijaNadBrojevima = 0;
		if ( operator.equals("+")) {
			operacijaNadBrojevima = prviBroj + drugiBroj;
		} else if (operator.equals("-")) {
			operacijaNadBrojevima = prviBroj - drugiBroj;
		} else if (operator.equals("*")) {
			operacijaNadBrojevima = prviBroj * drugiBroj;
		} else if (operator.equals("/")) {
			operacijaNadBrojevima = prviBroj / drugiBroj;
		} else if (operator.equals("%")) {
			operacijaNadBrojevima = prviBroj % drugiBroj;
		} 
		 return operacijaNadBrojevima;
	}
	

}

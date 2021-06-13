package package3;
import java.util.Scanner;
public class SwitchString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unesite dan u nedelji: ");
		Scanner s = new Scanner(System.in);
		String danUNedelji = s.next();
		switch (danUNedelji) {
		case "Ponedeljak": {
			System.out.println(danUNedelji + " je 1. dan u nedelji");
			break;
		}
		case "Utorak": {
			System.out.println(danUNedelji + " je 2. dan u nedelji");
			break;
		}
		case "Sreda": {
			System.out.println(danUNedelji + " je 3. dan u nedelji");
			break;
		}
		case "Cetvrtak": {
			System.out.println(danUNedelji + " je 4. dan u nedelji");
			break;
		}
		case "Petak": {
			System.out.println(danUNedelji + " je 5. dan u nedelji");
			break;
		}
		case "Subota": {
			System.out.println(danUNedelji + " je 6. dan u nedelji");
			break;
		}
		case "Nedelja": {
			System.out.println(danUNedelji + " je 7. dan u nedelji");
			break;
		}
		default:{
			System.out.println("Nevalidan unos");
			break;
			}
		}
	}
}

package package2;

public class IF_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 23;
		if(a > 15) {
			System.out.println(a + " je vece od 15");
			System.out.println("i ovo je napisano");
		}else if (a < 15) {
			System.out.println(a + " je manje od 15");
		}else if (a == 15) {
			System.out.println(a + " je jednako sa 15");
		}
		System.out.println("text posle if-a");
	}


}



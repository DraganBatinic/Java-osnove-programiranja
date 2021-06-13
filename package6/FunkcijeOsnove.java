package package6;

public class FunkcijeOsnove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Trenutno sam u main metodi");
		//System.out.println();
		//ispisiNesto();
		//System.out.println();
		//ispisiNesto("Dragane");//U zagradi se zove parametar
		//System.out.println();
		//ispisiNesto(5);
		//System.out.println();
		//ispisiNesto("Dragan", 56);
		//System.out.println();
		//int suma = sabiranjeDvaBroja(3, 5);
		//System.out.println("Zbir iz funkcije je: " + suma);
		
		//String rezultatFunkcije = daLiJePunoletan(41);
		//System.out.println("Dragan je " + rezultatFunkcije + ".");
		
		

	}
	
	public static void ispisiNesto() //zaglavlje funkcije
	{
		System.out.println("Ispisujem iz funkcije"); //telo funkcije
	}
	
	public static void ispisiNesto(String argument1) //zaglavlje funkcije ... u zagradi je argument
	{
		System.out.println("Ispisujem iz funkcije (sa string argumentom), " + argument1); //telo funkcije
		ispisiNesto();//moze funkcija da se zove i iz druge funkcije
	}
	
	public static void ispisiNesto(int argument1) //zaglavlje funkcije ... u zagradi je argument
	{
		System.out.println("Ispisujem iz funkcije (sa int argumentom), " + argument1); //telo funkcije		
	}
	
	public static void ispisiNesto(String argument1, int argument2) //zaglavlje funkcije ... u zagradi je argument
	{
		System.out.println("Ispisujem iz funkcije (sa dva argumenta), argument1 " + argument1 +
				", argument2 " + argument2); //telo funkcije		
	}
	
	public static int sabiranjeDvaBroja(int prviBroj, int drugiBroj) //zaglavlje funkcije ... u zagradi je argument
	{
		int zbir = prviBroj + drugiBroj;
		return zbir;
	}
	
	public static String daLiJePunoletan(int brojGodina) //zaglavlje funkcije ... u zagradi je argument
	{
		String punoletstvo;
		if (brojGodina >= 18) {
			punoletstvo = "punoletan";
		} else {
			punoletstvo = "maloletan";
		}
		return punoletstvo;
	}
}

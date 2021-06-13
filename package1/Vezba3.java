package package1;

public class Vezba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji
//		cuva podatke o korisniku(Ime, Prezime, Email, godinuRodjenja, fakultet, prosecnu ocenu, omiljeno slovo i informaciju da li voli programiranje),
//		i stampa podatke u formatu
//		Ime: Milan
//		Prezime: Jovanovic
//		Email: milan@gmail.com
//		godina rodjenja: 1988
//		fakultet: Ekonomski
//		prosecna ocena: 8.57
//		omiljeno slovo: V
//		da li voli programiranje: TRUE
		
		String ime, prezime, email, fakultet;
		int godinaRodjenja;
		double prosecnaOcena;
		char omiljenoSlovo;
		boolean ljubavPremaProgramiranju;
		
		ime = "Dragan";
		prezime = "Batinic";
		email = "gadza79@gmail.com";
		godinaRodjenja = 1979;
		fakultet  = "Vojna Akademija, smer Ratna mornarica";
		prosecnaOcena = 9.14;
		omiljenoSlovo = 'Y';
		ljubavPremaProgramiranju = true;
		
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Email: " + email);
		System.out.println("Godina rodjenja: " + godinaRodjenja);
		System.out.println("Fakultet: " + fakultet);
		System.out.println("Prosecna ocena: " + prosecnaOcena);
		System.out.println("Omiljeno slovo: " + omiljenoSlovo);
		System.out.println("Da li voli programiranje: " + ljubavPremaProgramiranju);
				

	}

}

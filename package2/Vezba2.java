package package2;

import java.util.Scanner;

public class Vezba2 {

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
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Uneti ime: ");
		String ime = s.nextLine();
		System.out.println("Uneti prezime: ");
		String prezime = s.nextLine();
		System.out.println("Uneti e-mail: ");
		String email = s.nextLine();
		System.out.println("Uneti godinu rodjenja: ");
		int godinaRodjenja = Integer.valueOf(s.nextInt());
		System.out.println("Uneti fakultet: ");
		String fakultet = s.nextLine();
		System.out.println("Uneti prosecnu ocenu: ");
		double prosek = Double.valueOf(s.nextLine());
		System.out.println("Uneti omiljeno slovo: ");
		String slovo = s.nextLine();
		System.out.println("Da li volis programiranje: ");
		boolean ljubav = Boolean.valueOf(s.nextBoolean());
		
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Email: " + email);
		System.out.println("Godina rodjenja: " + godinaRodjenja);
		System.out.println("Fakultet: " + fakultet);
		System.out.println("Prosecna ocena: " + prosek);
		System.out.println("Omiljeno slovo: " + slovo);
		System.out.println("Da li voli programiranje: " + ljubav);
		
		

	}

}

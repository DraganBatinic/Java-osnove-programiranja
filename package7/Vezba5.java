package package7;

import java.util.Scanner;

public class Vezba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// definisati niz 5 imena
		// definisati niz 5 prezimena
		// definisati niz 5 fakulteta
		// definisati niz 5 proseka
		// definisati niz 5 godina
		//napraviti funkciju koja stampa
		// Ime i Prezime je zavrsio/la fakulte ima fakulteta
		//sa prosecnom pocenom prosecna ocena a rodjen je godina
		//funkciju pozvati 5 puta (iteracijama)
		Scanner s = new Scanner (System.in);
		
		String[] ime = new String[5];
		String[] prezime = new String[5];
		String[] fakultet = new String[5];
		double[] prosek = new double[5];
		int[] godinaRodjenja = new int[5];
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("");
			System.out.print("Ime: ");
			ime[i] = s.next();
			System.out.print("Prezime: ");
			prezime[i] = s.next();
			System.out.print("Fakultet: ");
			fakultet[i] = s.next();
			System.out.print("Prosek: ");
			prosek[i] = s.nextDouble();
			System.out.print("Godina rodjenja: ");
			godinaRodjenja[i] = s.nextInt();
		}
		
		System.out.println("");
		for(int i=0;i<5;i++)
		{
			stampaj(ime[i],prezime[i],fakultet[i],prosek[i],godinaRodjenja[i]);
		}
	}
	public static void stampaj(String ime,String prezime,String fakultet,double prosek,int godina)
	{
		System.out.println(ime+" "+prezime+" je zavrsio/la fakultet "+fakultet+" sa prosecnom ocenom "+prosek+
				", a rodjen/na je "+ godina+ " godine.");
	}
}
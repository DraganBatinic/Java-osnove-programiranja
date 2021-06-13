package vezbaZaTest;

public class Vezba34 {

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
		
		String[] ime = {"Dragana", "Petar", "Zdravko", "Mirka", "Dalibor"};
		String[] prezime = {"Draganovic", "Petrovic", "Zdravkovic", "Mirkovic", "Daliborevic"};
		String[] fakultet = {"Tehnicki", "Masinski", "Medicinski", "Pravni", "Arhitektonski"};
		double[] prosek = {8.31, 7.22, 9.01, 6.45, 8.55};
		int[] godinaRodjenja = {2000, 2001, 2002, 1995, 1996};
		
		for (int i = 0; i < godinaRodjenja.length; i++) {
			generalije(ime[i], prezime[i], fakultet[i], prosek[i], godinaRodjenja[i]);
		}

	}
	public static void generalije (String ime, String prezime, String fakultet, double prosek, int godinaRodjenja) {
		System.out.println(ime + " " + prezime + " je zavrsio/la " + fakultet + " fakultet" +
							" sa prosecnom ocenom " + prosek + ", a rodjen/a je " + godinaRodjenja + ". godine.");
	}

}

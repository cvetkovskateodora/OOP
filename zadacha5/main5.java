package zadacha5;

public class main5 {

	public static void main(String[] args) {
		//Instanca za objekt1 so default konstruktor
		Predmet obj1 = new Predmet ();				
		//Instanca za objekt2 so dinamicki konstruktor
		Predmet obj2 = new Predmet ("Algoritmi i strukturi na podatoci");
		//Instanca za objekt3 so drugiot dinamicki konstruktor
		Predmet obj3 = new Predmet ("OOP", "Ilija Joleski", 6);
		
		//Zadavanje vrednosti na atributite na objektot1
		obj1.ime = "Principi na multimediski sistemi";
		obj1.profesor = "Kotevski Zoran";
		obj1.krediti = 6;
		obj1.semestar = "V-ti";
		
		//Pecatenje na atributite na trite objekti
		System.out.println(obj1.ime + " " + obj1.profesor + " " + obj1.krediti + " " + obj1.semestar);
		System.out.println(obj2.ime);
		System.out.println(obj3.ime + " " + obj3.profesor + " " + obj3.krediti);
	}
	
}
package zadacha3;

public class main3 {

	public static void main(String[] args) {
		Chovek c = new Chovek ();
		c.ime = "Teodora";
		c.prezime = "Cvetkovska";
		c.embg = "1234975412003";
		
		System.out.println("Imeto na chovekot e: " + c.ime);
		System.out.println("Prezimeto na covekot e " + c.prezime);
		System.out.println("Chovekot ima matichen broj: " + c.embg);
	}
	
}
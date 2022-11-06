package zadacha4;

public class main4 {
	
	public static void main(String[] args) {
		
		Avtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka = "BMW";
		avtomobil1.model = "x5";
		avtomobil1.km = 12000;
		
		Avtomobil avtomobil2 = new Avtomobil("Audi", "A8", 22000);
		
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " + avtomobil1.km);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.km);
	}
	
	
}
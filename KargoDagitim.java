
public class KargoDagitim {

	public static void main(String[] args) {
		
		int mesafe = 5;
		double toplamGelir = 0;
		double temelUcret = 0;
		
		for (int teslimat = 1; teslimat<= 10; teslimat ++) {
			
			if (mesafe<= 10 ) {
				temelUcret= 50;
			}
			
			else if (mesafe > 30) {
				temelUcret= 120;
			}
			
			else {
				temelUcret= 80;
			}
			
			if (teslimat % 3 == 0) {
				temelUcret = temelUcret + 20;
			}
			
			if (mesafe >=40) {
				temelUcret = temelUcret * 0.90;
			}
			
		System.out.println (teslimat + ". Teslimat - Mesafe:" + mesafe + "- Ücret:" + temelUcret + "TL");
			
			toplamGelir = toplamGelir + temelUcret;
			mesafe= mesafe + 5;
			
			}
		System.out.println ("Toplam Gelir:" + toplamGelir + "TL");
		
		

	}

}

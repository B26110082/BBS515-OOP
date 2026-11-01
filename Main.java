
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor ile arac1, arac2, arac3 oluşturunuz.
		Arac arac1 = new Arac("Toyota", "Corolla", 1500,false);
		Arac arac2 = new Arac("Renault", "Clio", 1200,false);
		Arac arac3 = new Arac("BWM", "320i", 3000,true);
		
		// Üç aracın başlangıç bilgilerini yazdırınız.
		System.out.println("=== ARAÇ KİRALAMA SİSTEMI ===");
		arac1.bilgileriGoster();
		arac2.bilgileriGoster();
		arac3.bilgileriGoster();
		
		//arac1 nesnesini kiralayınız.
		arac1.kirala();
		
		//arac1 nesnesini tekrar kiralamayı deneyiniz.
		arac1.kirala();
		
		//arac2 için 5 günlük kira bedelini hesaplayınız.
		System.out.println("5 guünlük kiralama bedeli:" +arac2.kiraBedeliHesapla(5)+ "TL");
		
		//arac3 nesnesini teslim alınız.
		arac3.teslimEt();
		
		//Üç aracın güncel bilgilerini yazdırınız.
		System.out.println("\n=== GÜNCEL ARAÇ DURUMLARI ===");
		arac1.bilgileriGoster();
		arac2.bilgileriGoster();
		arac3.bilgileriGoster();
	}

}

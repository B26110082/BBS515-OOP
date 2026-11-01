
public class Arac {
	
	// Instance variables
	String marka;
	String model;
	double gunlukUcret;
	boolean kiradaMi;
	
	// Constructor
	public Arac(String marka, String model, double gunlukUcret, boolean kiradaMi) {
		this.marka = marka;
		this.model = model;
		this.gunlukUcret = gunlukUcret;
		this.kiradaMi = kiradaMi;
	}
	
	void bilgileriGoster() {
		System.out.println("Marka:"+marka);
		System.out.println("Model:"+model);
		System.out.println("Günlük Ücret:"+gunlukUcret);
		
		if(kiradaMi) {
			System.out.println("Durum: Kirada");
		}
		else {
			System.out.println("Durum: Müsait");
		}
	
	System.out.println("--------------------------");
	
	
}
	void kirala() {
		if(kiradaMi == false) {
			kiradaMi = true;
			System.out.println(marka+ " "+model + "başarıyla kiralandı.");
		}
		else {
			System.out.println("Bu araç zaten kiralanmış!");
		}	
	}
	void teslimEt() {
		if(kiradaMi == true) {
			kiradaMi = false;
			System.out.println(marka + " " + model + "başarıyla teslim alındı.");
		}else {
			System.out.println("Bu araç müsait!");
		}
	}
	
	double kiraBedeliHesapla(int gun) {
		if(gun <= 0) {
			return 0; // Geçici dönüş değeri; değiştiriniz.
		}
		return gunlukUcret * gun;
	}
}

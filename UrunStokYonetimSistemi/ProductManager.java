
public class ProductManager {
	
	public void urunBilgileriniGoster(Product product) {
		System.out.println("Urun: "+product.getName());
		System.out.println("Fiyat: "+product.getPrice());
		System.out.println("Stock: "+product.getStock());
		System.out.println("-----------------");
	}
	public void satisYap(Product product, int adet) {
		if (adet <=0) {
			System.out.println("Hata: Adet pozitif olmalidir!");
		}else if (adet <=product.getStock()) {
			product.setStock(product.getStock() - adet);
			System.out.println(adet + "adet" + product.getName() + "satildi.");
		}else {
			System.out.println("Yetersiz stok!");
		}
	}
	public void stokEkle(Product product, int adet) {
		if (adet > 0) {
			product.setStock(product.getStock() + adet);
			System.out.println(adet + "adet" + product.getName() + "stoka eklendi.");
		}else {
			System.out.println("Hata: Adet pozitif olmalidir!");
		}
	}

}

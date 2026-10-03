
public class TravelCostCalculator {

	public static void main(String[] args) {
		
		int distance = 450;
		double consumptionPer100Km = 7.5;
		double fuelPrice = 52;
		double highwayFee = 250;
		int numberOfPeople = 3;
		
		//1. Yolculuk boyunca tüketilecek toplam yakıt miktarını hesaplayınız.
		//(450/100) * 7.5 = 33.75
		
		double totalFuelConsumption = (distance/100.0) * consumptionPer100Km;
		
		//2. Toplam yakıt maliyetini hesaplayınız.
		//33.75 * 52 = 1755
		
		double fuelCost = totalFuelConsumption * fuelPrice;
		
		//3. Otoyol ücreti dahil toplam yolculuk maliyetini hesaplayınız.
		//1755 + 250 = 2005
		
		double totalTravelCost = fuelCost + highwayFee;
		
		//4. Kişi başına düşen yolculuk maliyetini hesaplayınız.
		//2005 / 3 = 668.33
		
		double costPerPerson = totalTravelCost / numberOfPeople;
		
		//5. Hesaplanan tüm sonuçları ekrana yazdırınız.
		
		System.out.println("Total Fuel Consumption:" + totalFuelConsumption);
		System.out.println("Fuel Cost:" + fuelCost);
		System.out.println("Total Travel Cost:" + totalTravelCost);
		System.out.println("Cost Per Person:" + costPerPerson );

	}

}

package Verfsoftware;

public class Facturen {
	
	public static void main(String[] args) {
		
		// maak objecten van Schilder
		Schilder steve = new Schilder("Steve");
		Schilder michael = new Schilder("Michael");
		
		// vul waardes in
		steve.setGewerkteUren(5);
		steve.setUurloon(30);
		michael.setGewerkteUren(8);
		michael.setUurloon(20);
		
		System.out.println(steve.getNaam());
		steve.teBetalenSom();
		System.out.println(michael.getNaam());
		michael.teBetalenSom();
		
		System.out.println("Aantal schilders: " + Schilder.count());
		
		// maak verf aan en bereken de kost
		Materiaal verf = new Materiaal("acryl");
		verf.setPrijs(7.88);
		verf.setStuks(5);
		System.out.println("Kost verf:" + verf.materiaalPrijs());
	}
}

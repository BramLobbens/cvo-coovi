package Verfsoftware;

public class Facturen {

	public static void main(String[] args) {
		
		Schilder olaf = new Schilder("Olaf");
		Schilder tania = new Schilder("Tania");
		
		olaf.setUurloon(20);
		tania.setUurloon(30);
		olaf.setGewerkteuren(50);
		tania.setGewerkteuren(10);
		olaf.teBetalenSom();
		tania.teBetalenSom();

	}

}

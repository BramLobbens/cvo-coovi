package Verfsoftware;

public class Schilder {
	
	private double uurloon;
	private double werkuren;
	private double gewerkteUren;
	private String naam;
	private static int COUNT = 0;
	
	public Schilder(String naam) {
		this.naam = naam;
		COUNT++;
	}
	
	/**
	 * print de te betalen som
	 */
	public void teBetalenSom() {
		double teBetalen = uurloon * gewerkteUren;
		System.out.println("Te betalen: " + teBetalen);
	}
	
	/**
	 * 
	 * verkrijg aantal aangemaakte schilders
	 */
	public static int count() {
		return COUNT;
	}
	
	// setters
	public void setUurloon(double uurloon) {
		this.uurloon = uurloon;
	}
	
	public void setWerkuren(double werkuren) {
		this.werkuren = werkuren;
	}
	
	public void setGewerkteUren(double gewerkteUren) {
		this.gewerkteUren = gewerkteUren;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	// getters
	public double getUurloon() {
		return uurloon;
	}
	
	public double getWerkuren() {
		return werkuren;
	}

	public double getGewerkteUren() {
		return gewerkteUren;
	}
	
	public String getNaam() {
		return naam;
	}
}

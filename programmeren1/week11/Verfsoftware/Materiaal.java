package Verfsoftware;

public class Materiaal {
	
	private String naam;
	private double prijs;
	private int stuks;
	
	public Materiaal(String naam) {
		this.naam = naam;
	}
	/**
	 * bereken de materiaalprijs
	 */
	public double materiaalPrijs() {
		return this.prijs * this.stuks;
	}
	
	// setters
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	
	public void setStuks(int stuks) {
		this.stuks = stuks;
	}
	
	// getters
	public String getNaam() {
		return naam;
	}
	
	public double getPrijs() {
		return prijs;
	}
	
	public int getStuks() {
		return stuks;
	}
}

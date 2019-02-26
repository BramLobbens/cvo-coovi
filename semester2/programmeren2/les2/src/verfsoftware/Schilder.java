package verfsoftware;

public class Schilder {
	
	double uurloon;
	double gewerkteuren;
	String naam;
	
	public Schilder(String naam) {
		this.naam = naam;
	}
	
	public double getUurloon() {
		return uurloon;
	}

	public void setUurloon(double uurloon) {
		this.uurloon = uurloon;
	}

	public double getGewerkteuren() {
		return gewerkteuren;
	}

	public void setGewerkteuren(double gewerkteuren) {
		this.gewerkteuren = gewerkteuren;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	/*
	 * Bereken de te betalen som geld
	 */
	public void teBetalenSom() {
		
		double teBetalen = uurloon * gewerkteuren;
		System.out.printf("De te betalen som aan %s is %.0f.\n", naam, teBetalen);
		System.out.println("-------------------");
		
	}

}

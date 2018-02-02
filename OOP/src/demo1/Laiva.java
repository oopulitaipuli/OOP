package demo1;
public class Laiva {
	
	private String nimi;
	private double pituus;
	private double syvays;
	private double nopeus;
	
	public Laiva(String nimi, double pituus, double syvays, double nopeus){
		this.nimi = nimi;
		this.pituus = pituus;
		this.syvays = syvays;
		this.nopeus = nopeus;
	}
	
	public String annaNimi(){
		return nimi;
	}
	
	public void asetaNimi(String nimi){
		this.nimi = nimi;
	}
	
	public double annaPituus(){
		return pituus;
	}
	
	public void asetaPituus(double pituus){
		this.pituus = pituus;
	}
	
	public double annaSyvays(){
		return syvays;
	}
	
	public void asetaSyvays(double syvays){
		this.syvays = syvays;
	}
	
	public double annaNopeus(){
		return nopeus;
	}
	
	public void asetaNopeus(double nopeus){
		this.nopeus = nopeus;
	}
	
	public double matkaanKuluvaAika(double matka){
		return matka/(nopeus*1.852);
	}

}

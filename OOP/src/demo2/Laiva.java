package demo2;

public class Laiva {
		
	protected String nimi;
	protected double pituus;
	protected double syvays;
	protected double nopeus;
		
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
		return matka/(Math.abs(nopeus)*1.852);
	}

}

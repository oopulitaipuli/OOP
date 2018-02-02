package demo2;
public class Jalkapallopelaaja extends Pelaaja{
	
	public enum Jalkaisuus{
		OIKEA, VASEN
	}
	
	private Jalkaisuus jalkaisuus;
	private double viikkopalkka;
	
	public Jalkapallopelaaja(String nimi, int numero, Pelipaikka pelipaikka,
			Jalkaisuus jalkaisuus, double viikkopalkka){
		super(nimi, numero, pelipaikka);
		this.jalkaisuus = jalkaisuus;
		this.viikkopalkka = viikkopalkka;
	}
	
	public Jalkaisuus annaJalkaisuus(){
		return jalkaisuus;
	}
	
	public double annaViikkopalkka(){
		return viikkopalkka;
	}
	
	public void asetaViikkopalkka(double viikkopalkka){
		this.viikkopalkka = viikkopalkka;
	}
	
	@Override
	public String toString(){
		return "nimi: " + nimi + ", numero: " + numero + ", pelipaikka: " + pelipaikka
				+ ", jalkaisuus: " + jalkaisuus + ", viikkopalkka: " + viikkopalkka;
	}

}

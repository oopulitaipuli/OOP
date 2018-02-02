package demo2;
public class Pelaaja {
	
	public enum Pelipaikka{
		Maalivahti, Puolustaja, Hyokkaaja
	}
	
	protected String nimi;
	protected int numero;
	protected Pelipaikka pelipaikka;
	
	public Pelaaja(String nimi, int numero, Pelipaikka pelipaikka){
		this.nimi = nimi;
		this.numero = numero;
		this.pelipaikka = pelipaikka;
	}
	
	public Pelipaikka annaPelipaikka(){
		return pelipaikka;
	}
	
	public String toString(){
		return "nimi: " + nimi + ", numero: " + numero + ", pelipaikka: " + pelipaikka;
	}

}

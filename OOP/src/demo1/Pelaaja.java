package demo1;
public class Pelaaja {
	
	public static final int MAALIVAHTI = 1;
	public static final int PUOLUSTAJA = 2;
	public static final int HYOKKAAJA = 3;
	
	private String nimi;
	private int numero;
	private int pelipaikka;
	
	public Pelaaja(String nimi, int numero, int pelipaikka){
		this.nimi = nimi;
		this.numero = numero;
		this.pelipaikka = pelipaikka;
	}
	
	public String toString(){
		return "nimi: " + nimi + ", numero: " + numero + ", pelipaikka: " + pelipaikka;
	}

}

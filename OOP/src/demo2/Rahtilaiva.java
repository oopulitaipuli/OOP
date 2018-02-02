package demo2;
public class Rahtilaiva extends Laiva{
	private double kapasiteetti;
	private double rahti;
	
	public Rahtilaiva(String nimi, double pituus, double syvays, double nopeus, double kapasiteetti, double rahti){
		super(nimi, pituus, syvays, nopeus);
		
		if (rahti > kapasiteetti){
			rahti = kapasiteetti;
		}
		this.kapasiteetti = kapasiteetti;
		this.rahti = rahti;
	}
	
	public double annaKapasiteetti(){
		return kapasiteetti;
	}
	
	public void asetaKapasiteetti(double kapasiteetti){
		this.kapasiteetti = kapasiteetti;
	}
	
	public double annaRahti(){
		return rahti;
	}
	
	public void asetaRahti(double rahti){
		if (rahti > kapasiteetti){
			rahti = kapasiteetti;
		}
		this.rahti = rahti;
	}
	
	@Override
	public double annaNopeus(){
		int täydetKymmenesosat = (int)(rahti/kapasiteetti*10);
		return (10-täydetKymmenesosat)/10.0*super.annaNopeus();
	}

}

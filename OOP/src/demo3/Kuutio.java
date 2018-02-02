package demo3;

public class Kuutio implements Kappale {
	
	private double sivunPituus;
	private Piste keskipiste;
	
	public Kuutio(double sivu, Piste keskipiste){
		sivunPituus = sivu;
		this.keskipiste = keskipiste;
	}

	//Palauttaa kuution kokonaispinta-alan
	@Override
	public double annaAla() {
		return 6*sivunPituus*sivunPituus;
	}

	//Palauttaa kuution keskipisteen
	@Override
	public Piste annaKeskipiste() {
		return keskipiste;
	}
	
	//Palauttaa kuution tilavuuden
	public double annaTilavuus(){
		return sivunPituus*sivunPituus*sivunPituus;
	}

}

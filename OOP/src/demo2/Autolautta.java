package demo2;
public class Autolautta extends Laiva{
	
	private final int kapasiteetti;
	private int matkustajat;
	private int ajoneuvot;
	
	private static int AUTONVIEMATILA = 10;
	private static int MATKUSTAJANVIEMATILA = 1;
	
	public Autolautta(String nimi, double pituus, double syvays, double nopeus,
			int kapasiteetti, int matkustajat, int ajoneuvot){
		super(nimi, pituus, syvays, nopeus);
		this.kapasiteetti = kapasiteetti;
		this.matkustajat = matkustajat;
		this.ajoneuvot = ajoneuvot;
	}
	
	public int annaMatkustajat(){
		return matkustajat;
	}
	
	public void asetaMatkustajat(int matkustajat){
		if(autojenViemaKapasiteetti()+matkustajat > annaKapasiteetti()){
			return;
		}
		this.matkustajat = matkustajat;
	}
	
	public int annaKapasiteetti(){
		return kapasiteetti;
	}
	
	public int annaAjoneuvot(){
		return ajoneuvot;
	}
	
	public void asetaAjoneuvot(int ajoneuvot){
		if(matkustajienViemaKapasiteetti()+ajoneuvot*AUTONVIEMATILA > annaKapasiteetti()){
			return;
		}
		this.ajoneuvot = ajoneuvot;
	}
	
	public int matkustajienViemaKapasiteetti(){
		return annaMatkustajat()*MATKUSTAJANVIEMATILA;
	}
	
	public int autojenViemaKapasiteetti(){
		return annaAjoneuvot()*AUTONVIEMATILA;
	}
	
	public int annaTyhjaTila(){
		return annaKapasiteetti()-(matkustajienViemaKapasiteetti()+autojenViemaKapasiteetti());
	}

}

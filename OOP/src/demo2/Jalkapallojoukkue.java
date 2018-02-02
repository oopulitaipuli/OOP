package demo2;
public class Jalkapallojoukkue extends Joukkue{
	
	private static final int MAKSIMIKOKO = 22;
	private static final int MAALIVAHTEJAENINT = 2;
	
	private String kotistadion;
	
	public Jalkapallojoukkue(String nimi, String kotistadion){
		super(nimi);
		this.kotistadion = kotistadion;
	}
	
	public String annaKotistadion(){
		return kotistadion;
	}
	
	public int annaMaalivahteja(){
		int maalivahdit = 0;
		for (int i = 0; i < pelaajat.size(); i++){
			if(pelaajat.get(i).pelipaikka == Pelaaja.Pelipaikka.Maalivahti){
				maalivahdit++;
			}
		}
		return maalivahdit;
	}
	
	@Override
	public void lisaaPelaaja(Pelaaja p){
		if(pelaajat.size() >= MAKSIMIKOKO){
			return;
		}
		
		if((p.annaPelipaikka() == Pelaaja.Pelipaikka.Maalivahti) && (annaMaalivahteja() >= MAALIVAHTEJAENINT)){
			return;
		}
		
		super.lisaaPelaaja(p);
	}
	
	@Override
	public String toString(){
		return super.toString() + "Joukkueen kotistadion: " + kotistadion;
	}

}

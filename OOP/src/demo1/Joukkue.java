package demo1;
import java.util.ArrayList;

public class Joukkue {
	
	private ArrayList<Pelaaja> pelaajat;
	private String nimi;
	
	public Joukkue(String nimi){
		pelaajat = new ArrayList<Pelaaja>();
		this.nimi = nimi;
	}
	
	public void lisaaPelaaja(Pelaaja p){
		pelaajat.add(p);
	}
	
	public boolean poistaPelaaja(Pelaaja p){
		return pelaajat.remove(p);
	}
	
	public String toString(){
		String joukkue = "Joukkueen " + nimi + " kokoonpano:\n";
		for (int i = 0; i < pelaajat.size(); i++){
			joukkue += pelaajat.get(i).toString() + "\n";
		}
		return joukkue;
	}

}

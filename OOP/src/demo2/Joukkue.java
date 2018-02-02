package demo2;
import java.util.ArrayList;

public class Joukkue {
	
	protected ArrayList<Pelaaja> pelaajat;
	protected String nimi;
	
	public Joukkue(String nimi){
		pelaajat = new ArrayList<>();
		this.nimi = nimi;
	}
	
	public void lisaaPelaaja(Pelaaja p){
		pelaajat.add(p);
	}
	
	public boolean poistaPelaaja(Pelaaja p){
		return pelaajat.remove(p);
	}
	
	public String annaNimi(){
		return nimi;
	}
	
	public String toString(){
		String joukkue = "Joukkueen " + annaNimi() + " kokoonpano:\n";
		for (int i = 0; i < pelaajat.size(); i++){
			joukkue += pelaajat.get(i).toString() + "\n";
		}
		return joukkue;
	}

}
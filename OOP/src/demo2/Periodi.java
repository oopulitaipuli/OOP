package demo2;
import java.util.ArrayList;

public class Periodi {
	
	private ArrayList<Kurssi> kurssit = new ArrayList<>();
	private int periodiNumero;
	
	public Periodi(int periodiNumero){
		this.periodiNumero = periodiNumero;
	}
	
	public int annaPeriodiNumero(){
		return periodiNumero;
	}
	
	public void lisaaKurssi(Kurssi k){
		kurssit.add(k);
	}
	
	public void poistaKurssi(Kurssi k){
		kurssit.remove(k);
	}
	
	public ArrayList<Kurssi> annaKurssit(){
		return kurssit;
	}

}

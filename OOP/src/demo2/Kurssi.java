package demo2;
import java.util.ArrayList;

public class Kurssi {
	
	private String nimi;
	private String tunnus;
	private ArrayList<Yliopistolainen> osallistujat;
	
	public Kurssi(String nimi, String tunnus){
		this.nimi = nimi;
		this.tunnus = tunnus;
		osallistujat = new ArrayList<>();
	}
	
	public String annaNimi(){
		return nimi;
	}
	
	public void asetaNimi(String nimi){
		this.nimi = nimi;
	}
	
	public String annaTunnus(){
		return tunnus;
	}
	
	public void asetaTunnus(String tunnus){
		this.tunnus = tunnus;
	}
	
	public void lisaaHenkilo(Yliopistolainen y){
		osallistujat.add(y);
	}
	
	public void poistaHenkilo(Yliopistolainen y){
		osallistujat.remove(y);
	}

}

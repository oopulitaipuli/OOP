package lisätehtävät;

import java.util.ArrayList;
import java.util.Collections;

public class Korttipakka {
	private ArrayList<Pelikortti> pakka;
	
	public Korttipakka(){
		järjestäKortit();
	}
	
	public void sekoitaPakka(){
		Collections.shuffle(pakka);
	}
	
	//Kortti nostetaan kuvapuoli alaspäin olevasta pakasta
	public Pelikortti nostaKortti() throws TyhjäPakkaPoikkeus{
		if (pakka.size() > 0){
			Pelikortti nostettu = pakka.get(pakka.size()-1);
			pakka.remove(pakka.size()-1);
			System.out.println("Nostettu kortti: " + nostettu.toString());
			return nostettu;
		} else {
			throw new TyhjäPakkaPoikkeus("Pakassa ei ole enempää kortteja.");
		}
	}
	
	public void järjestäKortit(){
		pakka = new ArrayList<Pelikortti>();
		for(Pelikortti.Maa maa : Pelikortti.Maa.values()){
			for(int i = Pelikortti.MINIMIARVO; i <= Pelikortti.MAKSIMIARVO; i++){
				pakka.add(new Pelikortti(maa, i));
			}
		}
		
	}
	
	@Override
	public String toString(){
		String kortit = "Pakka tällä hetkellä: \n";
		for(int i = 0; i < pakka.size(); i++){
			kortit += pakka.get(i).toString() + "\n";
		}
		return kortit;
	}

}

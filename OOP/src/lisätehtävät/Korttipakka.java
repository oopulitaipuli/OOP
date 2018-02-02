package lis‰teht‰v‰t;

import java.util.ArrayList;
import java.util.Collections;

public class Korttipakka {
	private ArrayList<Pelikortti> pakka;
	
	public Korttipakka(){
		j‰rjest‰Kortit();
	}
	
	public void sekoitaPakka(){
		Collections.shuffle(pakka);
	}
	
	//Kortti nostetaan kuvapuoli alasp‰in olevasta pakasta
	public Pelikortti nostaKortti() throws Tyhj‰PakkaPoikkeus{
		if (pakka.size() > 0){
			Pelikortti nostettu = pakka.get(pakka.size()-1);
			pakka.remove(pakka.size()-1);
			System.out.println("Nostettu kortti: " + nostettu.toString());
			return nostettu;
		} else {
			throw new Tyhj‰PakkaPoikkeus("Pakassa ei ole enemp‰‰ kortteja.");
		}
	}
	
	public void j‰rjest‰Kortit(){
		pakka = new ArrayList<Pelikortti>();
		for(Pelikortti.Maa maa : Pelikortti.Maa.values()){
			for(int i = Pelikortti.MINIMIARVO; i <= Pelikortti.MAKSIMIARVO; i++){
				pakka.add(new Pelikortti(maa, i));
			}
		}
		
	}
	
	@Override
	public String toString(){
		String kortit = "Pakka t‰ll‰ hetkell‰: \n";
		for(int i = 0; i < pakka.size(); i++){
			kortit += pakka.get(i).toString() + "\n";
		}
		return kortit;
	}

}

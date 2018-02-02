package demo2;
public class Joukkuetesti {
	public static void main(String[] args){
		Jalkapallojoukkue joukkue = new Jalkapallojoukkue("TPS", "Veritas");
		Jalkapallopelaaja pekka = new Jalkapallopelaaja("Pekka", 6, Pelaaja.Pelipaikka.Puolustaja, Jalkapallopelaaja.Jalkaisuus.OIKEA, 743.8);
		Jalkapallopelaaja mikko = new Jalkapallopelaaja("Mikko", 11, Pelaaja.Pelipaikka.Hyokkaaja, Jalkapallopelaaja.Jalkaisuus.VASEN, 843.2);
		Jalkapallopelaaja matti = new Jalkapallopelaaja("Matti", 1, Pelaaja.Pelipaikka.Maalivahti, Jalkapallopelaaja.Jalkaisuus.OIKEA, 794.6);
		Jalkapallopelaaja jukka = new Jalkapallopelaaja("Jukka", 2, Pelaaja.Pelipaikka.Maalivahti, Jalkapallopelaaja.Jalkaisuus.OIKEA, 739.1);
		Jalkapallopelaaja jaakko = new Jalkapallopelaaja("Jaakko", 20, Pelaaja.Pelipaikka.Maalivahti, Jalkapallopelaaja.Jalkaisuus.VASEN, 740.5);
		
		joukkue.lisaaPelaaja(pekka);
		joukkue.lisaaPelaaja(mikko);
		joukkue.lisaaPelaaja(matti);
		joukkue.lisaaPelaaja(jaakko);
		joukkue.lisaaPelaaja(jukka);
		System.out.println(joukkue);
		
		joukkue.poistaPelaaja(jaakko);
		System.out.println(joukkue);
	}

}

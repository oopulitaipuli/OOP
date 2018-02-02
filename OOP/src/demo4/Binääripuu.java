package demo4;
import java.util.ArrayList;

public class Bin‰‰ripuu<T> {
	
	ArrayList<Solmu<T>> vapaatSolmut = new ArrayList<>();
	Solmu<T> alku = null;
	
	public void lisaaSolmu(T arvo) {
		Solmu<T> solmu = new Solmu<T>(arvo);
		
		if (alku == null) {
			alku = solmu;
			vapaatSolmut.add(solmu);
			return;
		}
		
		Solmu<T> vanhempi = vapaatSolmut.get(0);
		if (vanhempi.annaVasenLapsi() == null) {
			vanhempi.asetaVasenLapsi(solmu);
			vapaatSolmut.add(solmu);
		} else {
			vanhempi.asetaOikeaLapsi(solmu);
			vapaatSolmut.add(solmu);
			vapaatSolmut.remove(0);
		}
	}
	
	public boolean etsiSolmu(T alkio) {
		//Etsint‰ suoritetaan k‰ytt‰m‰ll‰ leveyshakua ja tietorakenteena jonoa
		ArrayList<Solmu<T>> jono = new ArrayList<>();
		jono.add(alku);
		
		//onko etsitt‰v‰ arvo juuressa?
		if(alku.annaArvo().equals(alkio)){
			return true;
		}
		
		while(jono.size() > 0) {
			
			//otetaan jonon seuraava asiakas k‰sittelyyn
			//remove-metodi paitsi poistaa alkion listasta, myˆs palauttaa viittauksen siihen.
			Solmu<T> kasiteltavaSolmu = jono.remove(0);
			
			//'kassavaihe', jossa sen hetkinen jonon asiakas k‰sitell‰‰n
			if (kasiteltavaSolmu == null) {
				continue;
			}
			
			if (kasiteltavaSolmu.annaArvo().equals(alkio)) {
				return true;
			}
			
			//lopuksi lis‰t‰‰n jonoon molemmat lapset, jotta ne jossakin vaiheessa looppia k‰yd‰‰n l‰pi
			jono.add(kasiteltavaSolmu.annaVasenLapsi());
			jono.add(kasiteltavaSolmu.annaOikeaLapsi());
		}
		
		//puussa ei ollut etsitt‰v‰‰ alkiota
		return false;
	}
	
	public void tulostaLista() {
		//lista tulostetaan k‰ytt‰m‰ll‰ leveyshakua ja tietorakenteena jonoa
		ArrayList<Solmu<T>> jono = new ArrayList<>();
		//kuvitellaan siis kassajono:
		//ensimm‰inen asiakas saapuu jonottamaan
		jono.add(alku);

		while(jono.size() > 0) {
			
			//otetaan jonon seuraava asiakas k‰sittelyyn
			//remove-metodi paitsi poistaa alkion listasta, myˆs palauttaa viittauksen siihen.
			Solmu<T> kasiteltavaSolmu = jono.remove(0);
			
			//'kassavaihe', jossa sen hetkinen jonon asiakas k‰sitell‰‰n
			System.out.println(kasiteltavaSolmu);
			
			//lopuksi lis‰t‰‰n jonoon molemmat lapset, jotta ne jossakin vaiheessa looppia k‰yd‰‰n l‰pi
			jono.add(kasiteltavaSolmu.annaVasenLapsi());
			jono.add(kasiteltavaSolmu.annaOikeaLapsi());
		}		
	}
	
}

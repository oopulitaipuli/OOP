package demo4;

public class Solmu<T> {
	//listan seuraava solmu; null, jos lasta ei ole
	private Solmu<T> vasenLapsi = null;
	private Solmu<T> oikeaLapsi = null;
	private final T arvo;
		
	public Solmu(T arvo) {
		this.arvo = arvo;
	}
		
	public T annaArvo() {
		return arvo;
	}
		
	public boolean onkoArvo(T arvo) {
		return this.arvo.equals(arvo);
	}
		
	public void asetaVasenLapsi(Solmu<T> s) {
		vasenLapsi = s;
	}
		
	public Solmu<T> annaVasenLapsi() {
		return vasenLapsi;
	}
		
	public void asetaOikeaLapsi(Solmu<T> s) {
		oikeaLapsi = s;
	}
		
	public Solmu<T> annaOikeaLapsi() {
		return oikeaLapsi;
	}
		
	public String toString() {
		return arvo + "";
	}
}
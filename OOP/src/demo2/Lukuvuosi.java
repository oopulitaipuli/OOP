package demo2;
public class Lukuvuosi {
	
	private Periodi[] periodit = new Periodi[5];
	private String lukuvuosi;
	
	public Lukuvuosi(String lukuvuosi){
		this.lukuvuosi = lukuvuosi;
	}
	
	public String annaLukuvuosi(){
		return lukuvuosi;
	}
	
	public Periodi annaPeriodi(int i){
		return periodit[i-1];
	}
	
	public void asetaPeriodi(Periodi p, int i){
		periodit[i-1] = p;
	}

}

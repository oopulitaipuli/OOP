package demo2;
public class Yliopistolainen {
	
	protected String nimi;
	
	public Yliopistolainen(String nimi){
		this.nimi = nimi;
	}
	
	public String annaNimi(){
		return nimi;
	}
	
	public void asetaNimi(String nimi){
		this.nimi = nimi;
	}

}

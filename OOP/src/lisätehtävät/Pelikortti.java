package lisätehtävät;

public class Pelikortti {
	public enum Maa{
		HERTTA, PATA, RISTI, RUUTU
	}
	public static final int MINIMIARVO = 1;
	public static final int MAKSIMIARVO = 13;
	
	private Maa maa;
	private int arvo;
	
	public Pelikortti(Maa maa, int arvo){
		this.maa = maa;
		this.arvo = arvo;
	}
	
	public Maa annaMaa(){
		return maa;
	}
	public int annaArvo(){
		return arvo;
	}
	
	@Override
	public String toString(){
		return (maa + " " + arvo);
	}

} 

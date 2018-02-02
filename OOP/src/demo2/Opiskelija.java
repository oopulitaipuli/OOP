package demo2;
public class Opiskelija extends Yliopistolainen{
	
	private String opiskelijaTunnus;
	
	public Opiskelija(String nimi, String opiskelijaTunnus){
		super(nimi);
		this.opiskelijaTunnus = opiskelijaTunnus;
	}
	
	public String annaOpiskelijaTunnus(){
		return opiskelijaTunnus;
	}
	
	public void asetaOpiskelijaTunnus(String opiskelijaTunnus){
		this.opiskelijaTunnus = opiskelijaTunnus;
	}

}

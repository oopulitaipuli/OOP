package lis‰teht‰v‰t;

public class P‰iv‰m‰‰r‰ {
	private int p‰iv‰;
	private int kuukausi;
	private int vuosi;
	
	public P‰iv‰m‰‰r‰(String p‰iv‰ys) throws LaitonPaivaPoikkeus, LaitonKuukausiPoikkeus, LaitonVuosiPoikkeus{
		String[] osat = p‰iv‰ys.split("\\.");
		if (Integer.parseInt(osat[0]) < 1 || Integer.parseInt(osat[0]) > 31){
			throw new LaitonPaivaPoikkeus("P‰iv‰n tulee olla v‰lilt‰ 1-31.");
		}
		p‰iv‰ = Integer.parseInt(osat[0]);
		if (Integer.parseInt(osat[1]) < 1 || Integer.parseInt(osat[1]) > 12){
			throw new LaitonKuukausiPoikkeus("Kuukauden tulee olla v‰lilt‰ 1-12.");
		}
		kuukausi = Integer.parseInt(osat[1]);
		
		//Vuodessa ei v‰ltt‰m‰tt‰ mielek‰st‰ menn‰ kauas menneisyyteen
		//tai tulevaisuuteen
		if (Integer.parseInt(osat[2]) < 1800 || Integer.parseInt(osat[2]) > 2100){
			throw new LaitonVuosiPoikkeus("Ohjelma tukee vain vuosia v‰lilt‰ 1800-2100.");
		}
		vuosi = Integer.parseInt(osat[2]);
	}
	
	public int annaP‰iv‰(){
		return p‰iv‰;
	}
	public int annaKuukausi(){
		return kuukausi;
	}
	public int annaVuosi(){
		return vuosi;
	}
	
	@Override
	public String toString(){
		return "P‰iv‰: " + p‰iv‰ + ", kuukausi: " + kuukausi + ", vuosi: " +vuosi;
	}

}
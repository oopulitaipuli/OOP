package lis‰teht‰v‰t;

public class P‰iv‰m‰‰r‰Testi {
	public static void main(String[] args){
		try{
			P‰iv‰m‰‰r‰ pvm = new P‰iv‰m‰‰r‰("12.11.1976");
			System.out.println(pvm);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
		try{
			P‰iv‰m‰‰r‰ pvm1 = new P‰iv‰m‰‰r‰("03.14.2014");
			System.out.println(pvm1);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
		try{
			P‰iv‰m‰‰r‰ pvm2 = new P‰iv‰m‰‰r‰("50.12.1865");
			System.out.println(pvm2);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
		try{
			P‰iv‰m‰‰r‰ pvm3 = new P‰iv‰m‰‰r‰("24.10.1732");
			System.out.println(pvm3);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
	}

}

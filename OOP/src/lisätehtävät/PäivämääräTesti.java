package lisätehtävät;

public class PäivämääräTesti {
	public static void main(String[] args){
		try{
			Päivämäärä pvm = new Päivämäärä("12.11.1976");
			System.out.println(pvm);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
		try{
			Päivämäärä pvm1 = new Päivämäärä("03.14.2014");
			System.out.println(pvm1);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
		try{
			Päivämäärä pvm2 = new Päivämäärä("50.12.1865");
			System.out.println(pvm2);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
		try{
			Päivämäärä pvm3 = new Päivämäärä("24.10.1732");
			System.out.println(pvm3);
		} catch (LaitonPaivaPoikkeus | LaitonKuukausiPoikkeus | LaitonVuosiPoikkeus lp){
			System.out.println(lp.getMessage());
		}
	}

}

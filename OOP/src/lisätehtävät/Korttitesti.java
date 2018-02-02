package lisätehtävät;

public class Korttitesti {

	public static void main(String[] args) {
		Korttipakka pakka = new Korttipakka();
		System.out.println(pakka);
		pakka.sekoitaPakka();
		try{
			pakka.nostaKortti();
			pakka.nostaKortti();
		} catch (TyhjäPakkaPoikkeus tpp){
			System.out.println("Virhe: " + tpp.getMessage());
		}
		System.out.println(pakka);
		pakka.järjestäKortit();
		System.out.println(pakka);
	}

}

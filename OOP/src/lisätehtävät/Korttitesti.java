package lis‰teht‰v‰t;

public class Korttitesti {

	public static void main(String[] args) {
		Korttipakka pakka = new Korttipakka();
		System.out.println(pakka);
		pakka.sekoitaPakka();
		try{
			pakka.nostaKortti();
			pakka.nostaKortti();
		} catch (Tyhj‰PakkaPoikkeus tpp){
			System.out.println("Virhe: " + tpp.getMessage());
		}
		System.out.println(pakka);
		pakka.j‰rjest‰Kortit();
		System.out.println(pakka);
	}

}

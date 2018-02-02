package demo3;

public class Kuutiotesti {
	public static void main(String[] args){
		Piste keskipiste = new Piste(2, 7, 4);
		Kuutio kuutio = new Kuutio(5, keskipiste);
		System.out.println(kuutio.annaAla());
		System.out.println(kuutio.annaTilavuus());
		System.out.println(kuutio.annaKeskipiste());
	}

}

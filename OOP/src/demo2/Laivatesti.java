package demo2;

public class Laivatesti {
	public static void main(String[] args){
		Autolautta al = new Autolautta("A", 30.2, 17.4, 12.5, 120, 14, 4);
		Rahtilaiva rl = new Rahtilaiva("R", 33.7, 24.3, 14.1, 135, 38);
		al.asetaMatkustajat(26);
		al.asetaAjoneuvot(17);
		System.out.println(al.annaTyhjaTila());
		al.asetaAjoneuvot(8);
		System.out.println(al.annaTyhjaTila());
		System.out.println("Nopeus ennen rahdin lisäystä: " + rl.annaNopeus());
		System.out.println("Rahti ennen lisäystä: " + rl.annaRahti());
		rl.asetaRahti(200);
		System.out.println("Rahti lisäyksen jälkeen: " + rl.annaRahti());
		rl.asetaRahti(85.3);
		System.out.println("Nopeus lisäyksen jälkeen: " + rl.annaNopeus());
	}

}

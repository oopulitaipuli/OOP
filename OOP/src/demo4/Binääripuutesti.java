package demo4;

public class Binääripuutesti {
	public static void main(String[] args){
		  Binääripuu<Integer> lista = new Binääripuu<>();
		  
		  lista.lisaaSolmu(7);
		  
		  lista.lisaaSolmu(1);
		  lista.lisaaSolmu(6);
		  
		  lista.lisaaSolmu(5);
		  lista.lisaaSolmu(2);
		  lista.lisaaSolmu(8);
		  
		  System.out.println("Tulostetaan lista:");
		  lista.tulostaLista();
		}

}

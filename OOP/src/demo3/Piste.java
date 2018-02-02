package demo3;

public class Piste {
	
	private double x;
	private double y;
	private double z;
	
	public Piste(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double annaX(){
		return x;
	}
	
	public double annaY(){
		return y;
	}
	
	public double annaZ(){
		return z;
	}
	
	@Override
	public String toString(){
		return "Pisteen koordinaatit: x=" + x + ", y=" + y + ", z=" +z;
	}

}

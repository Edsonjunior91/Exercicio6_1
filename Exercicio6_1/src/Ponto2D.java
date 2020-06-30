
public class Ponto2D {
	//Coordenada x
	private double x;
	
	//Coordenada y
	private double y;
	
	//Construtor que recebe as coordenadas
	public Ponto2D(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	//Metodo getter de x
	public double getX() {
		return x;
	}
	//Metodo getter de y
	public double getY() {
		return y;
	}
	
	//Metodo toString(), sobrescrito da classe Object
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

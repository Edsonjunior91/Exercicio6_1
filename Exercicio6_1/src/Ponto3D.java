
public class Ponto3D extends Ponto2D {

	//Coordenada z
	private double z;
	
	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	//M�todo getter de z
	public double getZ() {
		return z;
	}
	
	//M�todo toString(), sobrescrito da classe Ponto2D, que ja sobrescrevia o m�todo
	public String toString() {
		//Veja que o toString() de Ponto2D � chamado para montar toString() de Ponto3D
		return super.toString() + ", z = " + z;
	}
}

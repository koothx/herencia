package Vehiculo;

public class Carro  extends Vehiculo {
	private static final double Peso = 3.4;
	private static final double Tama�o = 4.780;
	private String Comodidad;
	private String Color;
	private String Marca;
	
	public Carro (String Comodidad, String Color, String Marca) {
		super (Peso, Tama�o);
		this.Comodidad = Comodidad;
		this.Color = Color;
		this.Marca = Marca;
		
	}
}

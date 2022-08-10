package Vehiculo;

public class Lamborghini_Aventador extends Carro {
	
	private double potencia;
	private String Stop;
	private double cambios;
	private double  Velocidad;
	private String Estilo;
	
	public Lamborghini_Aventador(String Comodidad, String Color, String Marca) {
		super(Comodidad, Color, Marca);
		this.potencia = potencia;
		this.Stop = Stop;
		this.cambios = cambios;
		this.Velocidad = Velocidad;
		this.Estilo = Estilo;
		
	}

	public double getPotencia() {
		return this.potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getStop() {
		return this.Stop;
	}

	public void setStop(String stop) {
		Stop = stop;
	}

	public double getCambios() {
		return this.cambios;
	}

	public void setCambios(double cambios) {
		this.cambios = cambios;
	}

	public double getVelocidad() {
		return this.Velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.Velocidad = velocidad;
	}

	public String getEstilo() {
		return this.Estilo;
	}

	public void setEstilo(String estilo) {
		this.Estilo = estilo;
	}

	public static void Acelero() {
		System.out.println("El Lamborghini Aventador acelero!");
		Acelero();
		
	}

	public static void Stop() {
		System.out.println("EL Lamborghini Aventador se detuvo");
		Stop();
		
	}
	

}

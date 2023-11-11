package ar.edu.info.unlp.ejercicio19;

public class Trayecto {

	private String direccionOrigen;
	private String direccionDestino;
	
	public Trayecto(String direccionOrigen, String direccionDestino) {
		this.direccionDestino = direccionDestino;
		this.direccionOrigen = direccionOrigen;
	}
	
	public double distancia() {
		return 100;
	}
}

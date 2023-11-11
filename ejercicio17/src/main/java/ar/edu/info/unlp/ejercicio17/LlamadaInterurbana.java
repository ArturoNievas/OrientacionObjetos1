package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;
import java.time.LocalTime;

public class LlamadaInterurbana extends Llamada {

	private double distanciaKilometros;
	
	public LlamadaInterurbana(LocalDate fecha, LocalTime hora, int duracionMinutos, Telefono telefonoDestino, double distanciaKilometros) {
		super(fecha, hora, duracionMinutos, telefonoDestino);
		this.distanciaKilometros = distanciaKilometros;
	}

	@Override
	public double monto() {
		double monto = 5;
		if (this.distanciaKilometros<100) {
			monto += this.duracionMinutos*2;
		} else if (this.distanciaKilometros>=100 && this.distanciaKilometros<=500) {
			monto += this.duracionMinutos*2.5;
		} else {
			monto += this.duracionMinutos*3;
		}
		return monto;
	}

}

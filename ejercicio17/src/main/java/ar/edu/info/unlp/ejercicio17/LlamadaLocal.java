package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;
import java.time.LocalTime;

public class LlamadaLocal extends Llamada {

	public LlamadaLocal(LocalDate fecha, LocalTime hora, int duracionMinutos, Telefono telefonoDestino) {
		super(fecha, hora, duracionMinutos, telefonoDestino);
	}

	public double monto() {
		return this.duracionMinutos*1;
	}
}

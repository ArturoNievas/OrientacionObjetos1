package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;
import java.time.LocalTime;

public class LlamadaInternacional extends Llamada {

	private String paisOrigen;
	private String paisDestino;

	public LlamadaInternacional(LocalDate fecha, LocalTime hora, int duracionMinutos, Telefono telefonoDestino, String paisOrigen, String paisDestino) {
		super(fecha, hora, duracionMinutos, telefonoDestino);
		this.paisOrigen = paisOrigen;
		this.paisDestino = paisDestino;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	@Override
	public double monto() {
		double monto = 0;
		if (hora.getHour()>=8 && hora.getHour()<20) {
			monto += this.duracionMinutos*4;
		} else {
			monto += this.duracionMinutos*3;
		}
		return monto;
	}

}

package ar.edu.info.unlp.ejercicio17;

import java.time.*;

public abstract class Llamada {

	protected LocalDate fecha;
	protected LocalTime hora;
	protected Telefono telefonoDestino;
	protected int duracionMinutos;
	
	public Llamada(LocalDate fecha, LocalTime hora, int duracionMinutos, Telefono telefonoDestino) {
		this.fecha = fecha;
		this.hora = hora;
		this.telefonoDestino = telefonoDestino;
		this.duracionMinutos = duracionMinutos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Telefono getTelefonoDestino() {
		return telefonoDestino;
	}

	public void setTelefonoDestino(Telefono telefonoDestino) {
		this.telefonoDestino = telefonoDestino;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	
	public abstract double monto();
}

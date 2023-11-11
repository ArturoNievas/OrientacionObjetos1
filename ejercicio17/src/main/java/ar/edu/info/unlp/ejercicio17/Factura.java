package ar.edu.info.unlp.ejercicio17;

import java.time.*;

public class Factura {

	private DateLapse periodo;
	private LocalDate fecha;
	private double monto;
	private Persona cliente;
	
	public Factura(DateLapse periodo, LocalDate fecha, double monto, Persona cliente) {
		this.periodo = periodo;
		this.fecha = fecha;
		this.monto = monto;
		this.cliente = cliente;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getMonto() {
		return monto;
	}

	public Persona getCliente() {
		return cliente;
	}
}

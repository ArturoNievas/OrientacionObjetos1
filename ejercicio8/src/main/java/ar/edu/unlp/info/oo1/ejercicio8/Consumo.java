package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;

	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public void setConsumoEnergiaActiva(double consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public void setConsumoEnergiaReactiva(double consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}

	public double costoEnBaseA(double precioKWh) {
		return precioKWh*this.consumoEnergiaActiva;
	}

	public double factorDePotencia() {
		return this.consumoEnergiaActiva/Math.pow(Math.pow(this.consumoEnergiaActiva,2) + Math.pow(this.consumoEnergiaReactiva,2),0.5);
	}
}

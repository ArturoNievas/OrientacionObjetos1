package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversion {

	private LocalDate fechaDeConstruccion;
	private double montoDepositado;
	private double interesPorDia;

	public PlazoFijo() {
		this.fechaDeConstruccion = LocalDate.now();
	}

	public PlazoFijo(double montoDepositado, double interesPorDia) {
		this.fechaDeConstruccion = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.interesPorDia = interesPorDia;
	}
	
	public void setInteresPorDia(double interesPorDia) {
		this.interesPorDia = interesPorDia;
	}

	@Override
	protected double valorActual() {
		double factor = 1 + this.interesPorDia/100;
		double tiempo = ChronoUnit.DAYS.between(this.fechaDeConstruccion, LocalDate.now());
		
		return this.montoDepositado*Math.pow(factor,tiempo);
	}

}

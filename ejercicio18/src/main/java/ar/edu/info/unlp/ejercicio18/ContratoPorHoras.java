package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato {

	private double valorHora;
	private int horasATrabajar;
	
	public ContratoPorHoras(LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int horasATrabajar) {
		super(fechaInicio, fechaFin);
		this.valorHora = valorHora;
		this.horasATrabajar = horasATrabajar;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasATrabajar() {
		return horasATrabajar;
	}

	public void setHorasATrabajar(int horasATrabajar) {
		this.horasATrabajar = horasATrabajar;
	}
	
	public ReciboDeCobro generarRecibo(Empleado empleado) {
		return new ReciboDeCobro(empleado,this.antiguedad(),this.valorHora*this.horasATrabajar*(1+this.porcentajeAntiguedad()/100));
	}
	
}

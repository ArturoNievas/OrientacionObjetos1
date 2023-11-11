package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;

public class ContratoPermanente extends Contrato{

	private double sueldoMensual;
	private double montoPorConyugeACargo;
	private double montoPorHijesACargo;
	
	public ContratoPermanente(LocalDate fechaInicio, double sueldoMensual, double montoPorConyugeACargo, double montoPorHijesACargo) {
		super(fechaInicio);
		this.sueldoMensual = sueldoMensual;
		this.montoPorConyugeACargo = montoPorConyugeACargo;
		this.montoPorHijesACargo = montoPorHijesACargo;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getMontoPorConyugeACargo() {
		return montoPorConyugeACargo;
	}

	public void setMontoPorConyugeACargo(double montoPorConyugeACargo) {
		this.montoPorConyugeACargo = montoPorConyugeACargo;
	}

	public double getMontoPorHijesACargo() {
		return montoPorHijesACargo;
	}

	public void setMontoPorHijesACargo(double montoPorHijesACargo) {
		this.montoPorHijesACargo = montoPorHijesACargo;
	}
	
	public ReciboDeCobro generarRecibo(Empleado empleado) {
		double monto = this.sueldoMensual;
		if (empleado.isTieneHijesACargo()) {
			monto += this.montoPorHijesACargo;
		}
		if (empleado.isTieneConyugeACargo()) {
			monto += this.montoPorConyugeACargo;
		}
		return new ReciboDeCobro(empleado,this.antiguedad(),monto*(1+this.porcentajeAntiguedad()/100));
	}
	
}

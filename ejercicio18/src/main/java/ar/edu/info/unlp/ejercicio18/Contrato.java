package ar.edu.info.unlp.ejercicio18;

import java.time.*;

public abstract class Contrato {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public Contrato(LocalDate fechaInicio, LocalDate fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public Contrato(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public int antiguedad() {
		return Math.floorDiv(new DateLapse(this.getFechaInicio(),LocalDate.now()).sizeInDays(), 365);
	}
	
	public double porcentajeAntiguedad() {
		int a = this.antiguedad();
		int p = 0;
		if (a>=5 && a<10) {
			p = 30;
		} else if (a>=10 && a<15) {
			p = 50;
		} else if (a>=15 && a<20) {
			p = 70;
		} else if (a>=20) {
			p = 100;
		}
		return p;
	}
	
	public abstract ReciboDeCobro generarRecibo(Empleado empleado);
	
}

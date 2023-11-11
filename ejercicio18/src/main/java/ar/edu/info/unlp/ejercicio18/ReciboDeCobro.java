package ar.edu.info.unlp.ejercicio18;

import java.time.*;

public class ReciboDeCobro {

	private String nombre;
	private String apellido;
	private int cuil;
	private int antiguedad;
	private LocalDate fechaEmision;
	private double monto;
	
	public ReciboDeCobro(Empleado empleado, int antiguedad, double monto) {
		this.nombre = empleado.getNombre();
		this.apellido = empleado.getApellido();
		this.cuil = empleado.getCuil();
		this.antiguedad = antiguedad;
		this.monto = monto;
		this.fechaEmision = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getCuil() {
		return cuil;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public double getMonto() {
		return monto;
	}

}

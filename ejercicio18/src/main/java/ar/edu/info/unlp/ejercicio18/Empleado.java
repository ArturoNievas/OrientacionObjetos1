package ar.edu.info.unlp.ejercicio18;

import java.time.*;
import java.util.*;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Empleado {

	private String nombre;
	private String apellido;
	private int cuil;
	private LocalDate fechaNacimiento;
	private boolean tieneHijesACargo;
	private boolean tieneConyugeACargo;
	private Contrato contratoActual;
	private List<Contrato> contratos;
	private LocalDate inicioRelacionLaboral;

	public Empleado(String nombre, String apellido, int cuil, LocalDate fechaNacimiento, boolean tieneConyugeACargo,  boolean tieneHijesACargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
		this.tieneHijesACargo = tieneHijesACargo;
		this.tieneConyugeACargo = tieneConyugeACargo;
		this.inicioRelacionLaboral = LocalDate.now();
		this.contratos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCuil() {
		return cuil;
	}
	public void setCuil(int cuil) {
		this.cuil = cuil;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean isTieneHijesACargo() {
		return tieneHijesACargo;
	}
	public void setTieneHijesACargo(boolean tieneHijesACargo) {
		this.tieneHijesACargo = tieneHijesACargo;
	}
	public boolean isTieneConyugeACargo() {
		return tieneConyugeACargo;
	}
	public void setTieneConyugeACargo(boolean tieneConyugeACargo) {
		this.tieneConyugeACargo = tieneConyugeACargo;
	}
	public List<Contrato> getContratosVencidos() {
		return contratos;
	}
	public LocalDate getInicioRelacionLaboral() {
		return inicioRelacionLaboral;
	}

	public void cargarContrato(Contrato contrato) {
		this.contratoActual.setFechaFin(LocalDate.now());
		this.contratos.add(this.contratoActual);
		this.contratoActual = contrato;
	}
	
	public boolean contratoActualVencido() {
		if (this.contratoActual.getFechaFin()==null) {
			return false;
		} else {
			return this.contratoActual.getFechaFin().isBefore(LocalDate.now());
		}
	}
	
	public ReciboDeCobro generarRecibo() {
		return this.contratoActual.generarRecibo(this);
	}

}

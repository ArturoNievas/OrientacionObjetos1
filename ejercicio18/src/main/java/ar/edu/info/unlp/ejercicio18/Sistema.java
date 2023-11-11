package ar.edu.info.unlp.ejercicio18;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

public class Sistema {

	private List<Empleado> nomina;

	public Sistema() {
		this.nomina = new ArrayList<>();
	}
	
	public void altaEmpleado(String nombre, String apellido, int cuil, LocalDate fechaNacimiento, boolean tieneConyugeACargo,  boolean tieneHijesACargo) {
		this.nomina.add(new Empleado(nombre,apellido,cuil,fechaNacimiento,tieneConyugeACargo,tieneHijesACargo));
	}
	
	public Empleado buscarEmpleado(int cuil) {
		return this.nomina.stream().filter(e -> e.getCuil()==cuil).findFirst().orElse(null);
	}
	
	public void bajaEmpleado(Empleado empleado) {
		this.nomina.remove(empleado);
	}
	
	public void cargarContratoPorHoras(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFin, double valorHora, int horasATrabajar) {
		empleado.cargarContrato(new ContratoPorHoras(fechaInicio,fechaFin,valorHora,horasATrabajar));
	}
	
	public void cargarContratoPermanente(Empleado empleado, LocalDate fechaInicio, double sueldoMensual, double montoPorConyugeACargo, double montoPorHijesACargo) {
		empleado.cargarContrato(new ContratoPermanente(fechaInicio,sueldoMensual,montoPorConyugeACargo,montoPorHijesACargo));
	}
	
	public List<Empleado> empleadosConContratosVencidos() {
		return this.nomina.stream().filter(e -> e.contratoActualVencido()).collect(Collectors.toList());
	}

	public List<ReciboDeCobro> generarRecibos(){
		return this.nomina.stream().filter(e -> !e.contratoActualVencido()).map(e -> e.generarRecibo()).collect(Collectors.toList());
	}
	
}

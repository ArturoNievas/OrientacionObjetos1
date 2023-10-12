package ar.edu.info.unlp.ejercicio15;

import java.util.*;

public class Propiedad {

	private String nombre;
	private String descripccion;
	private double precioPorNoche;
	private String direccion;
	private List<Reserva> reservas;
	private PoliticaCancelacion politicaCancelacion;
	
	public Propiedad(String nombre, String descripccion, double precioPorNoche, String direccion, PoliticaCancelacion politicaCancelacion) {
		this.nombre = nombre;
		this.descripccion = descripccion;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;
		this.politicaCancelacion = politicaCancelacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripccion() {
		return descripccion;
	}

	public void setDescripccion(String descripccion) {
		this.descripccion = descripccion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void reservar(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void cancelarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public boolean disponible(DateLapse periodo) {
		return this.reservas.stream().filter(r -> r.getPeriodo().overlaps(periodo)).findFirst().orElse(null) == null;
	}
	// Acá no sabría como tomar tambien los días de las reservas que no están del todo incluidas en el periodo de tiempo provisto
	public double ingresosPorPeriodo(DateLapse periodo) {
		return this.reservas.stream().filter(r -> periodo.includesDateLapse(r.getPeriodo())).mapToDouble(r -> r.calcularPrecio()).sum();
	}
	
}

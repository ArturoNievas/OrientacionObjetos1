package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class Propiedad {

	private String nombre;
	private String descripccion;
	private double precioPorNoche;
	private String direccion;
	private List<Reserva> reservas;
	private PoliticaCancelacion politica;
	
	public Propiedad(String nombre, String descripccion, double precioPorNoche, String direccion, PoliticaCancelacion politica) {
		this.nombre = nombre;
		this.descripccion = descripccion;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;
		this.politica = politica;
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
	
	public List<Reserva> getReservasUsuario(Usuario usuario) {
		return this.reservas.stream().filter(r -> r.getUsuario().equals(usuario)).collect(Collectors.toList());
	}
	
	public void reservar(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public double montoAReembolsar(Reserva reserva) {
		return this.politica.montoReembolsoCancelacion(reserva,LocalDate.now());
	}
	
	public void cancelarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public boolean disponible(DateLapse periodo) {
		return this.reservas.stream().filter(r -> r.getPeriodo().overlaps(periodo)).findFirst().orElse(null) == null;
	}
	
	public boolean reservaCorresponde(Reserva reserva) {
		return this.reservas.contains(reserva);
	}
	
	public double ingresosPorPeriodo(DateLapse periodo) {
		return this.reservas.stream().mapToDouble(r -> periodo.daysOverlaps(r.getPeriodo())*r.getPrecioPorNoche()).sum();
	}
	
}

package ar.edu.info.unlp.ejercicio15;

import java.util.*;

public class Usuario {

	private String nombre;
	private int dni;
	private String direccion;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.propiedades = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}
	
	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void registrarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void reservar(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void cancelarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public double ingresosPorPeriodo(DateLapse periodo) {
		return this.propiedades.stream().mapToDouble(p -> p.ingresosPorPeriodo(periodo)).sum();
	}

}

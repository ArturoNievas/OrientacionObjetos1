package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;
import java.util.*;

public abstract class Persona {

	protected String nombre;
	protected String direccion;
	protected List<Telefono> telefonos;
	
	public Persona(String nombre, String direccion, Telefono telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefonos = new ArrayList<>();
		this.telefonos.add(telefono);
	}
	
	public void altaLinea(Telefono telefono) {
		this.telefonos.add(telefono);
	}
	
	public void bajaLinea(Telefono telefono) {
		this.telefonos.remove(telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public double montoAFacturar(DateLapse periodo) {
		return this.telefonos.stream().mapToDouble(t -> t.gastosPeriodo(periodo)).sum();
	}
	
	public Factura facturarPeriodo(DateLapse periodo) {
		return new Factura(periodo,LocalDate.now(),this.montoAFacturar(periodo),this);
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}
	
}

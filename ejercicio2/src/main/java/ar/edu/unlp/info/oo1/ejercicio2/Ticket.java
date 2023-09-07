package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.List;

public class Ticket {

	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos;
	
	public List<Producto> getProductos() {
		return productos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public Ticket(List<Producto> productos,int cant, double peso, double precio) {
		this.fecha=LocalDate.now();
		this.cantidadDeProductos=cant;
		this.pesoTotal=peso;
		this.precioTotal=precio;
		this.productos=productos;
	}
	
	public double impuesto() {
		return this.precioTotal*0.21;
	}
}

package ar.edu.info.unlp.ejercicio19;

import java.util.*;
import java.util.stream.Collectors;

public class Vendedor extends Persona{

	private List<Producto> productos;

	public Vendedor(String nombre, String direccion) {
		super(nombre, direccion);
		this.productos = new ArrayList<>();
	}
	
	public Producto ponerProductoALaVenta(String nombre, String descripcion, double precio, int unidadesDisponibles, Vendedor vendedor) {
		Producto p = new Producto(this,nombre,descripcion,precio,unidadesDisponibles);
		this.productos.add(p);
		return p;
	}
	
	public List<Producto> buscarProducto(String nombre){
		return this.productos.stream().filter(p -> p.getNombre().equals(nombre)).collect(Collectors.toList());
	}
	
}

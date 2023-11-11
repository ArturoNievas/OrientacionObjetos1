package ar.edu.info.unlp.ejercicio19;

import java.util.*;
import java.util.stream.Collectors;

public class Sistema {

	private List<Cliente> clientes;
	private List<Vendedor> vendedores;
	
	public Sistema() {
		this.clientes = new ArrayList<>();
		this.vendedores = new ArrayList<>();
	}
	
	public Persona registrarVendedor(String nombre, String direccion) {
		Vendedor v = new Vendedor(nombre,direccion);
		this.vendedores.add(v);
		return v;
	}
	
	public Persona buscarVendedor(String nombre) {
		return this.vendedores.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
	public Persona registrarCliente(String nombre, String direccion) {
		Cliente c = new Cliente(nombre,direccion);
		this.clientes.add(c);
		return c;
	}
	
	public Persona buscarCliente(String nombre) {
		return this.clientes.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
	public Producto ponerProductoALaVenta(String nombre, String descripcion, double precio, int unidadesDisponibles, Vendedor vendedor) {
		return vendedor.ponerProductoALaVenta(nombre, descripcion, precio, unidadesDisponibles, vendedor);
	}
	
	public List<Producto> buscarProducto(String nombre){
		return this.vendedores.stream().map(p -> p.buscarProducto(nombre)).flatMap(List::stream).collect(Collectors.toList());
	}
	
	public Pedido crearPedido(Cliente cliente, Producto producto, int cantidad, MedioDePago pago, MecanismoDeEnvio envio) {
		if (producto.disponible(cantidad)) {
			producto.retirarUnidades(cantidad);
			return cliente.crearPedido(producto, cantidad, pago, envio);
		} else {
			return null;
		}
	}
	
	public double costoPedido(Pedido pedido) {
		return pedido.costoPedido();
	}
}

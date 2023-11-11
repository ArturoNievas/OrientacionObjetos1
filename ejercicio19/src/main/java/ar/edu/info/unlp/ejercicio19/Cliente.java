package ar.edu.info.unlp.ejercicio19;

import java.util.*;

public class Cliente extends Persona {

	private List<Pedido> pedidos;
	
	public Cliente(String nombre, String direccion) {
		super(nombre, direccion);
		this.pedidos = new ArrayList<>();
	}
	
	public Pedido crearPedido(Producto producto, int cantidad, MedioDePago pago, MecanismoDeEnvio envio) {
		Pedido p = new Pedido(this.direccion,producto,cantidad,pago,envio);
		this.pedidos.add(p);
		return p;
	}
}

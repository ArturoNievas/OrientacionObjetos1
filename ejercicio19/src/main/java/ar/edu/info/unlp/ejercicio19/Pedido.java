package ar.edu.info.unlp.ejercicio19;

public class Pedido {

	private Producto producto;
	private int cantidad;
	private MedioDePago pago;
	private MecanismoDeEnvio envio;
	private String destino;
	
	public Pedido(String direccion, Producto producto, int cantidad, MedioDePago pago, MecanismoDeEnvio envio) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.pago = pago;
		this.envio = envio;
		this.destino = direccion;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public MedioDePago getPago() {
		return pago;
	}

	public MecanismoDeEnvio getEnvio() {
		return envio;
	}
	
	public double costoPedido() {
		return this.cantidad*this.producto.getPrecio()*(1+pago.recargo()/100) + envio.costoEnvio(new Trayecto(this.destino,producto.getVendedor().getDireccion()));
	}
	
}

package ar.edu.info.unlp.ejercicio11;

public class InversionEnAcciones extends Inversion {

	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	protected double valorActual() {
		return this.cantidad*this.valorUnitario;
	}

}

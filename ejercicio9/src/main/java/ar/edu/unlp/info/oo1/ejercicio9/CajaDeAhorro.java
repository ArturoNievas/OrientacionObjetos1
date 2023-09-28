package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		super();
	}

	@Override
	public boolean extraer(double monto) {
		return super.extraer(monto*1.02);
	}

	@Override
	public void depositar(double monto) {
		super.depositar(monto*0.98);
	}


}

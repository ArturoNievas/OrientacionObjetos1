package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		super();
	}

	protected void extraerSinControlar(double monto){
		super.extraerSinControlar(monto*1.02);
	}

	@Override
	public boolean puedoExtraer(double monto) {
		return (this.getSaldo() *1.02) >= monto;
	}
}

package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta {

	private double descubierto;

	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public boolean puedoExtraer(double monto) {
		return (this.getSaldo() + this.descubierto) >= monto;
	}

	@Override
	public boolean extraer(double monto) {
		if (this.puedoExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedoExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		} else {
			return false;
		}
	}

}

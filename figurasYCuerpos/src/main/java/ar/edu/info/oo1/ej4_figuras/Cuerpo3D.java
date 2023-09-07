package ar.edu.info.oo1.ej4_figuras;

public class Cuerpo3D {

	private double altura;
	private Figura2D caraBasal;
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getSuperficieExterior() {
		return this.caraBasal.getArea()*2 + this.altura*this.caraBasal.getPerimetro();
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea()*this.altura;
	}
}

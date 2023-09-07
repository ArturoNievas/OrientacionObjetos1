package ar.edu.info.oo1.ej4_figuras;

public class Circulo extends Figura2D {

	private double radio;
	private double diametro;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio*2;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = diametro/2;
	}
	
	public double getPerimetro() {
		return this.radio*2*Math.PI;
	}
	
	public double getArea() {
		return this.radio*this.radio*Math.PI;
	}
}

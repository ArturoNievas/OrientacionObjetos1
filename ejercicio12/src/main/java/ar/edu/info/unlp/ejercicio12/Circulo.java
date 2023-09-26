package ar.edu.info.unlp.ejercicio12;

public class Circulo extends Figura2D {

	private double radio;
	
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return this.radio*2;
	}
	public void setDiametro(double diametro) {
		this.radio = diametro/2;
	}
	
	public double getPerimetro() {
		return this.radio*2*Math.PI;
	}
	
	public double getArea() {
		return this.radio*this.radio*Math.PI;
	}
}

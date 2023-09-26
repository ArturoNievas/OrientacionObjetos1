package ar.edu.info.unlp.ejercicio12;

public class Rectangulo extends Figura2D {

	private double base;
	private double altura;

	public Rectangulo() {
		this.base = 0;
		this.altura = 0;
	}
	
	public Rectangulo(double lado1, double lado2) {
		this.base = lado1;
		this.altura = lado2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPerimetro() {
		return this.base*2 + this.altura*2;
	}
	
	public double getArea() {
		return this.base*this.altura;
	}
}

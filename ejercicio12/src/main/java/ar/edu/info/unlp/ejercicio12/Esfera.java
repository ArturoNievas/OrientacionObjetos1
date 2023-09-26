package ar.edu.info.unlp.ejercicio12;

public class Esfera extends Pieza {

	private double radio;
	
	public Esfera() {
		super();
		this.radio = 0;
	}
	
	public Esfera(String material, String color, double radio) {
		super(material,color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double getVolumen() {
		return 4*Math.PI*Math.pow(this.radio,3)/3;
	}

	@Override
	public double getSuperficieExterior() {
		return 4*Math.PI*Math.pow(this.radio,2);
	}

}

package ar.edu.info.unlp.ejercicio12;

public class SolidoCilindrico extends Pieza {

	private double altura;
	private Figura2D caraBasal;
	
	public SolidoCilindrico() {
		super();
		this.altura = 0;
	}
	
	public SolidoCilindrico(String material, String color, Figura2D caraBasal, double altura) {
		super(material,color);
		this.altura = altura;
		this.caraBasal = caraBasal;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public Figura2D getCaraBasal() {
		return this.caraBasal;
	}
	
	public double getSuperficieExterior() {
		return this.caraBasal.getArea()*2 + this.altura*this.caraBasal.getPerimetro();
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea()*this.altura;
	}
}

package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero() {
		this.madre = null;
		this.padre = null;
	}
	public Mamifero(String identificador) {
		this.identificador = identificador;
		this.madre = null;
		this.padre = null;
	}
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero madre, Mamifero padre) {
		this.identificador = identificador;
		this.especie = especie;
		this.fechaNacimiento = fechaNacimiento;
		this.madre = madre;
		this.padre = padre;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaNacimiento = fechaDeNacimiento;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre!=null) {
			return this.madre.getMadre();
		} else {
			return null;
		}
	}
	public Mamifero getAbueloMaterno() {
		if (this.madre!=null) {
			return this.madre.getPadre();
		} else {
			return null;
		}
	}
	public Mamifero getAbuelaPaterna() {
		if (this.padre!=null) {
			return this.padre.getMadre();
		} else {
			return null;
		}
	}
	public Mamifero getAbueloPaterno() {
		if (this.padre!=null) {
			return this.padre.getPadre();
		} else {
			return null;
		}
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if (this.madre!=null && this.padre!=null) {
			if (this.madre.equals(unMamifero) || this.padre.equals(unMamifero)) {
				return true;
			} else {
				return this.madre.tieneComoAncestroA(unMamifero) || this.padre.tieneComoAncestroA(unMamifero);
			}
		} else if (this.madre!=null) {
			if (this.madre.equals(unMamifero)) {
				return true;
			} else {
				return this.madre.tieneComoAncestroA(unMamifero);
			}
		} else if (this.padre!=null) {
			if (this.padre.equals(unMamifero)) {
				return true;
			} else {
				return this.padre.tieneComoAncestroA(unMamifero);
			}
		} else {
			return false;
		}
	}
	
}

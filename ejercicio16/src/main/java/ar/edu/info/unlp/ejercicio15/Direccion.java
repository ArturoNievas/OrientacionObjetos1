package ar.edu.info.unlp.ejercicio15;

public class Direccion {

	private String pais;
	private String provincia;
	private String ciudad;
	private String calle;
	private int numero;
	private int piso;
	private String departamento;
	
	public Direccion() {
		
	}

	public Direccion(String pais, String provincia, String ciudad, String calle, int numero) {
		this.pais = pais;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.piso = 0;
		this.departamento = "";
	}

	public Direccion(String pais, String provincia, String ciudad, String calle, int numero, int piso,
			String departamento) {
		this.pais = pais;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String toString() {
		String retorno=this.pais+", "+this.provincia+", "+this.ciudad+", "+this.calle+", "+this.numero;
		if ((this.piso == 0) && (this.departamento == "")) {
			retorno+=", "+this.piso+this.departamento;
		}
		retorno+=".";
		return retorno;
	}
	
}

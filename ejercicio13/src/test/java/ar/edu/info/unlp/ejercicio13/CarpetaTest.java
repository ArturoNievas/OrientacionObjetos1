package ar.edu.info.unlp.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {

	private Carpeta carpeta1;
	private Carpeta carpeta2;
	private Email email1;
	private Email email2;
	

	@BeforeEach
	public void setUp() {
		this.carpeta1 = new Carpeta("Notificaciones");
		this.carpeta2 = new Carpeta("Promociones");
		this.email1 = new Email("Congreso","La acreditacion de pago...");
		this.email2 = new Email("Ingenieria","Se debe recordar que ante todo somos educadores...");
		this.carpeta1.agregarCorreo(email1);
		this.carpeta1.agregarCorreo(email2);
	}

	@Test
	public void testCarpeta() {
		assertEquals("Notificaciones", this.carpeta1.getNombre());
		assertEquals("Promociones", this.carpeta2.getNombre());
	}

	@Test
	public void testAgregarCorreo() {
		assertEquals(2, this.carpeta1.getEmails().size());
		assertEquals(0, this.carpeta2.getEmails().size());
	}
	
	@Test
	public void testEliminarCorreo() {
		assertEquals(2, this.carpeta1.getEmails().size());
		this.carpeta1.eliminarCorreo(email1);
		assertEquals(1, this.carpeta1.getEmails().size());
	}
	
	@Test
	public void testBuscar() {
		assertEquals(this.email1, this.carpeta1.buscar("ng"));
		assertNull(this.carpeta1.buscar("sarasa"));
	}
}
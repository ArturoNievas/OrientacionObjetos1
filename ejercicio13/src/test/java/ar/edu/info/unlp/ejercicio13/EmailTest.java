package ar.edu.info.unlp.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {

	private Email email;

	@BeforeEach
	public void setUp() {
		this.email = new Email("Evento Canarias","Le escribo para informarle...");
	}

	@Test
	public void testEmail() {
		assertEquals("Evento Canarias", this.email.getTitulo());
		assertEquals("Le escribo para informarle...", this.email.getCuerpo());
		assertEquals(0,this.email.adjuntos().size());
	}

	@Test
	public void testAdjuntarArchivo() {
		Archivo a1 = new Archivo("Papeles");
		Archivo a2 = new Archivo("abcde");
		this.email.adjuntarArchivo(a2);
		this.email.adjuntarArchivo(a1);
		assertEquals(2, this.email.adjuntos().size());
	}
}

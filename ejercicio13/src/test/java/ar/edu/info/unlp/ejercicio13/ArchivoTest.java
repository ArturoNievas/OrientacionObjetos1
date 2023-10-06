package ar.edu.info.unlp.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {

	private Archivo archivo;

	@BeforeEach
	public void setUp() {
		archivo = new Archivo("Facturas");
	}

	@Test
	public void testInicializar() {
		assertEquals("Facturas", archivo.getNombre());
	}

	@Test
	public void testTamanio() {
		assertEquals(8, archivo.tamanio());
	}

}

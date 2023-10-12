package ar.edu.info.unlp.ejercicio15;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {
	
	private Sistema sistema;
	
	@BeforeEach
	public void setup() {
		this.sistema = new Sistema();

		this.sistema.registrarPropiedad("Solar", "Precioso solar frente al lago", 60000, "Los alerces y los jacintos");
		this.sistema.registrarPropiedad("Maruchan", "Monoambiente piso 34 por escalera", 1000, "Constitucion y Alberti");
		this.sistema.registrarPropiedad("Dumbledore", "PH primer piso ambiente tranquilo", 10000, "7 y 50");
		
		this.sistema.registrarUsuario("Arturo Nievas", "5 y 50", 37140069);
		this.sistema.registrarUsuario("Esteban Quito", "13 y 60", 54485267);
	}
	
	@Test
	public void testReservar() {
		Propiedad p1 = this.sistema.registrarPropiedad("Solar", "Precioso solar frente al lago", 60000, "Los alerces y los jacintos");
		assertEquals(p1,this.sistema.getPropiedades().get(0));
	}	
}

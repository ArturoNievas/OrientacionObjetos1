package ar.edu.info.unlp.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
import org.junit.jupiter.api.*;

public class SistemaTest {

	private Sistema sistema;
    
    @BeforeEach
    public void setUp() {
        sistema = new Sistema();
    }

    @Test
    public void testAltaNumero() {
        sistema.altaNumero(123456789);
        assertEquals(1, sistema.getTelefonosDisponibles().size());
    }

    @Test
    public void testAltaPersonaFisica() {
        sistema.altaNumero(123456789);
        sistema.altaPersonaFisica("Juan", "Calle 123", 123456789);
        assertEquals(1, sistema.getClientes().size());
    }

    @Test
    public void testAltaPersonaJuridica() {
        sistema.altaNumero(123456789);
        sistema.altaPersonaJuridica("Empresa S.A.", "Avenida 456", 987654321, "Sociedad Anónima");
        assertEquals(1, sistema.getClientes().size());
    }

    @Test
    public void testAltaLineaCliente() {
        sistema.altaNumero(123456789);
        sistema.altaPersonaFisica("Juan", "Calle 123", 123456789);
        Persona cliente = sistema.getClientes().get(0);
        sistema.altaLineaCliente(cliente);
        assertEquals(1, cliente.getTelefonos().size());
    }

    @Test
    public void testBajaLineaCliente() {
        sistema.altaNumero(123456789);
        sistema.altaPersonaFisica("Juan", "Calle 123", 123456789);
        Persona cliente = sistema.getClientes().get(0);
        sistema.altaLineaCliente(cliente);
        Telefono telefono = cliente.getTelefonos().get(0);
        sistema.bajaLineaCliente(cliente, telefono);
        assertEquals(0, cliente.getTelefonos().size());
        assertEquals(1, sistema.getTelefonosDisponibles().size());
    }

    @Test
    public void testRegistrarLlamadaLocal() {
        sistema.altaNumero(123456789);
        Telefono telefonoOrigen = sistema.getTelefonosDisponibles().get(0);
        sistema.altaNumero(987654321);
        Telefono telefonoDestino = sistema.getTelefonosDisponibles().get(1);
        Llamada llamada = sistema.registrarLlamadaLocal(LocalDate.now(), LocalTime.now(), 10, telefonoOrigen, telefonoDestino);
        assertNotNull(llamada);
    }
}

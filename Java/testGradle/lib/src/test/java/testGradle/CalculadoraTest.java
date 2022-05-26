package testGradle;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Test de la clase Calculadora")
public class CalculadoraTest {
	
	@Test
	@DisplayName("Método para comprobar suma")
	public void sumaTest() {
		Calculadora sumaCalc = new Calculadora ();
		Assertions.assertEquals(2, sumaCalc.suma(1,1),"El resultado deberia ser 2.");
	}
	@Test
	@DisplayName("Método para comprobar assertions")
	public void assertionTest() {
		//boolean valorBoolean = true;
		//assertTrue(valorBoolean);
		
		assertAll(
		"Encabezado",
		() -> assertEquals(2, 1+1, "Debería ser 2"),
		() -> assertTrue(true, "Debería ser true")
				);
	}
}

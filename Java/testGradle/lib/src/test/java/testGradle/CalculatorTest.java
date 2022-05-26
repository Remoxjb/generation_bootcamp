package testGradle;

import org.junit.jupiter.api.*;

public class CalculatorTest {
	
	@Test
	@DisplayName("Test de addNumber")
	public void addTest() {
		CalculatorTDD addCalc = new CalculatorTDD();
		Assertions.assertEquals(95,addCalc.addNumbers(63, 32),"El resultado debe ser 5 ");
	}
	
	@Test
	@DisplayName("Test de subtrac")
	public void subtracTest() {
		CalculatorTDD subtracTest = new CalculatorTDD();
		Assertions.assertEquals(15,subtracTest.subtracNumber(140,125),"El resultado debe ser 15");
	}
	
	@Test
	@DisplayName("Test de multiply")
	public void multiplyTest() {
		CalculatorTDD multiplyTest = new CalculatorTDD();
		Assertions.assertEquals(48,multiplyTest.multiplyNumbers(8, 6), "El resultado debe ser 48");
	}
	
	@Test
	@DisplayName("Test de divide")
	public void divideTest() {
		CalculatorTDD divideTest = new CalculatorTDD();
		Assertions.assertEquals(6.25,divideTest.divideNumbers(25, 4), "El resultado debe ser 5");
	}
	
}

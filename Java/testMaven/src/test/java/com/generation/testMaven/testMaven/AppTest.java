package com.generation.testMaven.testMaven;

import org.junit.jupiter.api.*;

public class AppTest 
{
    @Test
	public void saludoTest() {
    	App saludo = new App();
    	Assertions.assertEquals("Hola Mundo!", saludo.saludo()); //asserEquals hace una comparacion en con el resultado esperado con el obtenido
    }
    
    @Test
    public void saludosStaticTest() {
    	Assertions.assertEquals("Hola Mundo!", App.saludoStatic());
    }
}

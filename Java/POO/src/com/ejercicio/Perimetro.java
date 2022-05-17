package com.ejercicio;

public class Perimetro {
	
	public void mensaje () {
		System.out.println("Vas a calcular un perimetro");
	}
	
	public int perimetroTriangulo(int a, int b, int c) {
		return (a + b + c);
	}
	
	public int perimetroCuadrado (int lado) {
		return (lado * 4);
	}
	
	public double perimetroCirculo (int radio) {
		return ((2 * 3.1416)* radio);
	}
	

}

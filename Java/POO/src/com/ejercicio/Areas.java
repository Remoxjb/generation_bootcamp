package com.ejercicio;

public class Areas {
	
	public void mensaje () {
		System.out.println("Vas a calcular el area");
	}
	
	public int areaTriangulo (int base, int altura) {
		return ((base*altura)/2);
	}
	
	public int areaCuadrado(int lado) {
		return lado * lado;
	}
	
	public double areaCirculo(double radio) {
		return (3.1416 * (radio*radio));
		
	}
}

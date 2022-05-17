package com.ejercicio;

public class CalculadoraGeometrica {

	public static void main(String[] args) {
		
		Perimetro perimetro = new Perimetro ();
		
		perimetro.mensaje();
		
		int perimetroCua = perimetro.perimetroCuadrado(7);
		System.out.println("El perimetro del cuadrado es "+perimetroCua);
		
		int perimetroTria = perimetro.perimetroTriangulo(5,6,12);
		System.out.println("El perimetro del triangulo es "+perimetroTria);
		
		double perimetroCirc = perimetro.perimetroCirculo(4);
		System.out.println("El perimetro del circulo es "+perimetroCirc);
		
		Areas area = new Areas();
		
		area.mensaje();
		
		int areaCua = area.areaCuadrado(7);
		System.out.println("El area del cuadrado es " +areaCua);
		
		int areaTria = area.areaTriangulo(7, 6);
		System.out.println("El area del triangulo es " + areaTria);
		
		double areaCirc = area.areaCirculo(4);
		System.out.println("El area del circulo es " + areaCirc);
		

	}

}

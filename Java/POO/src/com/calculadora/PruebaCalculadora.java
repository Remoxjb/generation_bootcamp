package com.calculadora;

import java.util.Scanner;

public class PruebaCalculadora {

	public static void main(String[] args) {
		
		//Instanciar - Crear un objeto a partir de una clase
		Calculadora cal = new Calculadora();
		
		//metodo que no retorna nada
		cal.sumarMensaje();
		
		//metodo que regresa un valor
		String mensaje = cal.mensaje();
		System.out.println(mensaje);
		
		
		//metodos con parametros
		int suma =cal.sumar(10, 20);
		System.out.println(suma);
		
		cal.sumarM(8, 5);
		
		int resta = cal.restar(8, 1);
		System.out.println(resta);
		
		//intanciar
		
			Areas calAreas = new Areas();
			
			calAreas.mensaje();
			
			int areaC = calAreas.areaCuadro(10);
			System.out.println(areaC);
			
			double areaT = calAreas.areaTriangulo(15, 20);
			System.out.println(areaT);
		
	}
	
	

}
